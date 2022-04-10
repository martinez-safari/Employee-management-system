package za.ac.cput.repository;
/*
Full Name Mutmaba Prince Bulambo
Student Number 220177767
Date April 8 2022
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.EmployeeAddress;
import za.ac.cput.factory.EmployeeAddressFactory;
import za.ac.cput.util.Helper;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeAddressRepositoryTest {
    private static EmployeeAddressRepository repository=EmployeeAddressRepository.getInstance();
    private static EmployeeAddress employeeAddress= EmployeeAddressFactory.createEmployeeAddress();
    @Test
    void a_create() {
        EmployeeAddress address=repository.create(employeeAddress);
        assertSame(employeeAddress.getEmployeeId(),address.getEmployeeId());
        System.out.println("Created EmployeeAddress "+ address.toString());
    }

    @Test
    void b_read() {

        EmployeeAddress read= repository.read(employeeAddress.getEmployeeId());
        assertNotNull(read);
        System.out.println(" Read EmployeeAddress "+read);
    }

    @Test
    void c_update() {

        EmployeeAddress update =new EmployeeAddress.Builder().cody(employeeAddress)
                .setAddressTypeId(Helper.generateID()).Build();
        assertNotNull(repository.update(update));
        System.out.println("Updated EmployeeAddress "+update);
    }

    @Test
    void e_delete() {
        EmployeeAddress address=repository.create(employeeAddress);
        boolean success= repository.delete(employeeAddress.getEmployeeId());
        assertTrue(success);

    }

    @Test
    void d_getAll() {
        System.out.println("get all EmployeeAddress "+repository.getAll().toString());
    }
}