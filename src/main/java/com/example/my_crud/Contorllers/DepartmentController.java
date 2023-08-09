package com.example.my_crud.Contorllers;

import com.example.my_crud.Dto.DepartmentDto;
import com.example.my_crud.Model.Department;
import com.example.my_crud.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/department")
@RestController
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public ArrayList<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/{name}")
    public ArrayList<Department> getDepartmentByName(@PathVariable String name) {
        return departmentService.getDepartmentByName(name);
    }

    @PutMapping("/{name}")
    public Department editDepartmentByName(@PathVariable String name, @RequestBody DepartmentDto departmentDto) {
        return departmentService.editDepartmentByName(name, departmentDto);
    }
}
