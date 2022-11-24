package org.example;

import Dao.AuthorDao;
import Dao.BookDao;
import Dao.DepartmentDao;
import Dao.EmployeesDao;
import model.*;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //One To Many
        Department dept = new Department();
        dept.setDepartmentName("lolo");

        Employee emp1 = new Employee();
        emp1.setName("lolo");
        emp1.setSalary(300);
        emp1.setJoiningDate(new Date());
        emp1.setDepartment(dept);

        Employee emp2 = new Employee();
        emp2.setName("rr");
        emp2.setSalary(300);
        emp2.setJoiningDate(new Date());
        emp2.setDepartment(dept);

        dept.setEmployee(Arrays.asList(emp1,emp2));

        DepartmentDao d = new DepartmentDao();
        d.insertDepartment(dept);
       EmployeesDao dao = new EmployeesDao();
       dao.insertEmployee(emp1);

        //test fetch types
//        EmployeesDao dao = new EmployeesDao();
//        System.out.println(Arrays.asList(dao.getEmployeeList()));


        //One To One
//        Book book = new Book();
//        book.setBookName("science book");
//
//        Publisher p = new Publisher();
//        p.setName("ahmed");
//        p.setAge(40);
//        p.setBook(book);
//
//        book.setPublisher(p);
//
//        BookDao dao = new BookDao();
//        dao.insertBook(book);

        //many to many
//        Book book = new Book();
//        book.setBookName("book");
//
//        Book b = new Book();
//        b.setBookName("bbb");
//
//        Author a = new Author();
//        a.setName("author");
//        a.setBooks(Arrays.asList(book,b));
//
//        book.setAuthors(Arrays.asList(a));
//        b.setAuthors(Arrays.asList(a));
//
//        AuthorDao d = new AuthorDao();
//        d.insertAuthor(a);
    }
}