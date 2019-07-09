package com.pst.web.controller;

import com.pst.web.controller.service.Users;
import com.pst.web.controller.service.UsersMapper;

/**
 * @Auther: LHC
 * @Date:2019/7/9
 * @Description: com.pst.web.controller
 * @version: 1.0
 */
public class Manager {
    private UsersMapper usersMapper;
    public void insertUserTest(){
        Users users=new Users();
        users.setUserage(20);
        users.setUsername("admin");
        this.usersMapper.insertUser(users);
    }
}
