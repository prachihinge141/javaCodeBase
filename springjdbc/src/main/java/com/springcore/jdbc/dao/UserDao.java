package com.springcore.jdbc.dao;

import com.springcore.jdbc.entities.User;

public interface UserDao {
	public int insert(User user);
	public int update(User user);
	public int delete(int userId);
	public User select(int userId);

}
