package com.jag.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setStudent_name("jag");
		
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		//here i will do CRUD operations
		
		student = (Student) session.get(Student.class, 1);
		
		student.setStudent_name("denn");
		session.update(student);
		
		//System.out.println("student name is "+student.getStudent_name());
		
		session.getTransaction().commit();
		session.close();
		
	}
	
}
