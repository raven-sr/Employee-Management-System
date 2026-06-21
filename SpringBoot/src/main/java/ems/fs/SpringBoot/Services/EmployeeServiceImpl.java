package ems.fs.SpringBoot.Services;

import ems.fs.SpringBoot.DTO.Employee_DTO;
import ems.fs.SpringBoot.Repository.Employee_repository;
import ems.fs.SpringBoot.entity.Employee;
import ems.fs.SpringBoot.mapper.EmployeeMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class EmployeeServiceImpl implements EmployeeService{

    private Employee_repository employeeRepository;

    @Override
    public Employee_DTO createEmployee(Employee_DTO employeeDto) {
        Employee employee = EmployeeMapper .maptoEmployee(employeeDto);
        Employee createEmployee = employeeRepository.save(employee);
        return EmployeeMapper.maptoEmployee_Dto(createEmployee);
    }

    @Override
    public Employee_DTO getEmployeeById(Long id){
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employees Nt Found"));
        return EmployeeMapper.maptoEmployee_Dto(employee);
    }

    @Override
    public List<Employee_DTO> getAllEmployees(){
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(EmployeeMapper::maptoEmployee_Dto).toList();
    }

    @Override
    public Employee_DTO updateEmployee(Long id, Employee_DTO employeeDto){
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee Id Not available"));
        employee.setFirst_name(employeeDto.getFirst_name());
        employee.setLast_name(employeeDto.getLast_name());
        employee.setEmail(employeeDto.getEmail());
        employee.setPh(employee.getPh());
        Employee updatedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.maptoEmployee_Dto(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long id){
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee not available"));
        employeeRepository.delete(employee);
    }
}
