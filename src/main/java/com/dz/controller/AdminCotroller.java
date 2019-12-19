package com.dz.controller;

import com.dz.pojo.Admin;
import com.dz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/")
public class AdminCotroller {

    @Autowired
    private AdminService adminService;

    @RequestMapping("login")
    public String login(){
        return "admin/login";
    }

    @RequestMapping("tologin")
    public String tologin(Admin admin,Model model){

        String username = admin.getUserName();
        String password = admin.getPassword();
        Admin admin1 = adminService.findByUsername(username);
        if(admin1 != null && admin1.getPassword().equals(password)){
            return "admin/success";
        }else {
            model.addAttribute("msg","用户名或密码错误");
            return "admin/login";
        }
    }

}
