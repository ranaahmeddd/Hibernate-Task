package model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="AUTHOR")
public class Author {

    @Id
    @Column(name = "AUTHOR_ID",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "AUTHOR_NAME")
    private String name;

    @ManyToMany(mappedBy = "authors",cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();

    public Author() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
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
}
