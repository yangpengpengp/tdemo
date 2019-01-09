package com.example.eurekarubbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author yangpengpeng
 * @version 1.0
 * @date 2019/1/9
 */
@Service
public class ComputerService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService(){
        return restTemplate.getForEntity("http://COMPUTER-SERVICE/add?a=1&b=2",
                String.class).getBody();
    }

    public String addServiceFallback(){
        return "error";
    }
}
