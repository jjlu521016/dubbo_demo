package com.dubbo.demo.service.impl;


import com.dubbo.demo.service.UserService;
import org.springframework.stereotype.Service;


/**
 * @author jasonLu
 * @date 2017/8/28 11:55
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    public String testSayDubbo() {
        String test = "demoqqqq";
        System.out.println(test);
        return test;
    }
}
