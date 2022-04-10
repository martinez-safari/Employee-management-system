

/*LeaveRepositoryTest.java
 Entity for LeaveRositoryTest
 Author: Kululo Mangcunyana (219387117)
 Date: 10 April 2022
 */
package za.ac.cput.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.EmployeeLeave;
import za.ac.cput.entity.Leave;
import za.ac.cput.factory.EmployeeLeaveFactory;

import za.ac.cput.factory.LeaveFactory;
import za.ac.cput.util.Helper;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class LeaveRepositoryTest {

    private static LeaveRepository repository= LeaveRepository.getRepository();
    private static Leave leave= LeaveFactory.createLeave(7);
    @Test
    void a_create() {
        Leave lev = repository.create(leave);
        Assertions.assertSame(leave.getleaveId(), lev.getleaveId());
        System.out.println("Created Entity " + leave.toString());

    }

    @Test
    void b_read() {
        Leave read = repository.read(leave.getleaveId());
        Assertions.assertNotNull(read);
        System.out.println("Entity Read-" + read);
    }

    @Test
    void c_update() {
        Leave updated = (new Leave.Builder()).copy(leave).setdaysOfLeave(5).build();
        Assertions.assertNotNull(repository.update(updated));
        LeaveRepository va = repository;
        System.out.println("Updated Entity-" + va.read(updated.getleaveId()));


    }

    @Test
    void e_delete() {
        boolean success = repository.delete(leave.getleaveId());
        Assertions.assertTrue(success);
        System.out.println(repository.getAll());
    }

    @Test
    void d_getAll() {

        System.out.println("GetAll : " +repository.getAll());
    }
}