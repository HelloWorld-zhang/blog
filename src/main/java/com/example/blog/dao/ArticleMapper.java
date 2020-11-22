package com.example.blog.dao;

import com.example.blog.entity.Article;

import java.util.List;
import java.util.Map;

public interface ArticleMapper {
    Article selectByPrimaryKey(Integer id);

    List<Article> selectArticles(Map<String,Object> map);

    Long selectActicleCount(Map<String,Object> map);

    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    Article insertSelective(Article record);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);


}
