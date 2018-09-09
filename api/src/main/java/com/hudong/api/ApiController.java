package com.hudong.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ApiController
 *
 * @Title: ApiController.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2018/9/6 10:57
 * @Author 90
 */
@RequestMapping("/api")
@RestController
public class ApiController {


   /* @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser")
    public String getUser(){
        //获取用户信息
        Map<String,String> map=new HashMap<String,String>();
        List<User> list=userService.getAdminListPage(map);
        return list.toString();
    }*/



}
