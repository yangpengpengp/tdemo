package com.example.eurekafeign.interfaces;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yangpengpeng
 * @version 1.0
 * @date 2019/1/9
 */
@Component
public class ComputerClientHystrix implements ComputerClient {
    @Override
    public Integer add(@RequestParam(value = "a") Integer a,
                       @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
