package za.ac.cput.repository;
/*
Employee-management-system.java
DepartmentRepository.java
Author: Martinez Safari  219325332
Date: 09/04/2022
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,String> {

}

