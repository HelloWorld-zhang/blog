package com.example.blog.service;

import com.example.blog.entity.Whisper;
import com.example.blog.utils.WhisperVo;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface WhisperService {

    PageInfo<WhisperVo> selectWhispers(Map<String,Object> map);

    int deleteByPrimaryKey(Integer id);

    int insert(Whisper record);

    Whisper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Whisper record);

}
