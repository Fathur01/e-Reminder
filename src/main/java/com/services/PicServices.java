package com.services;

import java.util.List;

import com.fwd.entities.Pic;

public interface PicServices {
	public List<Pic> list();
	public boolean delete(Pic pic);
	public boolean saveOrUpdate(Pic pic);
}
