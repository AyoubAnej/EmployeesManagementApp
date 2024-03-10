package ma.ayb.emsbackend.repositories;

import ma.ayb.emsbackend.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
