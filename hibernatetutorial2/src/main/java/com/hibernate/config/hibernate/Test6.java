package com.hibernate.config.hibernate;

import com.hibernate.model.manytomany.Admin;
import com.hibernate.model.manytomany.Roles;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test6 {

    public static void main(String[] args) {
  /*      Admin admin = new Admin();
        admin.setName("DenemeAdmin");


        List<Roles> roles = new Vector<Roles>();
        Roles roles1 = new Roles();
        roles1.setRoleName("denemeRole1");

        Roles roles2 = new Roles();
        roles2.setRoleName("denemeRole2");

        roles.add(roles1);
        roles.add(roles2);*/

//        admin.setRoles(roles);
        SessionFactory sessionFactory = HibernateSessionHelper.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
//        session.save(admin);
        Admin admin = (Admin) session.load(Admin.class, 1l);
        System.out.println(admin.getRoles().size());
        session.getTransaction().commit();
    }

}
