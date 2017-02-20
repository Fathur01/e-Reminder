package com.fwd.dao;

import java.util.List;

import com.fwd.entities.Email;

public interface EmailDao {
//	public List<Pic> getAllPic();
	public List<Email> list();
	public boolean delete(Email email);
	public boolean saveOrUpdate(Email email);
}
