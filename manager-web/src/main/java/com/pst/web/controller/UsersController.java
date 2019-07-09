package com.pst.web.controller;

import com.pst.service.UsersService;
import com.pst.web.controller.service.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @Auther: LHC
 * @Date:2019/7/9
 * @Description: com.pst.web.controller
 * @version: 1.0
 */
//用户添加的控制
    @Controller //Controller的注解
    @RequestMapping("/user")//请求的前缀
public class UsersController {

        @Autowired
        private UsersService usersService;//注入UserService


        @RequestMapping("/addUser")//用来触发addUser（）这个方法
        public String addUser(Users users){
            this.usersService.addUser(users);
            return "ok";
        }
}
