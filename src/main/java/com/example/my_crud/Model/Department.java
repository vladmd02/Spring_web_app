package com.example.my_crud.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

//    @Column
//    private int employee_id;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public Department() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department(String name, String position, int age, int salary) {
        this.name = name;
    }

}

