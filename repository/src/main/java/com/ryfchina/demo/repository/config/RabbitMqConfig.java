package com.ryfchina.demo.repository.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMqConfig
 *
 * @author zhanjin
 * @version 1.0
 * @description: 描述
 * @create 2017/9/20 9:55
 * @since JDK 1.8
 */
@Configuration
public class RabbitMqConfig {
	/**
	 * 日志
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMqConfig.class);

	@Autowired
	MqConfiger mqConfiger;

	@Bean
	public Queue riskQueue() {
		return new Queue(mqConfiger.getRiskQueue());
	}

	@Bean
	public Queue warnQueue() {
		return new Queue(mqConfiger.getWarnQueue());
	}

}
