package com.dz.controller;

import com.dz.pojo.Book;
import com.dz.service.BookService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "图书模块")
@RestController
@RequestMapping("/book/")
public class BookController {
    @Autowired
    private BookService bookService;
    @ApiOperation(value = "书籍列表")
    @RequestMapping("list")
    public Page<Book> list(
            @ApiParam(value = "搜索书籍名")@RequestParam(defaultValue = "", required = false) String name,
            @ApiParam(value = "搜索类型")@RequestParam(defaultValue = "-1", required = false) int tid,
            @ApiParam(value = "页码")@RequestParam(defaultValue = "1", required = false) int page,
            @ApiParam(value = "每页大小")@RequestParam(defaultValue = "2", required = false) int size) {
        Page<Book> toWhichPage = new Page<>(page, size);

        return toWhichPage;
    }

}
