/*LeaveFactory.java
 Entity for LeaveFactory
 Author: Kululo Mangcunyana (219387117)
 Date: 10 April 2022
 */

package za.ac.cput.factory;

import za.ac.cput.entity.EmployeeLeave;
import za.ac.cput.entity.Leave;
import za.ac.cput.util.Helper;

public class LeaveFactory {
     public static Leave createLeave(int daysOfLeave){
        String lvId = Helper.generateID();
        Leave leave = new Leave.Builder()
                .setleaveId(lvId)
                .setdaysOfLeave(daysOfLeave)
                .build();
        return leave;
    }
}