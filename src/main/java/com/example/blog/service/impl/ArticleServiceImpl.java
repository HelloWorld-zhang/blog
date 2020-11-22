package com.example.blog.service.impl;

import com.example.blog.dao.ArticleMapper;
import com.example.blog.entity.Article;
import com.example.blog.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public int insert(Article record) {
        return articleMapper.insert(record);
    }

    @Override
    public PageInfo<Article> selectArticles(Map<String, Object> map) {
        Integer pageNum = map.get("pageNum") == null?1:(Integer)map.get("pageNum");
        Integer pageSize =  map.get("pageSize") == null?1:(Integer)map.get("pageSize");
        PageHelper.startPage(pageNum,pageSize);
        List<Article> articleList = articleMapper.selectArticles(map);
        PageInfo<Article> info = new PageInfo<>(articleList);
        return info;
    }

    @Override
    public Article selectByPrimaryKey(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Article record) {
        return articleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return articleMapper.deleteByPrimaryKey(id);
    }
}
