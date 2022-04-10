
/*LeaveFactoryTest.java
 Entity for LeaveFactoryTest
 Author: Kululo Mangcunyana (219387117)
 Date: 10 April 2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Leave;

import static org.junit.jupiter.api.Assertions.*;

class LeaveFactoryTest {
    @Test
    void test(){

        Leave leave=LeaveFactory.createLeave(4);
        assertNotNull(leave);
        System.out.println(leave.toString());

    }


}