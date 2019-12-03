package com.nnww.cloud.controller;

import com.nnww.cloud.entity.User;
import com.nnww.cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{user_id}.json")
    @ResponseBody
    public User getById(@PathVariable(name = "user_id") Long userId) {
        User one = userRepository.findOne(userId);
        return one;
    }

}
