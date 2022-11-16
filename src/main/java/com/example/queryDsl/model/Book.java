package com.example.queryDsl.model;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table
@Getter @Setter
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookId;

    private String name;

    @OneToMany(mappedBy = "books")
    private List<Book> books;

    public Book(){}
}
