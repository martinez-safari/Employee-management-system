package za.ac.cput.repository;
/* ISalaryRepository.java
 Interface for the ISalaryRepository
 Author: Taariq Khan (219231141)
 Date: 2 April 2022
*/
import za.ac.cput.entity.Salary;
import za.ac.cput.repository.Irepository;

import java.util.Set;

public interface ISalaryRepository extends Irepository<Salary, String> //replace ObjT & ID
{
    // create read update delete
    public Set<Salary> getAll();
}
//generics