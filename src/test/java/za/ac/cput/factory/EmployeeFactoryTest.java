package za.ac.cput.factory;
/*
EmployeeFactoryTest.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date April 9 2022
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Employe;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {
    public static Employe emp = EmployeFactory.createEmployee("Farai","malone");
    @Test
    void createEmployee() {
        assertNotNull(emp);
        System.out.println(emp.toString());
    }
}