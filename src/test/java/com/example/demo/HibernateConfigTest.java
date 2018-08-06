package com.example.demo;

import com.example.demo.dao.RegistryDAO;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HibernateConfigTest {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
}
