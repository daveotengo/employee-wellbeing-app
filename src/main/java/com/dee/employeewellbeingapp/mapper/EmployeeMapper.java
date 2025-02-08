package com.dee.employeewellbeingapp.mapper;

import com.dee.employeewellbeingapp.blueprint.EntityMapper;
import com.dee.employeewellbeingapp.dto.EmployeeDTO;
import com.dee.employeewellbeingapp.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {})
public interface EmployeeMapper extends EntityMapper<EmployeeDTO, Employee> {
    //EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
}
