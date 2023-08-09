package com.example.my_crud.Dto;

import com.example.my_crud.Model.Department;
import com.example.my_crud.Model.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDto {

    private int id;

    private String name;

    private String position;

    private int age;

    private int salary;

    private Department department;

    public EmployeeDto createDtoFromEntity(Employee employee) {
        return EmployeeDto
                .builder()
                .id(employee.getId())
                .name(employee.getName())
                .position(employee.getPosition())
                .age(employee.getAge())
                .salary(employee.getSalary())
                .department(employee.getDepartment()).build();
    }

}
