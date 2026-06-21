package ems.fs.SpringBoot.Repository;

import ems.fs.SpringBoot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employee_repository extends JpaRepository<Employee, Long> {

}
