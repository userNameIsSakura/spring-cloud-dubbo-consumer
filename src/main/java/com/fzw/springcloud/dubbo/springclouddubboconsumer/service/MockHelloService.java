package com.fzw.springcloud.dubbo.springclouddubboconsumer.service;

import com.fzw.springcloud.dubbo.IHelloService;

public class MockHelloService implements IHelloService {
    @Override
    public String sayHello(String s) {
        return "Wrong!";
    }
}
