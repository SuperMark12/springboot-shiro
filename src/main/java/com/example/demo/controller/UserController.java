package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.common.pojo.UserBean;
import com.example.demo.common.utils.UtilSystem;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = "text/plain;charset=utf-8")
    public String login(UserBean userBean) {

        return "登录成功!";
    }

    @RequestMapping(method = RequestMethod.POST)
    public JSONObject addUser(UserBean userBean) {
        boolean flag = userService.addUser(userBean);
        if (flag = true) {
            return UtilSystem.getResult("", true, "", 0);
        } else {
            return UtilSystem.getResult("", false, "新增用户失败", -1);
        }
    }
}
