package com.example.blog.dao;

import com.example.blog.entity.Album;
import com.example.blog.utils.AlbumVo;

import java.util.List;
import java.util.Map;

public interface AlbumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Album record);

    Album selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Album record);

    List<AlbumVo> selectAlbumVos(Map<String,Object> map);

    AlbumVo selectVoByPrimaryKey(Integer id);

}
