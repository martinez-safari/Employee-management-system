package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.EmployeeContact;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeContactFactoryTest {
    private static EmployeeContact EmpContact = EmployeeContactFactory.createEmployeeContact();
    @Test
    void createEmployeeContact() {
        assertNotNull(EmpContact);
        System.out.println(EmpContact.toString());
    }
}