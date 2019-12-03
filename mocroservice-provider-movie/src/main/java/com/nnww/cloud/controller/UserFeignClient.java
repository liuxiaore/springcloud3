package com.nnww.cloud.controller;

import com.nnww.cloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "mocroservice-provider-user")
public interface UserFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/user/{user_id}.json")
    public User getUser(@PathVariable("user_id") Long userId);
}
