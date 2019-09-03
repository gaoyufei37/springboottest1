package com.example.springboottest1.service;

import com.example.springboottest1.entity.userTable;

public interface UserTableService {

    userTable selectByPrimaryKey(String id);

    //用户登录
    userTable userlogin(String username,String password);

    //注册新用户(方式1)
    int adduser(String username,String password,int age);

    //注册新用户（方式2）
    //int adduser1(String username,String password,int age);

}
