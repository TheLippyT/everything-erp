package sr.thelippyt.employeemanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sr.thelippyt.employeemanagement.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
