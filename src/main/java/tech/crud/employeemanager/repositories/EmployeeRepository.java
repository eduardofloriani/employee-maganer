package tech.crud.employeemanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.crud.employeemanager.model.EmployeeModel;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {
    Optional<EmployeeModel> findEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}
