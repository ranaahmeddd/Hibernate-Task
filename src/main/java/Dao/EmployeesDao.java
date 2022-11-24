package Dao;


import model.Employee;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.query.Query;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.util.*;


public class EmployeesDao {

    public List<Employee> getEmployeeList(){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
         try {
             Transaction transaction = session.beginTransaction();
             List<Employee> empList = session.getNamedQuery("findEmployee").list();
             transaction.commit();
             return empList;
         }finally {
             sessionFactory.close();
             session.close();
         }
    }
    public void insertEmployee(Employee emp){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            session.save(emp);
            transaction.commit();
            System.out.println("Inserted Done!!!");
        }finally {
            sessionFactory.close();
            session.close();
        }
    }
    public void deleteEmployee(int id){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            Query query =session.getNamedQuery("DeleteEmployee");
            query.setParameter("id",id);
            query.executeUpdate();
            transaction.commit();
            System.out.println("Deleted Done!!!");
        }finally {
            sessionFactory.close();
            session.close();
        }
    }
    public void updateEmployeeName(int id, String name){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            Query query =session.getNamedQuery("updateEmployee");
            query.setParameter("name",name);
            query.setParameter("id",id);
            query.executeUpdate();
            transaction.commit();
            System.out.println("updated Done!!!");
        }finally {
            sessionFactory.close();
            session.close();
        }
    }
}
