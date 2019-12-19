package com.dz.dao;

import com.dz.pojo.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookDao {

    @Select("select * from t_book")
    List<Book> findBookByPage();
}
