
/*EmployeeLeave.Interface
 Entity for EmployeeLeave
 Author: Kululo Mangcunyana (219387117)
 Date: 10 April 2022
 */
package za.ac.cput.repository;

import za.ac.cput.entity.EmployeeLeave;

import java.util.Set;

public interface IEmployeeLeaveRepository extends Irepository<EmployeeLeave,String>{
    Set<EmployeeLeave> getAll();

}
