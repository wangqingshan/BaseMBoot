package com.hudong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IndexController
 *
 * @Title: IndexController.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2018/9/6 14:37
 * @Author 90
 */
@Controller
public class IndexController {

    /**
     * 首页
     * @return
     */
    @RequestMapping(value = "/")
    public String index(){

        return "index";
    }
}
