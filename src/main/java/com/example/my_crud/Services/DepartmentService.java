package com.example.my_crud.Services;

import com.example.my_crud.Dto.DepartmentDto;
import com.example.my_crud.Model.Department;
import com.example.my_crud.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public ArrayList<Department> getAllDepartments() {
        return (ArrayList<Department>) departmentRepository.findAll();
    }

    public ArrayList<Department> getDepartmentByName(String name) {
        return departmentRepository.findAllByName(name);
    }

    public Department editDepartmentByName(String name, @RequestBody DepartmentDto departmentDto) {
        Department department = departmentRepository.findFirstByName (name);
        department.setName(departmentDto.getName());
        departmentRepository.save(department);
        return department;
    }
}
