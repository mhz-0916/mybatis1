package com.mao.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: maohongzhi
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello springboot";
    }
}
