package com.ljs.demo.controller;

import com.ljs.demo.Service.UserService;
import com.ljs.demo.constant.ResponseMessage;
import com.ljs.demo.pojo.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/findAll")
    public ResponseMessage findAll(){
        List<User> list =  userService.findAll();
        System.out.println(list.get(0).getName());
        return ResponseMessage.list(list.size(),list);
    }
}
