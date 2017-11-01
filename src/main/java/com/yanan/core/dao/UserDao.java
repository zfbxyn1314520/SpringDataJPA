package com.yanan.core.dao;

import com.yanan.core.entity.User;

public interface UserDao {

	User getUser(Integer id,String name);
}
