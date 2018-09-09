package com.hudong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * UserController
 *
 * @Title: UserController.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2018/9/5 13:40
 * @Author 90
 */
@RequestMapping("/admin")
@Controller
public class SysUserController {



    @RequestMapping(value = "/sysUserList")
    @ResponseBody
    public Object sysUserList(HttpServletRequest request, HttpServletResponse response){
        //获取用户信息
        Map<String,String> map=new HashMap<String,String>();


        Map<String,Object> rltMap=new HashMap<String,Object>();

        return rltMap;
    }




    /*

    @RequestMapping(value = "/add")
    public String addUser(User user){
        user= new User();
        user.setPhone("133443545");
        user.setPassword("123443");
        user.setUserName("用户名");
        return "haha";
    }

    @RequestMapping(value = "/")
    public String index(){
        User user= new User();
        user.setPhone("133443545");
        user.setPassword("123443");
        user.setUserName("用户名");

        //userService.addUser(user);
        return "index";
    }

    */

}
