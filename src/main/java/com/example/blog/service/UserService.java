package com.example.blog.service;

import com.example.blog.entity.User;

import java.util.Map;

public interface UserService {
    User selectByUserName(Map<String, Object> map);

}
