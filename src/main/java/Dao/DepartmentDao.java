package Dao;

import model.Department;
import model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DepartmentDao {
    public List<Employee> getEDepartmentList(){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            List<Employee> empList = session.createQuery("from Department").list();
            transaction.commit();
            return empList;
        }finally {
            sessionFactory.close();
            session.close();
        }
    }

    public void insertDepartment(Department dep){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            session.save(dep);
            transaction.commit();
            System.out.println("Inserted Done!!!");
        }finally {
            sessionFactory.close();
            session.close();
        }
    }
}
