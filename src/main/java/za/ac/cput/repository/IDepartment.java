package za.ac.cput.repository;

import za.ac.cput.entity.Department;

import java.util.Set;

public interface IDepartment extends Irepository <Department,String>{
    public Set<Department> getAll();
}
