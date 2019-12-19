package com.dz.controller;

import com.dz.pojo.User;
import com.dz.service.UserService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@Api(value = "用户模块")
@RestController
@RequestMapping("/user/")
public class UserCotroller {

    @Autowired
    private UserService userService;


    //普通分页
    @ApiOperation(value = "用户列表")
    @RequestMapping("findByPage")
    public List<User> findByPage(){
        return userService.findByPage();
    }




}
