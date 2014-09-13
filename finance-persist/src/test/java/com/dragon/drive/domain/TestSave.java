package com.dragon.drive.domain;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestSave {

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

	@Test
	public void testSaveUser() {

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
	}

	@Ignore
	@Test
	public void testSaveCar() {

		Car car = new Car();
		car.setBrandName("BMW");
		car.setCarlicence("13332432fdsa");
		car.setEnginenum("22233131");
		car.setMileage(12222);
		car.setPlatenum("京A88888");
		car.setTypeName("豪华");
		car.setCatergoryName("3.0T");
		session.save(car);
	}

	@Ignore
	@Test
	public void testSaveInsuranceWithNewCar() {

		Car car = new Car();
		car.setBrandName("奔驰");
		car.setCarlicence("133324322fdsa");
		car.setEnginenum("222331231");
		car.setMileage(12222);
		car.setPlatenum("京A88878");
		car.setTypeName("豪华");
		car.setCatergoryName("3.0T");

		Insurance insurance = new Insurance();
		insurance.setAccidentTimes(2);
		insurance.setCost(22222);
		insurance.setInsuranceEndtime(new Date());
		insurance.setInsuranceStarttime(new Date());
		insurance.setStatus(true);
		insurance.setProtector("李晓明");
		insurance.setName("平安保险");
		insurance.setInformation("车门损坏，换了一个车门");

		car.setInsurance(insurance);
		session.save(insurance);
		session.save(car);

	}

	@Ignore
	@Test
	public void testSaveInsuranceByPrisistCar() {
		Car car = (Car) session.createQuery("from Car where id=?")
				.setInteger(0, 1).uniqueResult();

		Insurance insurance = new Insurance();
		insurance.setAccidentTimes(2);
		insurance.setCost(22222);
		insurance.setInsuranceEndtime(new Date());
		insurance.setInsuranceStarttime(new Date());
		insurance.setStatus(true);
		insurance.setProtector("李小强");
		insurance.setName("太平保险");
		insurance.setInformation("车门损坏，换了一个车门");
		car.setInsurance(insurance);
		session.save(insurance);
		session.save(car);
	}

	@Ignore
	@Test
	public void saveAccident() {
		Car car = (Car) session.createQuery("from Car where id=?")
				.setInteger(0, 1).uniqueResult();

		Accident accident = new Accident();
		accident.setAccidentType(AccidentType.unilateral);
		accident.setCost(3000);
		accident.setDescription("自己撞树了");
		accident.setHurt(false);
		accident.setTime(new Date());
		accident.setStatus(true);

		car.getAccidents().add(accident);
		session.save(car);
	}

	@Test
	public void saveBrand() {
		Brand brand = new Brand();
		brand.setBrandName("奥迪");
		session.save(brand);
	}

	@Test
	public void saveCategory() {
		Category catergory = new Category();
		catergory.setCategoryName("S600");
		catergory.setBrandName("奔驰");
		session.save(catergory);
	}

	@Test
	public void saveCarType() {
		CarType type = new CarType();
		type.setBrandName("奔驰");
		type.setCategoryName("S600");
		type.setTypeName("3.0T商务豪华");

		session.save(type);

	}

	@After
	public void destroy() {
		session.getTransaction().commit();
		session.close();
	}

}
