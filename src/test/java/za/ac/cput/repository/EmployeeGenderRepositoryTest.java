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
import za.ac.cput.entity.EmployeeGender;
import za.ac.cput.entity.Gender;
import za.ac.cput.factory.EmployeeGenderFactory;
import za.ac.cput.factory.GenderFactory;
import za.ac.cput.util.Helper;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeGenderRepositoryTest {
    private static EmployeeGenderRepository repository= EmployeeGenderRepository.getRepository();
    private static EmployeeGender employeeGender= EmployeeGenderFactory.createEmployeeAddress();


    @Test
    void a_create()
    {
        EmployeeGender created =repository.create(employeeGender);
        assertEquals(employeeGender.getEmployeeId(),created.getEmployeeId());
        System.out.println("creating EmployeeGender "+created);
    }

    @Test
    void b_read() {

        EmployeeGender read= repository.read(employeeGender.getEmployeeId());
        assertNotNull(read);
        System.out.println("Reading EmployeeGender "+read);
    }

    @Test
    void c_update() {

        EmployeeGender update =new EmployeeGender.Builder().cody(employeeGender).setGenderId(Helper.generateID()).Build();
        assertNotNull(repository.update(update));
        System.out.println("Updated EmployeeAddress "+update);

    }

    @Test
    void d_getAll() {
        System.out.println("List EmployeeGender "+repository.getAll());
    }

    @Test
    void e_delete() {
        boolean success=repository.delete(employeeGender.getEmployeeId());
        assertTrue(success);
        System.out.println("delete EmployeeGender "+ true);
    }
}