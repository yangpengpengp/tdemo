package com.example.eurekafeign.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yangpengpeng
 * @version 1.0
 * @date 2019/1/9
 */
@FeignClient(value = "computer-service", fallback = ComputerClientHystrix.class)
public interface ComputerClient {
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a")Integer a,
                @RequestParam(value = "b")Integer b);
}
