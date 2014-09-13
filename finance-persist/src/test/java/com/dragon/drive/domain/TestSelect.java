package com.dragon.drive.domain;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestSelect {
	private Session session;

	@Before
	public void initConfig() throws HibernateException, InstantiationException,
			IllegalAccessException {
		// Configuration cfg = new
		// Configuration().configure("hibernate.cfg.xml");
		// SessionFactory sessions =
		// cfg.buildSessionFactory(ServiceRegistry.class
		// .newInstance());
		// session = sessions.openSession();
		// session.beginTransaction();

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessions = cfg.buildSessionFactory();
		session = sessions.openSession();
		session.beginTransaction();
	}

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
		List<User> list = session.createQuery("from User").list();
		if (list.size() > 0) {
			Assert.assertNotNull(list.get(0));
			Assert.assertEquals("the gender is error.", Gender.FEMALE, list
					.get(0).getGender());
		}
	}

	@Test
	public void selectCarWithInsurance() {
		// List<Insurance> list = session.createQuery("from Insurance").list();
		// if (list.size() > 0) {
		// for (Insurance ins : list) {
		// Integer id = ins.getCar().getId();
		// double cost = ins.getCost();
		// System.out.println("cost " + cost + " id " + id);
		// }
		// }
	}

	@Test
	public void selectCars() {
		List<Car> list = session.createQuery("from Car").list();
		if (list.size() > 0) {
			for (Car car : list) {
				System.out.println("num " + list.size() + " carId"
						+ car.getId() + " " + car.getBrandName());
			}
		}
	}

	@Test
	public void selectCarsWithNoInsurance() {
		session.createSQLQuery("select * from ");
	}

	@Test
	public void selectCarType() {
		List<CarType> list = session.createQuery("from CarType").list();
		for (CarType ct : list) {
			System.err.println(ct.getBrandName() + ct.getId() + "---"
					+ ct.getCategoryName() + "---" + ct.getTypeName());
		}
	}

	@Test
	public void selectCategory() {
		List<Category> list = session.createQuery("from Category").list();
		for (Category c : list) {
			System.err.println(c.getBrandName() + "---" + c.getCategoryName());
		}
	}

	@After
	public void destroy() {
		session.getTransaction().commit();
		session.close();
	}
}
