package com.example.queryDsl.model;


import lombok.*;

import javax.persistence.Id;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
@Data
//@Builder
//@Access(AccessType.PROPERTY)
//@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member implements Serializable {
    @Id
    private int id;

    private String memberId;

    private String name;

    @OneToMany(mappedBy = "members")
    private List<Member> members;
}
