package com.springboot.db.model;

import javax.persistence.*;

@Entity // employee class will map with the table
@Table(name = "employee")
public class Employee {

    //ORM -> Object Relation Mapping -> java object maps with relation(table)

    @Id //primary key
    @GeneratedValue //Auto_Increment
    private int id;
    @Column(name = "employeename")
    private String name;
    @Column(name = "mobile")
    Long mobile;

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

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }
}
