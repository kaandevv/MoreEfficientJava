package com.hibernate.config.hibernate;

import com.hibernate.model.manytomany.Admin;
import com.hibernate.model.manytomany.Roles;
import com.hibernate.model.onetomany.Address1;
import com.hibernate.model.onetomany.Users1;
import com.hibernate.model.onetoone.Address;
import com.hibernate.model.Employee;
import com.hibernate.model.Product;
import com.hibernate.model.onetoone.Users;
import com.hibernate.model.onetoone_uni.onetoone.Address2;
import com.hibernate.model.onetoone_uni.onetoone.Users2;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateSessionHelper {
    public static SessionFactory buildSessionFactory() {
        SessionFactory sessionFactory;
        try {
            sessionFactory = annotationConfiguration().
                    configure().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
        return sessionFactory;
    }


    public static AnnotationConfiguration annotationConfiguration() {
        AnnotationConfiguration configuration = new AnnotationConfiguration();
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Product.class);
        configuration.addAnnotatedClass(Users.class);
        configuration.addAnnotatedClass(Address.class);
        configuration.addAnnotatedClass(Users1.class);
        configuration.addAnnotatedClass(Address1.class);
        configuration.addAnnotatedClass(Users2.class);
        configuration.addAnnotatedClass(Address2.class);
        configuration.addAnnotatedClass(Admin.class);
        configuration.addAnnotatedClass(Roles.class);
        return configuration;
    }


    public static void shutdown() {
        buildSessionFactory().close();
    }
}
