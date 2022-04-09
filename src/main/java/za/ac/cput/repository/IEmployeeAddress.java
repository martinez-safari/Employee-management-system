package za.ac.cput.repository;
/*
Full Name Mutmaba Prince Bulambo
Student Number 220177767
Date April 8 2022
 */
import za.ac.cput.entity.EmployeeAddress;

import java.util.Set;

public interface IEmployeeAddress extends Irepository<EmployeeAddress, String>
{



    public Set<EmployeeAddress> getAll();
}
