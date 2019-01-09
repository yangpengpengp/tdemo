package com.example.computerservice.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangpengpeng
 * @version 1.0
 * @date 2019/1/9
 */
@RestController
public class ComputerController {
    private final Logger logger = Logger.getLogger(getClass());
    @Qualifier("eurekaRegistration")
    @Autowired
    private Registration registration;
    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        Integer r = a + b;
        logger.info("/add, host:" + registration.getHost() + ", port:" + registration.getPort() + ", service_id:" + registration.getServiceId() + ", result:" + r);
        return r;
    }
}
