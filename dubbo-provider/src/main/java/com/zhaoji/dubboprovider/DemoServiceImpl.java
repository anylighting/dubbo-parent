package com.zhaoji.dubboprovider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zhaoji.dubboapi.DemoService;

public class DemoServiceImpl implements DemoService{

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoServiceImpl.class);
	@Override
	public String sayHello(String name) {
		LOGGER.info("收到请求：{}", name);
		return "hello " + name;
	}

}
