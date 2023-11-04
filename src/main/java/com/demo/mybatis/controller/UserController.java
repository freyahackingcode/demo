package com.demo.mybatis.controller;

import com.demo.mybatis.pojo.User;
import com.demo.mybatis.service.UserServiceImpl;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    @GetMapping("/t1")
    public PageInfo<User> getUserPage(){
        return userService.getUserPageList(2,3);
    }
    @GetMapping("/t2")
    public List<User> getUserList(@RequestParam int page, @RequestParam int pagesize){
        return userService.getUserList(page,pagesize);
    }
}
