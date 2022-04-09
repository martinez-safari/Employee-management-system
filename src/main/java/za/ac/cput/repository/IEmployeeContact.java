package za.ac.cput.repository;
/*
IEmployeeContact.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date April 9 2022
 */

import za.ac.cput.entity.Employee;
import za.ac.cput.entity.EmployeeContact;

import java.util.Set;

public interface IEmployeeContact extends Irepository <EmployeeContact,String>{
    public Set<EmployeeContact> getAll();
}
