/*LeaveRepository.java
 Entity for LeaveRepository
 Author: Kululo Mangcunyana (219387117)
 Date: 10 April 2022
 */
package za.ac.cput.repository;


import za.ac.cput.entity.Leave;

import java.util.HashSet;
import java.util.Set;

public class LeaveRepository implements ILeaveRepository{
    private Set<Leave> leaveDB ;
    private static LeaveRepository repository= null;
    private LeaveRepository(){
        leaveDB= new HashSet<Leave>();
    }
    public static LeaveRepository getRepository(){
        if (repository==null){
            repository= new LeaveRepository();
        }
        return repository;
    }

    @Override
    public Leave create(Leave leave) {
        boolean create = leaveDB.add(leave);
        if (!create)
            return null;
        return leave;
    }

    @Override
    public Leave read(String employeeId) {
        Leave leave= leaveDB.stream().
                filter(e ->e.getleaveId().equals(employeeId))
                .findAny().orElse(null);
        return leave;
    }

    @Override
    public Leave update(Leave leave) {
        Leave oldLeave = read(leave.getleaveId());
        if(oldLeave!=null){
            leaveDB.remove(oldLeave);
            leaveDB.add(leave);

        }
        return leave;
    }

    @Override
    public boolean delete(String leaveId) {
        Leave leaveToDelete = read(leaveId);
        if(leaveToDelete==null)
            return false;
        leaveDB.remove(leaveToDelete);
        return true;
    }

    @Override
    public Set<Leave> getAll() {
        return leaveDB;
    }
}


