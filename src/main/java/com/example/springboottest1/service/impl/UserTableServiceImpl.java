package com.example.springboottest1.service.impl;

import com.example.springboottest1.entity.userTable;
import com.example.springboottest1.mapper.UserTableMapper;
import com.example.springboottest1.service.UserTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTableServiceImpl implements UserTableService {
    @Autowired
    private UserTableMapper userTableMapper;

    @Override
    public userTable selectByPrimaryKey(String id) {
        return userTableMapper.selectByPrimaryKey(id);
    }
    //用户登录
    @Override
    public userTable userlogin(String username,String password){
        userTable userTable = userTableMapper.userlogin(username,password);
        return userTable;
    }

    //注册新用户
    @Override
    public int adduser(String username,String password,int age){
        return userTableMapper.adduser1(username,password,age);
        //return userTableMapper.adduser1(username,password,age);     //对应sql语句中的第二种注册方式
    }



}
