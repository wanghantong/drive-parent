/**

 * 创建时间：Sep 11, 2014 5:15:45 PM

 * 项目名称：finance-persist

 * @author T.Y

 * @version 1.0

 * @since JDK 1.7

 * 文件名称：TestDelete.java

 * 类说明：

 */
package com.dragon.drive.domain;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestDelete {

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
	/**
	 * 
	 * Title: deleteAccident
	 *
	 * <p>Description: </p>
	 *	参见文档:http://docs.jboss.org/hibernate/orm/4.3/manual/en-US/html_single/#example-parentchild
	 *
	 */
	public void deleteAccident() {

		Accident accident = (Accident) session
				.createQuery("from Accident where id=?").setInteger(0, 1)
				.uniqueResult();
		// --carId=N,可能存在多个事故---bug
		// List<Accident> list = session.createQuery("from Accident where id=?")
		// .setInteger(0, 1).list();

		Car car = (Car) session.createQuery("from Car where id=?")
				.setInteger(0, 1).uniqueResult();

		car.getAccidents().remove(accident);

		// int i = session.createQuery("delete from Accident where id=?")
		// .setInteger(0, 2).executeUpdate();
		session.delete(accident);
		session.flush();
	}

	@Test
	public void deleteCar() {
		// 需要级联删除accident
		// 需要级联删除Insurance
		int executeUpdate = session.createQuery("delete from Car where id=?")
				.setInteger(0, 8).executeUpdate();
		System.out.println(executeUpdate);
	}

	@Test
	public void deleteUser() {
		// 需要级联删除Car----需要级联删除accident,需要级联删除Insurance
	}

	@After
	public void destroy() {
		session.getTransaction().commit();
		session.close();
	}

}
