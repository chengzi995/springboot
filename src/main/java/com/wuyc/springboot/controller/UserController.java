package com.wuyc.springboot.controller;

import com.wuyc.springboot.pojo.User;
import com.wuyc.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public List<User> queryUserAll(){
        List<User> list = this.userService.findAll();
        return list;
    }

    @RequestMapping("list/{name}")
    public List<User> queryUserAll(@PathVariable String name){
        List<User> list = this.userService.queryUserByName(name);
        return list;
    }
}
