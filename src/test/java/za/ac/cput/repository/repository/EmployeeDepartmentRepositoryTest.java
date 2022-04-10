package za.ac.cput.repository.repository;

/*
Employee-management-system.java
EmployeeDepartmentRepositoryTest.java
Author: Martinez Safari 219325332
Date: 09/04/2022
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.EmployeeDepartment;
import za.ac.cput.factory.EmployeeDepartmentFactory;


import za.ac.cput.repository.EmployeeDepartmentRepository;
import za.ac.cput.util.Helper;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
public class EmployeeDepartmentRepositoryTest {

    private static EmployeeDepartmentRepository repository = EmployeeDepartmentRepository.getInstance();
    private static EmployeeDepartment empDept = EmployeeDepartmentFactory.createEmployeeDepartment();


    @Test
    void a_create() {
        EmployeeDepartment empDepart = repository.create(empDept);
        assertSame(empDept.getEmployeeId(), empDepart.getEmployeeId());
        System.out.println("Create EmployeeDepartment  Entity " + empDepart.toString());
    }

    @Test
    void b_read() {
        EmployeeDepartment read = repository.read(empDept.getEmployeeId());
        assertNotNull(read);
        System.out.println("Read EmployeeDepartment Entity " + read);
    }

    @Test
    void c_update() {
        EmployeeDepartment update = new EmployeeDepartment.Builder().copy(empDept)
                .setDeptId(Helper.generateID()).build();
        assertNotNull(repository.update(update));
        System.out.println("Updated EmployeeDepartment Entity-" + repository.getAll());
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(empDept.getEmployeeId());
        assertTrue(success);
        System.out.println(repository.getAll());
    }

    @Test
    void d_getAll() {

        System.out.println("Get All Repository contents" + repository.getAll());
    }
}