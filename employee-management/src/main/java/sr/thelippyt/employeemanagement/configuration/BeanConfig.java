package sr.thelippyt.employeemanagement.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sr.thelippyt.employeemanagement.repository.EmployeeRepository;
import sr.thelippyt.employeemanagement.service.EmployeeService;
import sr.thelippyt.employeemanagement.service.impl.EmployeeServiceImpl;

@Configuration
public class BeanConfig {

    @Bean
    public EmployeeService employeeService(EmployeeRepository employeeRepository) {
        return new EmployeeServiceImpl(employeeRepository);
    }
}
