package za.ac.cput.repository;

import za.ac.cput.entity.Payroll;
import za.ac.cput.entity.Salary;

import java.util.Set;

public interface IPayrollRepository extends Irepository<Payroll, String>
{
    // create read update delete
    public Set<Payroll> getAll();
}
