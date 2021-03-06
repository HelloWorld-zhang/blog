package com.example.blog.service.impl;

import com.example.blog.dao.AlbumDetailMapper;
import com.example.blog.entity.AlbumDetail;
import com.example.blog.service.AlbumDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AlbumDetailServiceImpl implements AlbumDetailService {

    @Autowired
    private AlbumDetailMapper albumDetailMapper;


    @Override
    public int insert(AlbumDetail record) {
        return albumDetailMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return albumDetailMapper.deleteByPrimaryKey(id);
    }
}
