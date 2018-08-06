package com.example.demo.dao;

import com.example.demo.HibernateUtil;
import com.example.demo.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository("RegistryDAO")
public class RegistryDAOImpl implements RegistryDAO {

    private static int id;

    @Override
    public boolean register(String username, String password,
                            String firstname, String lastname, String email) {

        boolean flag = false;

        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            User user = new User();
            user.setId(++id);
            user.setUserName(username);
            user.setPassword(password);
            user.setFirstName(firstname);
            user.setLastName(lastname);
            user.setEmail(email);
            session.save(user);
            session.getTransaction().commit();
            flag = true;
        } catch (Exception exception) {
            System.err.println("Error: Failure to create session.");
            exception.printStackTrace(System.err);
        }
        return flag;
    }

    @Override
    public boolean verify(String username, String password) {
        Transaction transaction;
        boolean flag = false;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String passwordFromDB;
            transaction = session.beginTransaction();
            Query query = session.createQuery("FROM User user WHERE user.username = :username");
            if (query != null) {
                query = session.createQuery("SELECT user.password FROM User user WHERE user.username = :username");
                passwordFromDB = query.toString();
                if (password.equals(passwordFromDB)) { flag = true; }
            }
            transaction.commit();
            session.close();

        } catch (Exception exception) {
            System.err.println("Error: Failure to create session.");
            exception.printStackTrace(System.err);
        }

        return flag;
    }
}