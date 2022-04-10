/*EmployeeLeaveFactory.java
 Entity for EmployeeLeaveFactory
 Author: Kululo Mangcunyana (219387117)
 Date: 10 April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.EmployeeLeave;
import za.ac.cput.entity.Leave;
import za.ac.cput.util.Helper;

public class EmployeeLeaveFactory {
    public static EmployeeLeave createEmployeeLeave(){
        String empId = Helper.generateID();
        String lvId = Helper.generateID();
        EmployeeLeave empleave = new EmployeeLeave.Builder().setemployeeId(empId)
                .setleaveId(lvId).build();
        return empleave;
    }
}
