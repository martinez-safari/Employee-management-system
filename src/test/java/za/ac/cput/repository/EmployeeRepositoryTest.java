package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Employee;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeRepositoryTest {
    private static EmployeeRepository repository= EmployeeRepository.getRepository();
    private static Employee emp1 = EmployeeFactory.createEmployee("Farai","Chawora");
    //Employee created= repository.create(emp1);
    @Test
   public void a_create() {
        Employee created= repository.create(emp1);
        assertEquals(emp1.getEmployeeId(),created.getEmployeeId());
        System.out.println("Created Entity "+ created.toString());
    }

    @Test
    void b_read() {
        Employee read = repository.read(emp1.getEmployeeId());
        assertNotNull(read);
        System.out.println("Entity Read-"+read);
    }

    @Test
    void c_update() {
        Employee update= new Employee.Builder().copy(emp1).setFirstName("Emmanuel").setLastName("Chawora").build();
        // Employee created= repository.create(emp1);
        assertNotNull(repository.update(update));
        System.out.println("Updated Entity-"+ repository.read(update.getEmployeeId()));
    }


    @Test
    void e_delete() {
        boolean success= repository.delete(emp1.getEmployeeId());
        assertTrue(success);
        System.out.println(repository.getAll());
    }

    @Test
    void d_getAll() {
        System.out.println("Repository Contents-"+repository.getAll());
    }
}