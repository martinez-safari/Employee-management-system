package za.ac.cput.repository;
/*
Full Name Mutmaba Prince Bulambo
Student Number 220177767
Date April 8 2022
 */

import za.ac.cput.entity.EmployeeGender;


import java.util.Set;

public interface IEmployeeGender extends  Irepository<EmployeeGender, String>
{



    public Set<EmployeeGender> getAll();
}