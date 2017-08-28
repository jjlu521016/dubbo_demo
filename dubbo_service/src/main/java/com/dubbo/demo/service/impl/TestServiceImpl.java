package com.dubbo.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.demo.service.TestService;
import com.dubbo.demo.service.UserService;

@Service
public class TestServiceImpl implements TestService{

	@Reference
	private UserService userService;
	public String testSayDubbo() {
		System.out.println("---testSayDubbo----服务被调用----------");
		StringBuffer stringBuffer = new StringBuffer();
		String test = userService.testSayDubbo();
		stringBuffer.append("Dubbo say:Hello!!!!!");
		return stringBuffer.toString();
	}

	public String say(String name) {
		System.out.println("----say---服务被调用----------");
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(name+" say:Hello!!!!!");
		return stringBuffer.toString();
	}

}
