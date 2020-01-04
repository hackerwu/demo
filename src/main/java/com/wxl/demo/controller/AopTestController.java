package com.wxl.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aopController")
public class AopTestController {
    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    public String hello(@RequestParam String name){
        return "Hello "+name;
    }
}
