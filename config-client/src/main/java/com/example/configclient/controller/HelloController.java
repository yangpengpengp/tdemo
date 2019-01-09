package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangpengpeng
 * @version 1.0
 * @date 2019/1/9
 */
@RestController
public class HelloController {
    @Value("${from}")
    private String from;
    @RequestMapping("/from")
    public String from(){
        return this.from;
    }
}
