package za.ac.cput.factory;
/*
EmployeeContactFactoryTest.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date April 9 2022
 */
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