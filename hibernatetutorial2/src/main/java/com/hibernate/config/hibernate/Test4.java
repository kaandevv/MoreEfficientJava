package com.hibernate.config.hibernate;

import com.hibernate.model.onetomany.Address1;
import com.hibernate.model.onetomany.Users1;
import com.hibernate.model.onetoone.Address;
import com.hibernate.model.onetoone.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.HashSet;
import java.util.Set;

public class Test4 {

    public static void main(String[] args) {


/*        Users1 users1 = new Users1();
        users1.setName("Kaan");
        final Address1 address1 = new Address1();
        address1.setName("Eryaman");

        final Address1 address2 = new Address1();
        address2.setName("Ankara");

        Set<Address1> address1Set = new HashSet<Address1>() {{
            add(address1);
            add(address2);
        }};
        users1.setAddress(address1Set);*/

        SessionFactory sessionFactory = HibernateSessionHelper.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Users1 users1 = (Users1) session.load(Users1.class, 1);
        System.out.println(users1.getAddress().size());
//        session.save(users1);
        session.getTransaction().commit();
    }

}
