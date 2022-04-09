package za.ac.cput.repository;


import za.ac.cput.entity.EmployeeGender;


import java.util.Set;

public interface IEmployeeGender extends  Irepository<EmployeeGender, String>
{



    public Set<EmployeeGender> getAll();
}