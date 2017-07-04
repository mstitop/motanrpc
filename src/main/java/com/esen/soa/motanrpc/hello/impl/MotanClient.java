package com.esen.soa.motanrpc.hello.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.esen.soa.motanrpc.api.HelloService;

public class MotanClient {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:motan_client.xml");
		
		HelloService service = (HelloService) context.getBean("remoteService");
		
		String sayHello = service.sayHello("test");
	}
}
