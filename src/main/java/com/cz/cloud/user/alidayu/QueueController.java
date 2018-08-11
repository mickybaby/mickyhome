package com.cz.cloud.user.alidayu;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 消息生产者
 * @author Administrator
 *
 */
@RestController
public class QueueController {

	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;




	@RequestMapping("/sendmap")
	public void sendMap(){
		Map map=new HashMap<>();
		map.put("mobile", "18118388123");//发送的手机号
		map.put("template_code", "SMS_141597240");//模版的code
		map.put("sign_name","仇诚");//签名
		map.put("param", "{\"name\":\"小仇\"}");//参数

		jmsMessagingTemplate.convertAndSend("sms", map);
	}
}
