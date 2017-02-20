package com.fwd.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fwd.dao.DivisionDao;
import com.fwd.entities.Division;

@Repository
@Transactional
public class DivisionDaoImpl implements DivisionDao {

	@Autowired
	SessionFactory session;
	
	
	public boolean saveOrUpdate(Division division){
		session.getCurrentSession().saveOrUpdate(division);
		return true;
	}
	
	public List<Division> list() {
		return session.getCurrentSession().createQuery("from Division").list();
	}
	
	public boolean delete(Division division){
		try {
			session.getCurrentSession().delete(division);
		}catch(Exception ex){
			return false;
		}
		return true;	
	}
}

