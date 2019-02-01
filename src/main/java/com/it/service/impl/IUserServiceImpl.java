package com.it.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dao.IUserDao;
import com.it.pojo.User;
import com.it.service.IUserService;

@Service
public class IUserServiceImpl implements IUserService {    @Resource
    
	@Autowired
	private IUserDao userDao;
    
    
    public User selectByPrimaryKey(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

}