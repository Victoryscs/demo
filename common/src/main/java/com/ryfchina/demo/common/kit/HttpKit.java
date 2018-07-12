package com.ryfchina.demo.common.kit;

import com.ryfchina.demo.common.constant.C;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.*;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.swing.text.DefaultStyledDocument;
import java.io.*;
import java.net.SocketTimeoutException;
import java.net.URLEncoder;
import java.nio.charset.CodingErrorAction;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * HTTPCLIENT4 带连接池的HTTP/HTTPS请求工具类
 */
public class HttpKit {

	private static Logger logger = LoggerFactory.getLogger(HttpKit.class);

	private static PoolingHttpClientConnectionManager connManager = null;

	private static CloseableHttpClient httpclient = null;

	/*** 连接失败重试次数 */
	private static Integer retryCount = 3;

	/*** 连接池最大连接数 */
	private static final Integer connMaxTotal = 200;

	private static final Integer maxPerRoute = 20;

	/*** 连接超时时间 */
	private static final Integer connectTimeout = 70 * 1000;

	/*** 请求超时时间 */
	private static final Integer connectRequestTimeout = 5 * 1000;

	/*** socket超时时间 */
	private static final Integer socketTimeout = 180 * 1000;

	static {
		try {
			SSLContext sslContext = SSLContexts.custom().useTLS().build();
			sslContext.init(null, new TrustManager[] { new X509TrustManager() {
				@Override
				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				@Override
				public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
				}

				@Override
				public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
				}
			} }, null);

			Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create()
					.register("http", PlainConnectionSocketFactory.INSTANCE)
					.register("https", new SSLConnectionSocketFactory(sslContext,
							SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER))
					.build();

			connManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);

			httpclient = HttpClients.custom().setConnectionManager(connManager)
					.setRetryHandler(new DefaultHttpRequestRetryHandler(retryCount, false)).build();

			// Create socket configuration
			SocketConfig socketConfig = SocketConfig.custom().setTcpNoDelay(true).build();
			connManager.setDefaultSocketConfig(socketConfig);

			// Create message constraints
			MessageConstraints messageConstraints = MessageConstraints.custom().setMaxHeaderCount(200)
					.setMaxLineLength(2000).build();
			// Create connection configuration
			ConnectionConfig connectionConfig = ConnectionConfig.custom()
					.setMalformedInputAction(CodingErrorAction.IGNORE)
					.setUnmappableInputAction(CodingErrorAction.IGNORE).setCharset(Consts.UTF_8)
					.setMessageConstraints(messageConstraints).build();

			connManager.setDefaultConnectionConfig(connectionConfig);
			connManager.setMaxTotal(connMaxTotal);
			connManager.setDefaultMaxPerRoute(maxPerRoute);

		} catch (KeyManagementException e) {
			logger.error("执行HttpKit.static initializer()方法,发生KeyManagementException异常：{}", e);
		} catch (NoSuchAlgorithmException e) {
			logger.error("执行HttpKit.static initializer()方法,发生NoSuchAlgorithmException异常：{}", e);
		}
	}

	/**
	 * Post请求 不区分http或https
	 * 
	 * @param url 请求地址
	 * @param params 参数
	 * @param encoding 请求编码
	 * @return
	 */
	public static String post(String url, String params, String encoding, String token) {
		if (url.startsWith("http://")) {
			return postJsonBody(url, params, encoding, token);
		} else {
			return connectPostHttps(url, params, encoding, token);
		}
	}

	/**
	 * Post请求 不区分http或https
	 * 
	 * @param url 请求地址
	 * @param params 参数
	 * @param encoding 请求编码
	 * @return
	 */
	public static String post(String url, Map<String, Object> params, String encoding, String token) {
		return post(url, JacksonKit.toJson(params), encoding, token);
	}

	/**
	 * post方法
	 * 
	 * @param url 请求地址
	 * @param str1 参数
	 * @param encoding 编码
	 * @param token token
	 * @return 响应信息
	 *
	 */
	public static String postJsonBody(String url, String str1, String encoding, String token) {
		logger.info("进入HttpKit.postJsonBody()方法......,入参:[url, str1, encoding, token]：{},{},{},{}", url, str1, encoding,
				token);
		HttpPost post = new HttpPost(url);
		try {
			post.setHeader("Content-type", C.ContentType.JSON);
			if (!StringKit.isEmpty(token)) {
				post.setHeader("token", token);
			}
			RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout)
					.setConnectTimeout(connectTimeout).setConnectionRequestTimeout(connectRequestTimeout)
					.setExpectContinueEnabled(false).build();
			post.setConfig(requestConfig);
			post.setEntity(new StringEntity(str1, encoding));
			logger.info("[HttpUtils Post] begin invoke url:" + url + " , params:" + str1);
			CloseableHttpResponse response = httpclient.execute(post);
			try {
				// 连接响应状态,防止返回非200状态过多连接不释放
				int status = response.getStatusLine().getStatusCode();
				HttpEntity entity = response.getEntity();
				try {
					// 防止返回非200状态过多连接不释放
					if (status >= 200 && status < 300) {
						if (entity != null) {
							String str = EntityUtils.toString(entity, encoding);
							logger.info("执行HttpKit.postJsonBody()方法完毕......,出参:[url, str]：{},{}", url, str);
							return str;
						}
					} else {
						post.abort();
						throw new ClientProtocolException("Unexpected response status: " + status);
					}
				} finally {
					if (entity != null) {
						entity.getContent().close();
					}
				}
			} finally {
				if (response != null) {
					response.close();
				}
			}
		} catch (UnsupportedEncodingException e) {
			logger.error("执行HttpKit.postJsonBody()方法,发生UnsupportedEncodingException异常：{}", e);
		} catch (Exception e) {
			logger.error("执行HttpKit.postJsonBody()方法,发生Exception异常：{}", e);
		} finally {
			post.releaseConnection();
		}
		return "";
	}

	public static String get(String url) {
		return get(url, null);
	}

	public static String get(String url, Map<String, String> params) {
		logger.info("进入HttpKit.get()方法......,入参:[url, params]：{}", url, params);
		String responseString = null;
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout)
				.setConnectTimeout(connectTimeout).setConnectionRequestTimeout(connectRequestTimeout).build();
		StringBuilder sb = new StringBuilder();
		sb.append(url);
		int i = 0;
		if (params != null) {
			for (Entry<String, String> entry : params.entrySet()) {
				if (i == 0 && !url.contains("?")) {
					sb.append("?");
				} else {
					sb.append("&");
				}
				sb.append(entry.getKey());
				sb.append("=");
				String value = entry.getValue();
				try {
					sb.append(URLEncoder.encode(value, C.Charset.UTF8));
				} catch (UnsupportedEncodingException e) {
					logger.error("encode http get params error, content is:{},{}", value, e);
					sb.append(URLEncoder.encode(value));
				}
				i++;
			}
		}
		logger.info("[HttpKit Get] begin invoke:" + sb.toString());
		HttpGet get = new HttpGet(sb.toString());
		get.setConfig(requestConfig);
		try {
			CloseableHttpResponse response = httpclient.execute(get);
			try {
				HttpEntity entity = response.getEntity();
				try {
					if (entity != null) {
						responseString = EntityUtils.toString(entity, C.Charset.UTF8);
					}
				} finally {
					if (entity != null) {
						entity.getContent().close();
					}
				}
			} catch (Exception e) {
				logger.error(String.format("[HttpKit Get]get response error, url:%type", sb.toString()), e);
				return responseString;
			} finally {
				if (response != null) {
					response.close();
				}
			}
			logger.info("执行HttpKit.get()方法完毕......,出参:[url, responseString]：{}", url, responseString);
		} catch (SocketTimeoutException e) {
			logger.error("执行HttpKit.get()方法,发生SocketTimeoutException异常,url:{},异常信息:{}", sb.toString(), e);
			return responseString;
		} catch (Exception e) {
			logger.error("执行HttpKit.get()方法,发生Exception异常,url:{},异常信息:{}", sb.toString(), e);
		} finally {
			get.releaseConnection();
		}
		return responseString;
	}

	/**
	 * https请求
	 * 
	 * @param reqURL
	 * @param content
	 * @param charset
	 * @return
	 */
	public static String connectPostHttps(String reqURL, String content, String charset, String token) {
		logger.info("进入HttpKit.connectPostHttps()方法......,入参:[reqURL, content, charset, token]：{},{},{},{}", reqURL,
				content, charset, token);
		String responseContent = null;
		HttpPost httpPost = new HttpPost(reqURL);
		httpPost.setHeader("Content-type", C.ContentType.JSON);
		if (!StringKit.isEmpty(token)) {
			httpPost.setHeader("token", "token");
		}
		try {
			RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout)
					.setConnectTimeout(connectTimeout).setConnectionRequestTimeout(connectRequestTimeout).build();
			List<NameValuePair> formParams = new ArrayList<NameValuePair>();
			httpPost.setEntity(new UrlEncodedFormEntity(formParams, Consts.UTF_8));
			httpPost.setConfig(requestConfig);
			ByteArrayEntity byteArrayEntity = null;
			if (!StringUtils.isBlank(content)) {
				byteArrayEntity = new ByteArrayEntity(content.getBytes(charset));
				httpPost.setEntity(byteArrayEntity);
			}
			CloseableHttpResponse response = httpclient.execute(httpPost);
			try {
				// 执行POST请求
				HttpEntity entity = response.getEntity(); // 获取响应实体
				try {
					if (null != entity) {
						responseContent = EntityUtils.toString(entity, Consts.UTF_8);
					}
				} finally {
					if (entity != null) {
						entity.getContent().close();
					}
				}
			} finally {
				if (response != null) {
					response.close();
				}
			}
			logger.info("执行HttpKit.connectPostHttps()方法,requestURI : " + httpPost.getURI() + ", responseContent: "
					+ responseContent);
		} catch (ClientProtocolException e) {
			logger.error("执行HttpKit.connectPostHttps()方法,发生ClientProtocolException异常：{}", e);
		} catch (IOException e) {
			logger.error("执行HttpKit.connectPostHttps()方法,发生IOException异常：{}", e);
		} finally {
			httpPost.releaseConnection();
		}
		return responseContent;
	}

	/**
	 * 该https 的POST 请求body内容不是JSON格式 而是key=content form表单形式的 如：
	 * appid=00010398&cusid=990521082996000&date=20170614&key=allinpay888
	 * &randomstr=201706151807057140000000000001&sign=F0AE20D017C634FC8094E0BDD0300FC7 timeOut: 70S超时
	 * 
	 * @param reqURL
	 * @param content
	 * @param charset
	 * @return
	 */
	public static String connectPostHttpsByForm(String reqURL, String content, String charset) {
		logger.info("进入HttpKit.connectPostHttpsByForm()方法......,入参:[reqURL, content, charset]：{},{},{}", reqURL,
				content, charset);
		String responseContent = null;
		HttpPost httpPost = new HttpPost(reqURL);
		httpPost.setHeader("Content-type", C.ContentType.FORM);
		try {
			RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout)
					.setConnectTimeout(connectTimeout).setConnectionRequestTimeout(connectRequestTimeout).build();
			List<NameValuePair> formParams = new ArrayList<NameValuePair>();
			httpPost.setEntity(new UrlEncodedFormEntity(formParams, Consts.UTF_8));
			httpPost.setConfig(requestConfig);
			ByteArrayEntity byteArrayEntity = null;
			if (!StringUtils.isBlank(content)) {
				byteArrayEntity = new ByteArrayEntity(content.getBytes(charset));
				httpPost.setEntity(byteArrayEntity);
			}
			CloseableHttpResponse response = httpclient.execute(httpPost);
			try {
				// 执行POST请求
				HttpEntity entity = response.getEntity(); // 获取响应实体
				try {
					if (null != entity) {
						responseContent = EntityUtils.toString(entity, Consts.UTF_8);
					}
				} finally {
					if (entity != null) {
						entity.getContent().close();
					}
				}
			} finally {
				if (response != null) {
					response.close();
				}
			}
			logger.info("执行HttpKit.connectPostHttpsByForm()方法,requestURI : " + httpPost.getURI() + ", responseContent: "
					+ responseContent);
		} catch (ClientProtocolException e) {
			logger.error("执行HttpKit.connectPostHttpsByForm()方法,发生ClientProtocolException异常：{}", e);
		} catch (IOException e) {
			logger.error("执行HttpKit.connectPostHttpsByForm()方法,发生IOException异常：{}", e);
		} finally {
			httpPost.releaseConnection();
		}
		return responseContent;
	}

	/**
	 * 功能：前台交易构造HTTP POST自动提交表单<br>
	 * 
	 * @param reqUrl 表单提交地址<br>
	 * @param key-value 以MAP形式存储的表单键值<br>
	 * @param encoding 上送请求报文域encoding字段的值<br>
	 * @return 构造好的HTTP POST交易表单<br>
	 */
	public static String createAutoFormHtml(String reqUrl, String key, String value, String encoding) {
		StringBuffer sf = new StringBuffer();
		sf.append("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=" + encoding
				+ "\"/></head><body>");
		sf.append("<form id = \"submit_form\" action=\"" + reqUrl + "\" method=\"post\">");
		sf.append("<input type=\"hidden\" name=\"" + key + "\" id=\"" + key + "\" value=\"" + value + "\"/>");
		sf.append("</form>");
		sf.append("</body>");
		sf.append("<script type=\"text/javascript\">");
		sf.append("document.all.submit_form.submit();");
		sf.append("</script>");
		sf.append("</html>");
		return sf.toString();
	}

	/**
	 * 功能：前台交易构造HTTP POST自动提交表单<br>
	 *
	 * @param reqUrl 表单提交地址<br>
	 * @param params 以MAP形式存储的表单键值<br>
	 * @param encoding 上送请求报文域encoding字段的值<br>
	 * @return 构造好的HTTP POST交易表单<br>
	 */
	public static String createAutoFormHtmlByMap(String reqUrl, Map<String, Object> params, String encoding) {
		StringBuffer sf = new StringBuffer();
		sf.append("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=" + encoding
				+ "\"/></head><body>");
		sf.append("<form id = \"submit_form\" action=\"" + reqUrl + "\" method=\"post\">");
		if (!params.isEmpty()) {
			for (Entry<String, Object> entry : params.entrySet()) {
				sf.append("<input type=\"hidden\" name=\"" + entry.getKey() + "\" id=\"" + entry.getKey()
						+ "\" value=\"" + entry.getValue() + "\"/>");
			}
		}
		sf.append("</form>");
		sf.append("</body>");
		sf.append("<script type=\"text/javascript\">");
		sf.append("document.all.submit_form.submit();");
		sf.append("</script>");
		sf.append("</html>");
		return sf.toString();
	}

	public static String convertStreamToString(InputStream is, String charsetName) {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(is, charsetName));
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
		} catch (IOException e) {
			logger.error("执行HttpKit.convertStreamToString()方法,发生异常：{}", e);
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				logger.error("执行HttpKit.convertStreamToString()方法,发生异常：{}", e);
			}
		}
		return sb.toString();
	}
}