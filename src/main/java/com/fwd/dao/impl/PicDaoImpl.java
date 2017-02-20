package com.fwd.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fwd.dao.PicDao;
import com.fwd.entities.Pic;

@Repository
@Transactional
public class PicDaoImpl implements PicDao {

	@Autowired
	SessionFactory session;
	
	
	public boolean saveOrUpdate(Pic pic){
		session.getCurrentSession().saveOrUpdate(pic);
		return true;
	}
	
	public List<Pic> list() {
		return session.getCurrentSession().createQuery("from Pic").list();
	}
	
	public boolean delete(Pic pic){
		try {
			session.getCurrentSession().delete(pic);
		}catch(Exception ex){
			return false;
		}
		return true;	
	}
}
