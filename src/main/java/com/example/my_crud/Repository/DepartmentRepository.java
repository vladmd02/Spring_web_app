package com.example.my_crud.Repository;

import com.example.my_crud.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    ArrayList<Department> findAllByName(String name);

    Department findFirstByName(String name);
    // Здесь вы можете добавить дополнительные методы, если требуется кастомная логика для работы с отделами.
}
