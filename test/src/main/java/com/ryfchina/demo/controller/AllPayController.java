package com.ryfchina.demo.controller;

import com.ryfchina.demo.common.constant.C;
import com.ryfchina.demo.repository.kit.MqSendKit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhanjin
 * @version 1.0
 * @create 2018/04/09 10:52
 * @since JDK 1.8
 */
@RequestMapping(value = "/api/v1")
@Controller
public class AllPayController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AllPayController.class);

    @Autowired
    private MqSendKit mqSendKit;


    /**
     * 检测实时交易系统是否可以正常访问
     */
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public String test(HttpServletRequest request) throws Exception {
        LOGGER.info("进入AllPayController.test()方法,检测实时交易系统是否可以正常访问");
        Map<String, Object> mqMap = new HashMap<String, Object>();
        mqMap.put("className", "cs");
        mqMap.put("methodName", "cs");
        mqMap.put("msg", "cs");
        mqSendKit.sendToWarnQueue(C.WarnTemplateCode.QURATZ_WARN, mqMap);
        return "系统正常";
    }


}