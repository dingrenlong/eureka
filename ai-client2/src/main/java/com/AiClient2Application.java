package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试多服务提供时负载均衡
 */
@RestController
@EnableEurekaClient
@SpringBootApplication
public class AiClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(AiClient2Application.class, args);
    }
    /**
     * 假如这个客户端要提供一个getUser的方法
     * @return
     */
    @GetMapping(value = "/getUser")
    @ResponseBody
    public Map<String,Object> getUser(@RequestParam Integer id){
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("id",id);
        data.put("userName","admin");
        data.put("from","provider-B******");
        return data;
    }
}
