package com.hibernate.config.hibernate;

import com.hibernate.model.onetomany.Users1;
import com.hibernate.model.onetoone.Address;
import com.hibernate.model.onetoone_uni.onetoone.Address2;
import com.hibernate.model.onetoone_uni.onetoone.Users2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test5 {

    public static void main(String[] args) {
       /* Users2 users2 = new Users2();
        users2.setName("Kaan");

        Address2 address2 = new Address2();
        address2.setName("Address 2");

        address2.setUsers2(users2);

        users2.setAddress2(address2);
*/


        SessionFactory sessionFactory = HibernateSessionHelper.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Address2 address2 = (Address2) session.load(Address2.class, 2);
        System.out.println(address2.getUsers2().getName());
        session.getTransaction().commit();
    }

}
