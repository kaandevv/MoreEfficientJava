package com.hibernate.criteria;

import com.hibernate.config.hibernate.HibernateSessionHelper;
import com.hibernate.model.manytomany.Roles;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CriteriaTest {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateSessionHelper.buildSessionFactory();
        Session session = sessionFactory.openSession();
//        Criteria criteria = session.createCriteria(Roles.class).add(Restrictions.eq("id",1l));
//        List list = criteria.list();
//        System.out.println(((Admin) list.get(0)).getName());

        Criteria criteria = session.createCriteria(Roles.class);
        criteria.setMaxResults(1);
        Roles roles = (Roles) criteria.uniqueResult();
        System.out.println(roles.getRoleName());

       /* Criteria criteria = session.createCriteria(Roles.class);
        criteria.addOrder(Order.desc("id"));
        List<Roles> list = criteria.list();
        for (Roles roles : list) {
            System.out.println(roles.getRoleId());
        }*/
    }
}
