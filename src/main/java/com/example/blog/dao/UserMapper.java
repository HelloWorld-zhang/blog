package com.example.blog.dao;

import com.example.blog.entity.User;

import java.util.Map;

public interface UserMapper {

    User selectByUserName(Map<String,Object> map);

}
