package com.ryfchina.demo.common.constant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 通用返回数据
 *
 * @author zhanjin
 * @version 1.0
 * @description: 描述
 * @create 2017/7/29 15:41
 * @since JDK 1.8
 */
public class R extends ConcurrentHashMap<String, Object> {
    private static final long serialVersionUID = 1232345465766878L;
    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(R.class);

    public R() {
        put(C.Action.CODE, C.Code.SUCCESS);
    }

    public static R error() {
        return error(C.Code.INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
    }

    public static R error(String msg) {
        return error(C.Code.INTERNAL_SERVER_ERROR, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put(C.Action.CODE, code);
        r.put(C.Action.MSG, msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put(C.Action.MSG, msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R ok() {
        return new R();
    }

    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
