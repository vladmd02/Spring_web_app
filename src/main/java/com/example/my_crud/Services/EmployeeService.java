package com.example.my_crud.Services;

import com.example.my_crud.Dto.EmployeeDto;
import com.example.my_crud.Model.Employee;
import com.example.my_crud.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;

@Service
public class EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public ArrayList<Employee> getAllEmployees() {
        return (ArrayList<Employee>) employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findAllById(id);
    }

    public Employee editEmployeeById(Integer id, @RequestBody EmployeeDto employeeDto) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if (employee != null) {
            employee.setSalary(employeeDto.getSalary());
            employee.setAge(employeeDto.getAge());
            employee.setName(employeeDto.getName());
            employee.setPosition(employeeDto.getPosition());
            employeeRepository.save(employee);
        }
        return employee;
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

    public Employee createEmployee(@RequestBody EmployeeDto employeeDto) {
        Employee employee = Employee.EmployeeFromDto(employeeDto);
        employeeRepository.save(employee);
        return employee;
    }
}
