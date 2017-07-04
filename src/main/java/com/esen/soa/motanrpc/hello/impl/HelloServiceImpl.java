package com.esen.soa.motanrpc.hello.impl;

import com.esen.soa.motanrpc.api.HelloService;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

@MotanService
public class HelloServiceImpl implements HelloService {

	public String sayHello(String msg) {
		return "hello" + msg;
	}

}
