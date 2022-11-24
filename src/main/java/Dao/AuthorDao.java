package Dao;

import model.Author;
import model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AuthorDao {
    public void insertAuthor(Author author){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Author.class)
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            session.save(author);
            transaction.commit();
            System.out.println("Inserted Done!!!");
        }finally {
            sessionFactory.close();
            session.close();
        }
    }
}
