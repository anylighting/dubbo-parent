package com.zhaoji.dubboprovider;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppClass {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AppClass.class);
	
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		System.out.println("服务段启动");
		LOGGER.info("服务端已启动.......");
		System.in.read();
		context.close();
		context.stop();
	}

}
