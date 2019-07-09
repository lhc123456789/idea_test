package com.pst.web.controller.service;
import javax.annotation.Resource;
import java.util.List;
/**
 * @Auther: LHC
 * @Date:2019/7/8
 * @Description: com.pst
 * @version: 1.0
 */

public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}