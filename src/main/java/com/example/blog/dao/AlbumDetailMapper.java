package com.example.blog.dao;

import com.example.blog.entity.AlbumDetail;

public interface AlbumDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AlbumDetail record);

    int insertSelective(AlbumDetail record);

    AlbumDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AlbumDetail record);

    int updateByPrimaryKey(AlbumDetail record);
}
