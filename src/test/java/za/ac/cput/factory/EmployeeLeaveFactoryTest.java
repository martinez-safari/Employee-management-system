/*EmployeeLeaveFactoryTest.java
 Entity for EmployeeLeaveFactoryTest
 Author: Kululo Mangcunyana (219387117)
 Date: 10 April 2022
 */

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.EmployeeLeave;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeLeaveFactoryTest {
    private static EmployeeLeave EmpLeave = EmployeeLeaveFactory.createEmployeeLeave();
    @Test
   void createEmployeeLeave(){

        assertNotNull(EmpLeave);
        System.out.println(EmpLeave.toString());

    }

}