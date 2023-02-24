package sr.thelippyt.employeemanagement.service;

import sr.thelippyt.employeemanagement.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findEmployeeById(String id);

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(String id);
}
