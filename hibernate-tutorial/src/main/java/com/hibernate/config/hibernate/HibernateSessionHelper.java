package com.hibernate.config.hibernate;

import com.hibernate.model.Employee;
import com.hibernate.model.Product;
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
        return configuration;
    }


    public static void shutdown() {
        buildSessionFactory().close();
    }
}
