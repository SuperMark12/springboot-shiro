package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.common.pojo.UserBean;

public interface UserMapper extends BaseMapper<UserBean> {

    int addUser(UserBean userBean);
}
