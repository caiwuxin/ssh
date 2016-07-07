package com.padt.service.impl;

import com.padt.dao.AdminDao;
import com.padt.entity.Admin;
import com.padt.service.AdminService;

public class AdminServiceImpl implements AdminService{

	private AdminDao adminDao;
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public boolean checkAdmin(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkPassword(String name, String pswd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void enrol(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.saveAdmin(admin);
	}

}
