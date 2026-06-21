package ems.fs.SpringBoot.mapper;

import ems.fs.SpringBoot.DTO.Employee_DTO;
import ems.fs.SpringBoot.entity.Employee;

public class EmployeeMapper {

    public static Employee_DTO maptoEmployee_Dto (Employee employee){
        return new Employee_DTO(
                employee.getId(),
                employee.getFirst_name(),
                employee.getLast_name(),
                employee.getEmail(),
                employee.getPh()
        );
    }

    public static Employee maptoEmployee (Employee_DTO employee_dto){
        return new Employee(
                employee_dto.getId(),
                employee_dto.getFirst_name(),
                employee_dto.getLast_name(),
                employee_dto.getEmail(),
                employee_dto.getPh()
        );
    }
}
