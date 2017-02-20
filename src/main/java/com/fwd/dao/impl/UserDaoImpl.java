package com.fwd.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fwd.dao.UserDao;
import com.fwd.entities.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory session;
	
	public boolean saveOrUpdate(User user){
		session.getCurrentSession().saveOrUpdate(user);
		return true;
	}
	
	public List<User> list() {
		return session.getCurrentSession().createQuery("from User").list();
	}
	
	public boolean delete(User user){
		try {
			session.getCurrentSession().delete(user);
		}catch(Exception ex){
			return false;
		}
		return true;	
	}

}
