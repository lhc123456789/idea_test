package com.pst.service.impl;

import com.pst.service.UsersService;
import com.pst.web.controller.service.Users;
import com.pst.web.controller.service.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: LHC
 * @Date:2019/7/9
 * @Description: com.pst.service
 * @version: 1.0
 */
//接口实现类都放在impl包下

    //这是一个UserService的接口实现类
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired//注入UserMapper
    private UsersMapper usersMapper;

    //alt+回车键实现抽象方法
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}


