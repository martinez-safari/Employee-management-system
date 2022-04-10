package za.ac.cput.repository;
/* IEmployeeSalaryRepository.java
 Interface for the IEmployeeSalaryRepository
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
import za.ac.cput.entity.EmployeeSalary;
import java.util.Set;

public interface IEmployeeSalaryRepository extends Irepository<EmployeeSalary, String>
{
    public Set<EmployeeSalary> getAll();
}
