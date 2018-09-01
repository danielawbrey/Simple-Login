package com.example.demo;

import com.example.demo.objects.HibernateUtil;
import com.example.demo.objects.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ContextConfiguration
public class HibernateConfigTest {

    @Test
    public void main() {

        SessionFactory sessionFactory = null;

        try {
            User user = new User();
            user.setId(1);
            user.setUsername("Daniel");
            user.setPassword("password");
            user.setFirstName("Daniel");
            user.setLastName("Awbrey");
            user.setEmail("sample@email.com");

            sessionFactory = HibernateUtil.getSessionFactory();
            //session = HibernateUtil.getSessionFactory().openSession();

            //Transaction transaction = session.beginTransaction();
            //session.save(user);
            //transaction.commit();

        } catch (Exception exception) {
            System.err.println("Error: failed to make session.");
            exception.printStackTrace();
        } finally {
            //if(session != null) session.getSession().close();
        }
    }
}
