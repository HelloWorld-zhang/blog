package com.example.blog.service;

import com.example.blog.entity.Article;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface ArticleService {

    int insert(Article record);

    PageInfo<Article> selectArticles(Map<String,Object> map);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int deleteByPrimaryKey(Integer id);
}
