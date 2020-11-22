package com.example.blog.service;

import com.example.blog.entity.AlbumDetail;

public interface AlbumDetailService {
    int insert(AlbumDetail record);
    int deleteByPrimaryKey(Integer id);
}
