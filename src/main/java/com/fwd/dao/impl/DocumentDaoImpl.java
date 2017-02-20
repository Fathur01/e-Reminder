package com.fwd.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fwd.dao.DocumentDao;
import com.fwd.entities.Document;

@Repository
@Transactional
public class DocumentDaoImpl implements DocumentDao {

	@Autowired
	SessionFactory session;
	
	
	public boolean saveOrUpdate(Document document){
		session.getCurrentSession().saveOrUpdate(document);
		return true;
	}
	
	public List<Document> list() {
		return session.getCurrentSession().createQuery("from Document").list();
	}
	
	public boolean delete(Document document){
		try {
			session.getCurrentSession().delete(document);
		}catch(Exception ex){
			return false;
		}
		return true;	
	}
}
