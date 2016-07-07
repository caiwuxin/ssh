package com.padt.dao;

import com.padt.entity.Admin;

public interface AdminDao {

	
	public void saveAdmin(Admin admin);
	
	public Admin getById(Integer id);
	
	public void delete(Admin admin);

}
