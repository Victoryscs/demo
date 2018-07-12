package com.ryfchina.demo.common.constant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 通用Map参数
 *
 * @author zhanjin
 * @version 1.0
 * @description: 描述
 * @create 2017/7/29 15:41
 * @since JDK 1.8
 */
@SuppressWarnings("all")
public class P extends ConcurrentHashMap<String, Object> {
	private static final long serialVersionUID = 1232345465766878L;
	/**
	 * 日志
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(P.class);

	public P() {
		super();
	}

	public P put(String key, Object value) {
		super.put(key, value);
		return this;
	}

}
