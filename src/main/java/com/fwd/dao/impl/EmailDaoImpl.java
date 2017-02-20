package com.fwd.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fwd.dao.EmailDao;
import com.fwd.entities.Email;

@Repository
@Transactional
public class EmailDaoImpl implements EmailDao {

	@Autowired
	SessionFactory session;
	
	
	public boolean saveOrUpdate(Email email){
		session.getCurrentSession().saveOrUpdate(email);
		return true;
	}
	
	public List<Email> list() {
		return session.getCurrentSession().createQuery("from Email").list();
	}
	
	public boolean delete(Email email){
		try {
			session.getCurrentSession().delete(email);
		}catch(Exception ex){
			return false;
		}
		return true;	
	}
}

