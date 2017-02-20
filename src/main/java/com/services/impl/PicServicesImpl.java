package com.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fwd.dao.PicDao;
import com.fwd.entities.Pic;
import com.services.PicServices;

@Service
public class PicServicesImpl implements PicServices{

	@Autowired
	PicDao picDao;
	
	public List<Pic> list() {
		// TODO Auto-generated method stub
		return picDao.list();
	}

	public boolean delete(Pic pic) {
		// TODO Auto-generated method stub
		return picDao.delete(pic);
	}

	public boolean saveOrUpdate(Pic pic) {
		// TODO Auto-generated method stub
		return picDao.saveOrUpdate(pic);
	}
	
}
