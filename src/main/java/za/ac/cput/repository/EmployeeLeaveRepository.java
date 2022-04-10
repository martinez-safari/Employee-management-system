/*EmployeeLeaveRepository.java
 Entity for EmployeeLeaveRepository
 Author: Kululo Mangcunyana (219387117)
 Date: 10 April 2022
 */
package za.ac.cput.repository;


import za.ac.cput.entity.EmployeeLeave;
import za.ac.cput.entity.Leave;

import java.util.HashSet;
import java.util.Set;

public class EmployeeLeaveRepository implements IEmployeeLeaveRepository{
    private static EmployeeLeaveRepository repository= null;
    private final Set<EmployeeLeave> employeeleaveDB;

    private EmployeeLeaveRepository(){
        employeeleaveDB= new HashSet<>();
    }
    public static EmployeeLeaveRepository getRepository(){
        if (repository==null){
            repository= new EmployeeLeaveRepository();
        }
        return repository;
    }


    @Override
    public EmployeeLeave create(EmployeeLeave employeeLeave) {
        boolean create = employeeleaveDB.add(employeeLeave);
        if (!create)
            return null;
        return employeeLeave;
    }


    @Override
    public EmployeeLeave read(String employeeId) {
        EmployeeLeave  empleave= employeeleaveDB.stream().
                filter(e ->e.getemployeeId().equals(employeeId))
                .findAny()
                .orElse(null);
        return empleave;
    }


    @Override
    public EmployeeLeave update(EmployeeLeave employeeLeave) {
        EmployeeLeave oldEmployeeLeave = read(employeeLeave.getemployeeId());
        if(oldEmployeeLeave!=null){
            employeeleaveDB.remove(oldEmployeeLeave);
            employeeleaveDB.add(employeeLeave);

        }
        return employeeLeave;
    }

    @Override
    public boolean delete(String employeeId) {
        EmployeeLeave employeeLeaveToDelete = read(employeeId);
        if(employeeLeaveToDelete==null)
            return false;
        employeeleaveDB.remove(employeeLeaveToDelete);
        return true;
    }

    @Override
    public Set<EmployeeLeave> getAll() {

        return employeeleaveDB;
    }
}
