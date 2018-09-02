package com.example.demo;

import com.example.demo.objects.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ContextConfiguration
public class HibernateConfigTest {

    @Test
    public void main() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            User user = new User();
            user.setId(1);
            user.setUsername("Daniel");
            user.setPassword("password");
            user.setFirstName("Daniel");
            user.setLastName("Awbrey");
            user.setEmail("sample@email.com");
            session.persist(user);
            session.getTransaction().commit();

        } catch (Exception exception) {
            System.err.println("Error: failed to make session.");
            exception.printStackTrace();
        }
    }
}
