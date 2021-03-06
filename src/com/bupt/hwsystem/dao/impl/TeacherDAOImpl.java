package com.bupt.hwsystem.dao.impl;

import com.bupt.hwsystem.dao.TeacherDAO;
import com.bupt.hwsystem.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import java.util.List;


public class TeacherDAOImpl implements TeacherDAO {
    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;
    //add the hwsystem
    @Override
    public void addTeacher(Teacher teacher) {

        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        s.save(teacher);
        tx.commit();

    }

    //return all the customers in list
    @Override
    public List<Teacher> listTeacher() {
//        HibernateTemplate ht = getHibernateTemplate();
//        if(ht==null)
//        {
//            System.out.println("listTeacher() getHibernateTemplate() is null");
//            return null;
//        }
//        else
//        {
//            System.out.println("listTeacher() getHibernateTemplate() is not null");
//            return  (List<Teacher>)getHibernateTemplate().find("from Teacher");
//        }
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        Query query = s.createQuery("from Teacher");
        List<Teacher> teacherList =  query.list();
        tx.commit();
        return teacherList;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
