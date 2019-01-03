package com.zero.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zero.service.UserService;


@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName() {
        System.out.println("hello my name is xiaohong!");
        return "hello";
    }
}