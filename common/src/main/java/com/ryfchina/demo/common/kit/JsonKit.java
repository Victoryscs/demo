package com.ryfchina.demo.common.kit;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

/**
 * 利用fastJson 处理JSON数据
 */
public class JsonKit {

	/**
	 * 单态实例
	 */
	private static JsonKit instance;

	/**
	 * 获得单态实例
	 * 
	 * @return 单态实例
	 */
	public static JsonKit getInstance() {
		if (instance == null) {
			instance = new JsonKit();
		}
		return instance;
	}

	private JsonKit() {

	}

	/**
	 * 解析json为List
	 */
	public List<Map<String, Object>> parseJSON2List(String jsonStr) {
		JSONArray jsonArr = JSONArray.parseArray(jsonStr);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Iterator<Object> it = jsonArr.iterator();
		while (it.hasNext()) {
			Object json2 = it.next();
			list.add(parseJSON2Map(json2.toString()));
		}
		return list;
	}

	/**
	 * 解析json为map
	 * 
	 * @param jsonStr
	 * @return
	 */
	public Map<String, Object> parseJSON2Map(String jsonStr) {
		// 最外层解析
		JSONObject json = JSONObject.parseObject(jsonStr);
		return parseJSON2Map(json);
	}

	/**
	 * 解析json为map
	 * 
	 * @param json
	 * @return
	 */
	public Map<String, Object> parseJSON2Map(JSONObject json) {
		Map<String, Object> map = new HashMap<String, Object>();
		for (Object k : json.keySet()) {
			Object v = json.get(k);
			// 如果内层还是数组的话，继续解析
			if (v == null) {
				map.put(k.toString(), "");
			} else if (v instanceof JSONObject) {
				if (((JSONObject) v).isEmpty()) {
					map.put(k.toString(), "");
				} else {
					map.put(k.toString(), parseJSON2Map((JSONObject) v));
				}
			} else if (v instanceof JSONArray) {
				List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
				Iterator<Object> it = ((JSONArray) v).iterator();
				while (it.hasNext()) {
					Object json2 = it.next();
					list.add(parseJSON2Map(json2.toString()));
				}
				map.put(k.toString(), list);
			} else {
				map.put(k.toString(), v);
			}
		}
		return map;
	}

	public List<Map<String, Object>> getListByUrl(String url) {
		try {
			// 通过HTTP获取JSON数据
			InputStream in = new URL(url).openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			return parseJSON2List(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Map<String, Object> getMapByUrl(String url) {
		try {
			// 通过HTTP获取JSON数据
			InputStream in = new URL(url).openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			return parseJSON2Map(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
