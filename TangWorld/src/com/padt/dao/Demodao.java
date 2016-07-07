package com.padt.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.padt.entity.Admin;

public class Demodao {
	private static final Logger log=Logger.getLogger(Demodao.class);
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void insert(Admin admin)
	{
		log.info(sessionFactory);
		Session sesison=sessionFactory.getCurrentSession();
		sesison.save(admin);
	}
}
