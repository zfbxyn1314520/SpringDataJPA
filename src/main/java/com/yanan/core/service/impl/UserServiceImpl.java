package com.yanan.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanan.core.dao.UserDao;
import com.yanan.core.entity.User;
import com.yanan.core.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public User getUser(Integer id, String name) {
		// TODO Auto-generated method stub
		return this.userDao.getUser(id, name);
	}

}
