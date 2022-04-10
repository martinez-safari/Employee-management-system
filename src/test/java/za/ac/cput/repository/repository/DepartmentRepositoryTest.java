package za.ac.cput.repository.repository;

/*
Employee-management-system.java
DepartmentRepositoryTest.java
Author: Martinez Safari  219325332
Date: 09/04/2022
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Department;
import za.ac.cput.factory.DepartmentFactory;
import za.ac.cput.repository.DepartmentRepository;
import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
public class DepartmentRepositoryTest  {
    private static DepartmentRepository repository=DepartmentRepository.getRepository();
    private static Department department= DepartmentFactory
            .createDepartment("c123","cool", "cool Room");


    @Test
    void a_create() {
        Department dept=repository.create(department);
        assertSame(department.getDeptId(),dept.getDeptId());
        System.out.println("Create Department entity "+ department.toString());
    }

    @Test
    void b_read() {
        Department read= repository.read(department.getDeptId());
        assertNotNull(read);
        System.out.println("Read Department Entity "+read);
    }

    @Test
    void c_update() {
        Department update=new Department.Builder().copy(department).setDeptId("b286").build();

        assertNotNull(repository.update(update));
        System.out.println("Updated Department Entity-"+ repository.read(update.getDeptId()));
    }

    @Test
    void e_delete() {
        boolean success= repository.delete(department.getDeptId());
        assertTrue(success);
        System.out.println(repository.getAll());
    }

    @Test
    void d_getAll() {
        System.out.println("Get All the Repository Contents-"+repository.getAll());
    }
}