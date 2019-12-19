package com.dz.service;

import com.dz.dao.BookDao;
import com.dz.pojo.Book;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public PageInfo<Book> findBookByPage() {
        PageHelper.startPage(1,3);
        List<Book> userList = bookDao.findBookByPage();
        PageInfo<Book> pageInfo = new PageInfo<Book>(userList);
        //pageInfo.setList(userList);
        return pageInfo;
    }
}
