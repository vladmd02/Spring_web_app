package com.example.my_crud.Dto;

import com.example.my_crud.Model.Department;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartmentDto {

    private Integer id;
    private String name;

    public DepartmentDto createDtoFromEntity(Department department) {
        DepartmentDto departmentDto = new DepartmentDto(department.getId(), department.getName());
        // return departmentDto;
        return DepartmentDto
                .builder()
                .id(department.getId())
                .name(department.getName())
                .build();
    }
}
