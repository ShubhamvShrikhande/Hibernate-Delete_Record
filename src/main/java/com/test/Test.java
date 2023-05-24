package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Student student = (Student) session.get(Student.class, 1);
		session.delete(student);
		transaction.commit();
		session.close();
		System.out.println("Record Delete Successfully");
		
	}

}
