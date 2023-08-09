package com.example.my_crud.Model;

import com.example.my_crud.Dto.EmployeeDto;
import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String position;

    @Column
    private int age;

    @Column
    private int salary;

//    @Column
//    private int department_id;

    @ManyToOne
    @JoinColumn(name = "department_id") // "department_id" is the name of the foreign key column in the Employee table
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee( String name, String position, int age, int salary) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    public static Employee EmployeeFromDto (EmployeeDto employeeDto ) {
        return new Employee( employeeDto.getName() , employeeDto.getPosition(), employeeDto.getAge() , employeeDto.getSalary());
    }

}
