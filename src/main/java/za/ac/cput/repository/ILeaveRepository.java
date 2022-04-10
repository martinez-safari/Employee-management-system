/*Leave.Interface
 Entity for EmployeeLeave
 Author: Kululo Mangcunyana (219387117)
 Date: 10 April 2022
 */
package za.ac.cput.repository;

import za.ac.cput.entity.Leave;

import java.util.Set;

public interface ILeaveRepository extends Irepository<Leave,String>{
    public Set<Leave> getAll();

}