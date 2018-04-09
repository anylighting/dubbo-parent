package com.zhaoji.dubboconsumer;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhaoji.dubboapi.DemoService;

public class AppClass {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AppClass.class);
	
	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		System.out.println("客户端启动...................");
		DemoService demoService = context.getBean(DemoService.class);
		String result = demoService.sayHello("zhaoji");
		System.out.println("客户端收到结果" + result);
		LOGGER.info("客户端输出：{}", result);
		LOGGER.info("客户段启动。。。。。。。。。。。。。。");
		System.in.read();
		context.close();
		context.stop();
	}

}
