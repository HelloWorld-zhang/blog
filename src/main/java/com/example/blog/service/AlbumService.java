package com.example.blog.service;

import com.example.blog.entity.Album;
import com.example.blog.utils.AlbumVo;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface AlbumService {

    int insert(Album record);

    PageInfo<AlbumVo> selectAlbumVos(Map<String,Object> map);

    int updateByPrimaryKeySelective(Album record);

    int deleteByPrimaryKey(Integer id);

    AlbumVo selectVoByPrimaryKey(Integer id);

}
