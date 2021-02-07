package com.mao.mybatis.controller;

import com.mao.mybatis.mapper.UserMapper;
import com.mao.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: maohongzhi
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
   @GetMapping("/getuser/{id}")
   public User getUser(@PathVariable("id") Integer id){
       return userMapper.getUserById(id);
   }
}
