package com.example.eurekafeign.controller;

import com.example.eurekafeign.interfaces.ComputerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangpengpeng
 * @version 1.0
 * @date 2019/1/9
 */
@RestController
public class ConsumerController {
    @Qualifier("computer-service")

    @Autowired
    ComputerClient computerClient;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(){
        return computerClient.add(1, 2);
    }
}
