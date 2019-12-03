package com.nnww.cloud.controller;

import com.netflix.discovery.converters.Auto;
import com.nnww.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController{

    //使用ribbon

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/movie/user")
    public User getUser(Long id) {
        //硬编码形式
//        User user = restTemplate.getForObject("http://localhost:8085/user/1.json", User.class);

        //mocroservice-provider-user 是VIP(虚拟ip)
        User user = restTemplate.getForObject("http://mocroservice-provider-user/user/"+id+".json", User.class);
        return user;
    }

    /*******************************************************/
//    //使用feign
//    @Autowired
//    private UserFeignClient userFeignClient;
//
//    @GetMapping("/movie/user/{user_id}")
//    public User getUser(@PathVariable("user_id") Long userId) {
//        return userFeignClient.getUser(userId);
//    }
}
