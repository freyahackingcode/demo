package com.demo.mybatis.dao;

import com.demo.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    User getUserbyId(int id);
    void insert(User user);
    void delete(int id);
    void update(User user);
}
