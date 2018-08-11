package com.cz.cloud.user.alidayu;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cz.cloud.user.alidayu.utlis.SmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;

@Component
public class SmsListener {

    @Autowired
    private SmsUtil smsUtil;

    @JmsListener(destination = "smsphone")
    public void sendSms(Map<String, String> map) {
        final String param = map.get("param");
        final Map<Object, Object> m = new HashMap<>();
        m.put("number", param);
        final String parse = JSON.toJSONString(m);
        System.out.println(parse);
        try {
            SendSmsResponse response = smsUtil.sendSms(map.get("mobile"),
                    map.get("template_code"),
                    map.get("sign_name"),
                    parse);
            System.out.println("code:" + response.getCode());
            System.out.println("message:" + response.getMessage());


        } catch (ClientException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
