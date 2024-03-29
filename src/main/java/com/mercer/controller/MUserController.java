package com.mercer.controller;

import com.mercer.pojo.UserInfo;
import com.mercer.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ Date:2019/5/16
 * Auther:Mercer
 * Auther:麻前程
 */
@RestController
@RequestMapping("/user")
public class MUserController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("queryUser")
    public List<UserInfo> queryUser(){
        return userInfoService.queryUser();
    }
    @RequestMapping("/login")
    public Map<String,Object> login(@RequestBody Map<String,Object> userDto){
        Map<String,Object> map = new HashMap<>();
        if (userInfoService.login(userDto)){
            //登陆成功
            map.put("status",200);
        }
        else {
            map.put("status", 400);
            map.put("msg", "登陆失败，用户名或密码不正确");
        }
        return map;
    }

}
