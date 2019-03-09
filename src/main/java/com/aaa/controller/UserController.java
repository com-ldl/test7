package com.aaa.controller;

import com.aaa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * fileName:UserController
 * description:
 * author:Ldl
 * createTime:2019-03-02 16:46
 */
@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    UserService ser;
    @ResponseBody
    @RequestMapping("getUser")
    public String getUser(){
        System.out.println("启动成功");
        List user = ser.getUser();
        user.add("一个测试");
        return user.toString();
    }
}
