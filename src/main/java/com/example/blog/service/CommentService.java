package com.example.blog.service;

import com.example.blog.entity.Comment;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface CommentService {
    PageInfo<Comment> selectComments(Map<String,Object> map);

    int deleteByPrimaryKey(Integer id);

    int deleteByIds(List list);
}
