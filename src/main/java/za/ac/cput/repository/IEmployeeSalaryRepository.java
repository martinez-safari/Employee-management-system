package za.ac.cput.repository;

import za.ac.cput.entity.EmployeeSalary;
import za.ac.cput.entity.Payroll;

import java.util.Set;

public interface IEmployeeSalaryRepository extends Irepository<EmployeeSalary, String>
{
    public Set<EmployeeSalary> getAll();
}
