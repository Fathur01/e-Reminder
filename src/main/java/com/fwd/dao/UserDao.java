package com.fwd.dao;

import java.util.List;

import com.fwd.entities.User;

public interface UserDao {
//	public List<Pic> getAllPic();
	public List<User> list();
	public boolean delete(User user);
	public boolean saveOrUpdate(User user);
}
