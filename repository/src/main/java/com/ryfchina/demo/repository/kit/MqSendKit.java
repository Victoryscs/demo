package com.ryfchina.demo.repository.kit;

import com.ryfchina.demo.common.kit.JacksonKit;
import com.ryfchina.demo.common.constant.C;
import com.ryfchina.demo.common.kit.DateKit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * MqSendKit
 *
 * @author zhanjin
 * @version 1.0
 * @description: 描述
 * @create 2017/9/20 10:03
 * @since JDK 1.8
 */
@Service("mqSendKit")
public class MqSendKit {
	/**
	 * 日志
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(MqSendKit.class);

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send() {
	}


	/**
	 * 发送到常规告警消息队列
	 *
	 * @param templateId 告警模板编号
	 * @param content 告警内容
	 */
	public void sendToWarnQueue(String templateId, Map<String, Object> content) {
		LOGGER.info("进入MqSendKit.sendToWarnQueue()方法......,入参:[templateId, content]：{}", templateId, content);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("templateId", templateId);
		content.put("dateTime", DateKit.getCurrentDateString());
		map.put("content", content);
		String sendMsg = JacksonKit.toJson(map);
		try {
			this.rabbitTemplate.convertAndSend(C.QueueName.WARN_QUEUE, sendMsg);
		} catch (Exception e) {
			LOGGER.error("执行MqSendKit.sendToWarnQueue()方法,发送到常规告警消息队列发生异常：{}", e);
		}
	}

	public static String getStackTrace(Throwable t) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		try {
			t.printStackTrace(pw);
			return sw.toString();
		} finally {
			pw.close();
		}
	}

	public static void main(String[] args) {

	}
}
