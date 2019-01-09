package com.example.eurekarubbon.controller;

import com.example.eurekarubbon.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yangpengpeng
 * @version 1.0
 * @date 2019/1/9
 */
@RestController
public class ConsumerController {
    @Autowired
    private ComputerService computerService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(){
        return computerService.addService();
    }
}
