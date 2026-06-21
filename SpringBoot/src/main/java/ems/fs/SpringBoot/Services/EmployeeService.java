package ems.fs.SpringBoot.Services;

import ems.fs.SpringBoot.DTO.Employee_DTO;

import java.util.List;

public interface EmployeeService {
    Employee_DTO createEmployee (Employee_DTO employeeDto);

    Employee_DTO getEmployeeById(Long id);

    List<Employee_DTO> getAllEmployees();

    Employee_DTO updateEmployee(Long id, Employee_DTO employeeDto);

    void deleteEmployee(Long id);
}
