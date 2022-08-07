package za.ac.cput.repository;

/*
Employee-management-system.java
EmployeeDepartmentRepository.java
Author: Martinez Safari 219325332
Date: 09/04/2022
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeDepartmentRepository extends JpaRepository<EmployeeDepartmentRepository,String> {

}