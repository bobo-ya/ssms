package com.dz.dao;


import com.dz.pojo.Admin;
import org.apache.ibatis.annotations.Select;

public interface AdminDao {

    @Select("select * from t_admin where username=#{username}")
    Admin findByUsername(String username);
}
