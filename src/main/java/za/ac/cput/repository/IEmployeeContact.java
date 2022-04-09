package za.ac.cput.repository;

import za.ac.cput.entity.Employee;
import za.ac.cput.entity.EmployeeContact;

import java.util.Set;

public interface IEmployeeContact extends Irepository <EmployeeContact,String>{
    public Set<EmployeeContact> getAll();
}
