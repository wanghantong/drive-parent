package com.dragon.drive.domain;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestSelect {
	@Ignore
	@Test
	public void selectUserByGetTest() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessions = cfg.buildSessionFactory();
		Session session = sessions.openSession();
		User user1 = (User) session.get(User.class, 1);
		Assert.assertNotNull(user1);
		Assert.assertEquals("the gender is error.", Gender.FEMALE,
				user1.getGender());
		session.close();
	}

	@Test
	public void selectUserByQuery() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessions = cfg.buildSessionFactory();
		Session session = sessions.openSession();
		List<User> list = session.createQuery("from User").list();
		if (list.size() > 0) {
			Assert.assertNotNull(list.get(0));
			Assert.assertEquals("the gender is error.", Gender.FEMALE, list
					.get(0).getGender());
		}
		session.close();
	}
}
