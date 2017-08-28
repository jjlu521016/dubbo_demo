package com.dubbo.demo.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.demo.service.UserService;
import org.springframework.stereotype.Component;


/**
 * @author jasonLu
 * @date 2017/8/28 11:55
 * @Description:
 */
@Service
@Component
public class UserServiceImpl implements UserService {
    public String testSayDubbo() {
        String test = "demoqqqq";
        System.out.println(test);
        return test;
    }
}
