package com.padt.service;

import com.padt.entity.Admin;

public interface AdminService {

	public boolean checkAdmin(String name);
	
	public boolean checkPassword(String name,String pswd);
	
	public void enrol(Admin admin);
}
