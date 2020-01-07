package com.hibernate.config.hibernate;

import com.hibernate.model.onetoone.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test3 {

    public static void main(String[] args) {
     /*   Users users = new Users();
        users.setName("Kaan");

        Address address = new Address();
        address.setName("Eryaman");
        users.setAddress(address);*/

        SessionFactory sessionFactory = HibernateSessionHelper.buildSessionFactory();
        Session session = sessionFactory.openSession();
//        session.persist(users);
        Users users = (Users) session.load(Users.class, 1);
        System.out.println(users.getName());
        System.out.println("1.kısım");
        System.out.println(users.getAddress().getName());
        System.out.println("2.kısım");
        session.clear();
//        session.evict(users);
        Users users2 = (Users) session.load(Users.class, 1);
        System.out.println(users2);
        System.out.println("3.kısım");
    }
}
