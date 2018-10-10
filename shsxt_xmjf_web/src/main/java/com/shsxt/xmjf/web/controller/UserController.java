package com.shsxt.xmjf.web.controller;

import com.shsxt.xmjf.api.po.User;
import com.shsxt.xmjf.api.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private IUserService userService;


    @RequestMapping("user/queryUserByUserId")
    @ResponseBody
    public User queryUserByUserId(Integer userId){
        return userService.queryUserByUserId(userId);
    }
}
