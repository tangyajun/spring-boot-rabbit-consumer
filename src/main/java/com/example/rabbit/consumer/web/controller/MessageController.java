package com.example.rabbit.consumer.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tang
 * @Description TO DO
 * @create 2019-08-29-20:18
 **/
@RestController
@RequestMapping(value = "/messages")
public class MessageController {



	public void sendMessage() {
		Map<String,Object> map=new HashMap<>();
		map.put("username","test1");
		map.put("password","123456");

	}
}
