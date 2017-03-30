package com.esen.soa.motanrpc.hello.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.esen.soa.motanrpc.api.HelloService;
import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/motan_client.xml" })
public class HelloServiceTest {
	@MotanReferer
	private HelloService helloService;

	@Test
	public void testCall() {
		long start = System.currentTimeMillis();
		System.err.println(helloService.sayHello("sam"));
		System.err.println("cost:" + (System.currentTimeMillis() - start));
	}
}
