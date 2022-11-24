package model;

import javax.persistence.*;

@Entity
@Table(name = "PUBLISHER")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PUBLISHER_ID",nullable = false)
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "AGE")
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BOOK_ID")
    private Book book;

    public Publisher() {
    }

    public Publisher(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
