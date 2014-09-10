package com.dragon.drive.domain;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Ignore;
import org.junit.Test;

public class TestSave {
	@Ignore
	@Test
	public void testSaveUser() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessions = cfg.buildSessionFactory();
		Session session = sessions.openSession();
		session.beginTransaction();

		User user = new User();
		user.setBirthday(new Date());
		user.setEmail("hantong4510@163.com");
		user.setGender(Gender.FEMALE);
		user.setIdCard("230622198805100878");
		user.setLoginname("hantong");
		user.setPassword("123456");
		user.setLoginname("wanghantong");
		user.setPhonenum("15911351789");
		user.setQq("296222242");
		user.setWechat("15011351789");
		user.setWeibo("hantong4510");
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

}
