package com.it.service;

import com.it.pojo.User;


public interface IUserService {
    public User selectByPrimaryKey(int userId);
}