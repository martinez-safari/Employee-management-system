package za.ac.cput.repository;

import za.ac.cput.entity.EmployeeAddress;

import java.util.Set;

public interface IEmployeeAddress extends Irepository<EmployeeAddress, String>
{



    public Set<EmployeeAddress> getAll();
}
