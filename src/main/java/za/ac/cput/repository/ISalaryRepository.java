package za.ac.cput.repository;

import za.ac.cput.entity.Salary;
import za.ac.cput.repository.Irepository;

import java.util.Set;

public interface ISalaryRepository extends Irepository<Salary, String> //replace ObjT & ID
{
    // create read update delete
    public Set<Salary> getAll();
}
//generics