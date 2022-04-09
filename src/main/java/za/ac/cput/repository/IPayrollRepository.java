package za.ac.cput.repository;
/* IPayrollRepository.java
 Interface for the IPayrollRepository
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
import za.ac.cput.entity.Payroll;
import java.util.Set;

public interface IPayrollRepository extends Irepository<Payroll, String>
{ // create read update delete
    public Set<Payroll> getAll();
}
