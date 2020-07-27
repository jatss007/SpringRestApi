package com.example.springdemo.employee;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private int salary;
    private String designation;

    public User(){

    }

    public User(String name,int salary,String  designation){
        this.setName(name);
        this.setSalary(salary);
        this.setDesignation(designation);
    }

    public User(int id,String name,int salary,String  designation){
        this.setId(id);
        this.setName(name);
        this.setSalary(salary);
        this.setDesignation(designation);
    }

}
