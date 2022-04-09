package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.EmployeeContact;
import za.ac.cput.factory.EmployeeContactFactory;
import za.ac.cput.util.Helper;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeContactRepositoryTest {
    private static EmployeeContactRepository repository=EmployeeContactRepository.getInstance();
    private static EmployeeContact empContact= EmployeeContactFactory.createEmployeeContact();
   // EmployeeContact empConct1=repository.create(empContact);

    @Test
    void a_create() {
        EmployeeContact empConct1=repository.create(empContact);
        assertSame(empContact.getEmployeeId(),empConct1.getEmployeeId());
        System.out.println("Created Entity "+ empConct1.toString());
    }

    @Test
    void b_read() {
        EmployeeContact read= repository.read(empContact.getEmployeeId());
        assertNotNull(read);
        System.out.println("Entity Read-"+read);
    }

    @Test
    void c_update() {
        EmployeeContact update =new EmployeeContact.Builder().copy(empContact).setContactId(Helper.generateID()).build();
        assertNotNull(repository.update(update));
        System.out.println("Updated Entity-"+repository.getAll());
    }

    @Test
    void e_delete() {
        boolean success= repository.delete(empContact.getEmployeeId());
        assertTrue(success);
        System.out.println(repository.getAll());
    }

    @Test
    void d_getAll() {
        System.out.println("Repository Contents"+repository.getAll());
    }
}