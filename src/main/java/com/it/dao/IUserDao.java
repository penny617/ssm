package com.it.dao;

import com.it.pojo.User;

public interface IUserDao {

    User selectByPrimaryKey(Integer id);
  
}