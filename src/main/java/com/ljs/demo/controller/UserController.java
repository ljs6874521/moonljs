package com.ljs.demo.controller;

import com.ljs.demo.Service.UserService;
import com.ljs.demo.pojo.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/findAll", method = {RequestMethod.GET})
    public String findAll(){
        List<User> list =  userService.findAll();
        return list.toString();
    }
}
