package com.hibernate.config.hibernate;

import com.hibernate.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeService {

    public void save(Employee employee){
        SessionFactory sessionFactory = HibernateSessionHelper.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.save(employee);
        session.getTransaction().commit();

    }
    public Employee get(Integer id){
        SessionFactory sessionFactory = HibernateSessionHelper.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Employee employee= (Employee)session.get(Employee.class, id);

        System.out.println(employee);
        return employee;
    }
}
