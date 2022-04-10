

/*EmployeeLeaveRepositoryTest.java
 Entity for EmployeeLeaveRepositoryTest
 Author: Kululo Mangcunyana (219387117)
 Date: 10 April 2022
 */
package za.ac.cput.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.EmployeeLeave;
import za.ac.cput.factory.EmployeeLeaveFactory;
import za.ac.cput.util.Helper;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeLeaveRepositoryTest {
    private static EmployeeLeaveRepository repository= EmployeeLeaveRepository.getRepository();
    private static EmployeeLeave employeeLeave= EmployeeLeaveFactory.createEmployeeLeave();

    @Test
    void a_create() {
        EmployeeLeave emplv1 = repository.create(employeeLeave);
        Assertions.assertSame(emplv1.getemployeeId(), employeeLeave.getemployeeId());
        System.out.println("Created Entity " + emplv1.toString());
    }

    @Test
    void b_read() {
        EmployeeLeave read = repository.read(employeeLeave.getemployeeId());
        Assertions.assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        EmployeeLeave update = (new EmployeeLeave.Builder()).copy(employeeLeave).setemployeeId(Helper.generateID()).build();
        Assertions.assertNotNull(repository.update(update));
        System.out.println("Updated Entity-" + repository.getAll());

    }

    @Test
    void e_delete() {
        boolean success = repository.delete(employeeLeave.getemployeeId());
        Assertions.assertTrue(success);
        System.out.println(repository .getAll());
    }

    @Test
    void d_getAll() {

        System.out.println("Get All: "+repository.getAll());
    }
}