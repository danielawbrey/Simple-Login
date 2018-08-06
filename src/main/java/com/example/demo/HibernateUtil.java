package com.example.demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure("resources/hibernate.cfg.xml")
                    .addResource("resources/User.hbm.xml")
                    .buildSessionFactory();

            return sessionFactory;

        } catch(Throwable exception) {
            System.err.println("Failed to build database session" + exception);
            throw new ExceptionInInitializerError(exception);
        } finally {
            shutdown();
        }
    }

    public static SessionFactory getSessionFactory() { return sessionFactory; }

    public static void shutdown() { getSessionFactory().close(); }
}
