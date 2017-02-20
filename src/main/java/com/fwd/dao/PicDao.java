package com.fwd.dao;

import java.util.List;

import com.fwd.entities.Pic;

public interface PicDao {
//	public List<Pic> getAllPic();
	public List<Pic> list();
	public boolean delete(Pic pic);
	public boolean saveOrUpdate(Pic pic);
}
