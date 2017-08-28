package com.dubbo.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dubbo.demo.service.TestService;

@Controller
public class TestController {

    @Reference
    private TestService testService;

    @Reference
    private UserService userService;

    @RequestMapping("/testDubbo")
    @ResponseBody
    public String sayDubbo() {
        String str = testService.testSayDubbo();
        return str;
    }

    @RequestMapping("/testSay")
    @ResponseBody
    public String sayHello(String name) {
        String str = testService.say(name);
        return str;
    }
}
