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
}
