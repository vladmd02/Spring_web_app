package com.example.my_crud.Repository;

import com.example.my_crud.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findAllById(Integer id);
    // Здесь вы можете добавить дополнительные методы, если требуется кастомная логика для работы с сотрудниками.
}
