package com.pst.service;

import com.pst.web.controller.service.Users;

/**
 * @Auther: LHC
 * @Date:2019/7/9
 * @Description: com.pst.service
 * @version: 1.0
 */
//创建业务层，创建一个接口
public interface UsersService {
    //定义一个抽象方法addUser
    void addUser(Users users);
}
