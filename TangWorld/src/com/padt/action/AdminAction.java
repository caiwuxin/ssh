package com.padt.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.padt.dao.AdminDao;
import com.padt.entity.Admin;
import com.padt.service.AdminService;

public class AdminAction extends ActionSupport{

	private static final Logger log=Logger.getLogger(AdminAction.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AdminService adminService;
	
	public AdminService getAdminService() {
		return adminService;
	}


	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}


	public String test()
	{
		return SUCCESS;
	}


	public String mmm()
	{
		
		return ERROR;
	}
	public String insert()
	{
		Admin admin=new Admin();
		admin.setName("hongkunfeng");
		admin.setPswd("19940305");
		admin.setStatus(1);
		adminService.enrol(admin);
		return SUCCESS;
	}
	
	
}
