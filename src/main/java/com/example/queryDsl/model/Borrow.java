package com.example.queryDsl.model;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table
@Data
//@Builder
//@Access(AccessType.PROPERTY)
//@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Borrow implements Serializable {
    @Id
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "members")
    private Member members;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "books")
    private Book books;
}
