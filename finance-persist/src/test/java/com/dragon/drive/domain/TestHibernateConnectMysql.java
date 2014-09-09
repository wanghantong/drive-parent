package com.dragon.drive.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TestHibernateConnectMysql {

	@Test
	public void connectMysqlTest() {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessions = cfg.buildSessionFactory();
		Session session = sessions.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		session.close();
	}
	@Test
	public void testCreateUser() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessions = cfg.buildSessionFactory();
		Session session = sessions.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		session.close();
	}

}
