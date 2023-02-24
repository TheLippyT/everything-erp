package sr.thelippyt.employeemanagement.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sr.thelippyt.employeemanagement.model.Employee;
import sr.thelippyt.employeemanagement.service.EmployeeService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping(value = "/employees")
    public List<Employee> findAllEmployees() {
        return employeeService.findAll();
    }

}
