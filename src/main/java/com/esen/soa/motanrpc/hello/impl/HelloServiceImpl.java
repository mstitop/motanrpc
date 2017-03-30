package com.esen.soa.motanrpc.hello.impl;

import com.esen.soa.motanrpc.api.HelloService;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

@MotanService(export = "8002")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String msg) {
		return "hello" + msg;
	}

}
