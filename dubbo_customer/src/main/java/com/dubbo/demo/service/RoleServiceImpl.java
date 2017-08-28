package com.dubbo.demo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author jasonLu
 * @date 2017/8/28 13:46
 * @Description:
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Reference
    private UserService userService;

    public String getInfo() {
        String info = userService.testSayDubbo();
        return info;
    }
}
