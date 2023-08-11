package com.klu.Project67;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Details {
	
	private static SessionFactory sessionFactory;
	public static void main(String[] args)
	{
		sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Student stu = new Student();
		stu.setId(2087);
		stu.setName("Shanmukh");
		stu.setgpa(19);
		stu.setdob(500000);
		
		saveStudent(stu);
	}
	
	public static void saveStudent(Student stu)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(stu);
		session.getTransaction().commit();
		session.close();
	}
}