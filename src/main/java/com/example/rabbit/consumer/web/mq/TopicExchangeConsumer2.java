package com.example.rabbit.consumer.web.mq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2019-08-30-14:15
 **/
@Component
@RabbitListener(queues = "q.topic2")
public class TopicExchangeConsumer2 {
	@RabbitHandler
	public void receiveMessage(Object object) {
		Message message=(Message)object;
		byte bytes[]=null;
		if (message != null) {
			bytes=message.getBody();
		}
		try {
			String msg=new String(bytes,"UTF-8");
			System.out.println("q.topic2------------------------"+msg);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
