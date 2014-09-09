package com.dragon.drive.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TestHibernateConnectMysql {

	@Test
	public void connectMysqlTest() {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml")
				.addClass(com.dragon.drive.domain.User.class)
				.addResource("User.hbm.xml");
		SessionFactory sessions = cfg.buildSessionFactory();
		Session session = sessions.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		session.close();
	}

}
