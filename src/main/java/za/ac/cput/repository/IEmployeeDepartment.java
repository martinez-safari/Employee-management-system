package za.ac.cput.repository;

/*
Employee-management-system.java
IEmployeeDepartment.java
Author: Martinez Safari 219325332
Date: 09/04/2022
 */

import za.ac.cput.entity.EmployeeDepartment;
import java.util.Set;

public interface IEmployeeDepartment extends Irepository <EmployeeDepartment,String>{
    public Set<EmployeeDepartment> getAll();
}
