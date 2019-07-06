package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.common.pojo.UserBean;

public interface UserService extends IService<UserBean> {

    boolean addUser(UserBean userBean);
}
