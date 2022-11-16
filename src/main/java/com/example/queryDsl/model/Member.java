package com.example.queryDsl.model;


import lombok.*;

import javax.persistence.Id;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
@Data
public class Member implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String memberId;

    private String name;

    @OneToMany(mappedBy = "members")
    private List<Member> members;
}
