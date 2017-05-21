package com.sm.dao;

import java.util.List;

import com.sm.bean.User;

public interface UserMap {
	void save(User user);
	void update(User user);
	void delete(int id);
	User findById(int id);
	List<User> findAll();
}
