package za.ac.cput.repository;

import za.ac.cput.entity.EmployeeDepartment;

import java.util.Set;

public interface IEmployeeDepartment extends Irepository <EmployeeDepartment,String>{
    public Set<EmployeeDepartment> getAll();
}
