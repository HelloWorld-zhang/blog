package com.example.blog.dao;

import com.example.blog.entity.Whisper;
import com.example.blog.utils.WhisperVo;

import java.util.List;
import java.util.Map;

public interface WhisperMapper {
    List<WhisperVo> selectWhispers(Map<String,Object> map);

    Whisper selectByPrimaryKey(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(Whisper record);

    int insertSelective(Whisper record);

    int updateByPrimaryKeySelective(Whisper record);

    int updateByPrimaryKey(Whisper record);
}
