package com.fwd.dao;

import java.util.List;

import com.fwd.entities.Document;

public interface DocumentDao {
//	public List<Pic> getAllPic();
	public List<Document> list();
	public boolean delete(Document document);
	public boolean saveOrUpdate(Document document);
}
