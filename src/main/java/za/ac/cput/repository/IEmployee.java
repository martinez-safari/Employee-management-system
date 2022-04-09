package za.ac.cput.repository;

import za.ac.cput.entity.Employee;

import java.util.Set;

public interface IEmployee extends   Irepository<Employee,String>{
    public Set<Employee> getAll();
}
