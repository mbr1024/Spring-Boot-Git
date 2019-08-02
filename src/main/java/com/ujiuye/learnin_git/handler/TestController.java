package com.ujiuye.learnin_git.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * company: www.abc.com
 * Author: Administrator
 * Create Data: 2019/8/2
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/index")
    public String index(){
        return "hello Git";
    }
    @RequestMapping("/hello")
    public String hello(){
        return "你好！";
    }
}
