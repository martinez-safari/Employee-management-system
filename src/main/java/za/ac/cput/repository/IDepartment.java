package za.ac.cput.repository;

/*
Employee-management-system.java
IDepartment.java
Author: Martinez Safari 219325332
Date: 09/04/2022
 */

import za.ac.cput.entity.Department;
import java.util.Set;

public interface IDepartment extends Irepository <Department,String>{
    public Set<Department> getAll();
}
