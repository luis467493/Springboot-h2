package com.test.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Student {
    @Id
    @Column
    private int id;
    @Column
    private int age;
    @Column
    private String name;
    @Column
    private String email;
}
