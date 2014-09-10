package com.dragon.drive.domain;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Assert;
import org.junit.Test;

public class TestSelect {
	@Test
	public void selectUserTest() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessions = cfg.buildSessionFactory();
		Session session = sessions.openSession();
		Query createQuery = session.createQuery("from User");
		List<User> list = createQuery.list();
		User user1 = (User) session.get(User.class, 1);
		Assert.assertEquals("the gender is error.", Gender.FEMALE, list.get(0)
				.getGender());
		session.close();
	}
}
