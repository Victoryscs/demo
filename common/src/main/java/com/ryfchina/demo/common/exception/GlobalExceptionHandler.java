package com.ryfchina.demo.common.exception;

import com.ryfchina.demo.common.constant.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理类
 *
 * @author zhanjin
 * @version 1.0
 * @description: 描述
 * @create 2017/7/29 15:30
 * @since JDK 1.8
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	/**
	 * 日志
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(CustomException.class)
	public R handleCustomException(CustomException e) {
		R r = new R();
		r.put("code", e.getCode());
		r.put("msg", e.getMsg());
		return r;
	}

	@ExceptionHandler(Exception.class)
	public R handleException(Exception e) {
		LOGGER.error("执行GlobalExceptionHandler.handleException()方法,发生异常：{}", e);
		return R.error();
	}

	@ExceptionHandler(IllegalStateException.class)
	public R handleIllegalStateException(Exception e) {
		LOGGER.error("执行GlobalExceptionHandler.handleIllegalStateException()方法,发生异常：{}", e);
		R r = new R();
		r.put("code", 4);
		r.put("msg", e.getMessage());
		return r;
	}

}
