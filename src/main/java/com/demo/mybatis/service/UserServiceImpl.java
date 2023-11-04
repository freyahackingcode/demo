package com.demo.mybatis.service;

import com.demo.mybatis.dao.UserMapper;
import com.demo.mybatis.pojo.User;
import com.demo.mybatis.utils.MybatisUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    private SqlSession sqlSession = MybatisUtils.getSqlSession();

    private UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

    public List<User> getUserList(int pagenum, int pageSize){
        return userMapper.getUserList();
//        PageHelper.startPage(pagenum,pageSize);
//        List<User> userList = userMapper.getUserList();
//        return userList;
    }
    public PageInfo<User> getUserPageList(int pagenum, int pageSize){
        PageHelper.startPage(pagenum,pageSize);
        List<User> userList = userMapper.getUserList();
        return new PageInfo<User>(userList);

    }
}
