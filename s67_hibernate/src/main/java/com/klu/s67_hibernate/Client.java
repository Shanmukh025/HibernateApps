package com.klu.s67_hibernate;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Client {
  private static SessionFactory sessionFactory;
  public static void main(String[] args) {
    
    sessionFactory = new Configuration().configure().buildSessionFactory();
    
    Employee emp = new Employee();
    
    emp.setId(15);
    emp.setName("Nikhil");
    emp.setAge(19);
    emp.setSalary(2000000);
    
    saveEmployee(emp);
  }
  
  public static void saveEmployee(Employee e) {
    
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.save(e);
    session.getTransaction().commit();
    session.close();
  }

}