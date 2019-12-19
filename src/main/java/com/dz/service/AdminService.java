package com.dz.service;

import com.dz.dao.AdminDao;

import com.dz.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AdminService {

    @Autowired
    private AdminDao adminDao;

    public Admin findByUsername(String username) {
        return adminDao.findByUsername(username);
    }
}
