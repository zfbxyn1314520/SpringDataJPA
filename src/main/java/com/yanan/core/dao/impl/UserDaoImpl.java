package com.yanan.core.dao.impl;

import org.springframework.stereotype.Repository;

import com.yanan.core.dao.UserDao;
import com.yanan.core.entity.User;
@Repository
public class UserDaoImpl implements UserDao {

	public User getUser(Integer id, String name) {
		// TODO Auto-generated method stub
		return new User(id,name);
	}

}
