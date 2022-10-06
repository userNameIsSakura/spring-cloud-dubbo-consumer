package com.fzw.springcloud.dubbo.springclouddubboconsumer.controller;


import com.fzw.springcloud.dubbo.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


        /*
        * mock 服务降级
        * 当服务提供方出现网络异常无法访问时，客户端不抛出异常
        * 而是通过降级配置返回兜底数据
        * */
        @Reference(mock = "com.fzw.springcloud.dubbo.springclouddubboconsumer.service.MockHelloService",url = "")
        private IHelloService iHelloService;

        @GetMapping("/hello")
        public String hello()
        {
            return iHelloService.sayHello("Mic");
        }
}
