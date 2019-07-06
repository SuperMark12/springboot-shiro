package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.common.pojo.UserBean;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserBean> implements UserService {

    /**
     * 日志记录
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public boolean addUser(UserBean userBean) {
        try {
            int result = this.baseMapper.addUser(userBean);
            if (result >0 ) {
                return true;
            }
        }catch (Exception e) {
            LOGGER.error("增加用户失败", e);
        }
        return false;
    }
}
