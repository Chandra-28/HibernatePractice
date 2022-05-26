package com.chandra.hibernatePackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		Student s1 = new Student();
		s1.setId(2);
		s1.setFirstName("Virat");
		s1.setLastName("Kohli");

		session.save(s1);
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}

}
