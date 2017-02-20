package com.fwd.dao;

import java.util.List;

import com.fwd.entities.Division;

public interface DivisionDao {
//	public List<Pic> getAllPic();
	public List<Division> list();
	public boolean delete(Division division);
	public boolean saveOrUpdate(Division division);
}
