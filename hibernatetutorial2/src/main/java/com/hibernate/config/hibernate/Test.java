package com.hibernate.config.hibernate;

import com.hibernate.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateSessionHelper.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();

        Product product = new Product("sony 2",1300.0,new Date());


        Product product1 = (Product) session.load(Product.class, 4l);
        session.save(product);
        System.out.println(product1);
        session.getTransaction().commit();

        HibernateSessionHelper.shutdown();
    }
}
