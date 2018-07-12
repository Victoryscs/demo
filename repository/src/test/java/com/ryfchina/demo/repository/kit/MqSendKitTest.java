package com.ryfchina.demo.repository.kit;

import com.ryfchina.demo.common.constant.C;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class MqSendKitTest {

    @Test
    public void sendToWarnQueue() throws Exception {
        MqSendKit mqSendKit = new MqSendKit();
        Map<String, Object> mqMap = new HashMap<String, Object>();
        mqMap.put("className", null);
        mqMap.put("methodName", null);
        mqMap.put("msg", null);
        mqSendKit.sendToWarnQueue(C.WarnTemplateCode.GENERAL_WARN, mqMap);
    }

}