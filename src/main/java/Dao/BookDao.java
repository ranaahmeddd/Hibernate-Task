package Dao;

import model.Book;
import model.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookDao {
    public void insertBook(Book book){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Book.class)
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
            System.out.println("Inserted Done!!!");
        }finally {
            sessionFactory.close();
            session.close();
        }
    }
}
