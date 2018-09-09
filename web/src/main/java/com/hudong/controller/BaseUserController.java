package com.hudong.controller;


import com.fasterxml.jackson.databind.ser.Serializers;
import com.hudong.domain.BaseUser;
import com.hudong.services.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 90
 * @since 2018-09-07
 */
@Controller
@RequestMapping("/admin/baseUser")
public class BaseUserController {

    @Autowired
    BaseUserService baseUserService;


    @RequestMapping(value = "v1/getAll")
    @ResponseBody
    public Object getAll(){

        List<BaseUser> list=baseUserService.getAll();
        Map<String,Object> rltMap=new HashMap<String,Object>();
        rltMap.put("dataList",list);

        return rltMap;
    }



}

