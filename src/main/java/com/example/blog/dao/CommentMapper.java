package com.example.blog.dao;

import com.example.blog.entity.Comment;

import java.util.List;
import java.util.Map;

public interface CommentMapper {
    List<Comment> selectComments(Map<String,Object> map);

    int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    int insertSelective(Comment record);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    int deleteByIds(List list);
}
