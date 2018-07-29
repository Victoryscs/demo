package com.ryfchina.demo.repository.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * MqConfiger
 * 
 * @description:
 * @author renjun
 * @create 2017/7/14 16:19
 * @since JDK 1.7
 * @version 1.0
 */
@Component
@ConfigurationProperties(prefix = "mqconfig")
public class MqConfiger {

	private String riskQueue;

	private String warnQueue;

	private String defaultTemplateId;

	public String getRiskQueue() {
		return riskQueue;
	}

	public void setRiskQueue(String riskQueue) {
		this.riskQueue = riskQueue;
	}

	public String getWarnQueue() {
		return warnQueue;
	}

	public void setWarnQueue(String warnQueue) {
		this.warnQueue = warnQueue;
	}

	public String getDefaultTemplateId() {
		return defaultTemplateId;
	}

	public void setDefaultTemplateId(String defaultTemplateId) {
		this.defaultTemplateId = defaultTemplateId;
	}

}
