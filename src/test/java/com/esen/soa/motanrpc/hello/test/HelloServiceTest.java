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

	/**
	 * 测试
	 */
	@Test
	public void testCall() {
		int cnt = 1000;
		long start = System.currentTimeMillis();
		helloService.sayHello("sam");
		System.err.println("cost:" + (System.currentTimeMillis() - start));
		helloService.sayHello("sam");
		System.err.println("cost:" + (System.currentTimeMillis() - start));
	}
}
