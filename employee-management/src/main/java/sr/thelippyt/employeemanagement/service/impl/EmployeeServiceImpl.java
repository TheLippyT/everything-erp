package sr.thelippyt.employeemanagement.service.impl;

import lombok.RequiredArgsConstructor;
import sr.thelippyt.employeemanagement.model.Employee;
import sr.thelippyt.employeemanagement.repository.EmployeeRepository;
import sr.thelippyt.employeemanagement.service.EmployeeService;

import java.util.List;

@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findEmployeeById(String id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(String id) {
        if (id == null) {
            throw new IllegalArgumentException("ID can't be null");
        }
        employeeRepository.deleteById(id);
    }
}
