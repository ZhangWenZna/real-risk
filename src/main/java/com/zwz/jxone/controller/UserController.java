package com.zwz.jxone.controller;

import com.zwz.jxone.po.UserPO;
import com.zwz.jxone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public UserPO selectById(@PathVariable Integer uId){
        return userService.selectById(uId);
    }
}
