package com.pst.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: LHC
 * @Date:2019/7/9
 * @Description: com.pst.web.controller
 * @version: 1.0
 */
//控制jsp页面的跳转
    @Controller
public class PageController {

        @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

}
