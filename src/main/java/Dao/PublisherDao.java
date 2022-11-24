package Dao;

import model.Book;
import model.Publisher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PublisherDao {
    public void insertPublisher(Publisher publisher){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Publisher.class)
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            session.save(publisher);
            transaction.commit();
            System.out.println("Inserted Done!!!");
        }finally {
            sessionFactory.close();
            session.close();
        }
    }
}
