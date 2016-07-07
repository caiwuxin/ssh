package com.padt.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.padt.dao.AdminDao;
import com.padt.entity.Admin;

public class AdminDaoImpl implements AdminDao{

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveAdmin(Admin admin) {
		sessionFactory.getCurrentSession().save(admin);
	}

	@Override
	public Admin getById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Admin admin where admin.id = '"+id+"'";
		Query query=session.createQuery(hql);
		List list=query.list();
		if(list.isEmpty())
			return null;
		else
			return (Admin)list.get(0);
	}

	@Override
	public void delete(Admin admin) {
		// TODO Auto-generated method stub
		
	}

}
