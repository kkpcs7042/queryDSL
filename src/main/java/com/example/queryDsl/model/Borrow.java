package com.example.queryDsl.model;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table
@Data
public class Borrow implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "members")
    private Member members;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "books")
    private Book books;
}
