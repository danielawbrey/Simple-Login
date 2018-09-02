package com.example.demo.objects;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            System.out.println("Hibernate configuration loaded");
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            System.out.println("Hibernate service registry created");
            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            if (sessionFactory != null) System.out.println("Hibernate session factory created");
            return sessionFactory;
        } catch(HibernateException exception){
            System.out.println("Problem creating session factory");
            exception.printStackTrace();
            throw new ExceptionInInitializerError(exception);
        }
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) { sessionFactory = buildSessionFactory(); }
        return sessionFactory;
    }
}
