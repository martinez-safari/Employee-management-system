package za.ac.cput.repository.factory;

/*
Employee-management-system.java
EmployeeDepartmentFactoryTest.java
Author: Martinez Safari   219325332
Date: 09/04/2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.EmployeeDepartment;
import za.ac.cput.factory.EmployeeDepartmentFactory;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeDepartmentFactoryTest {

    private static EmployeeDepartment EmpDept = EmployeeDepartmentFactory.createEmployeeDepartment();
    @Test
    void createEmployeeDepartment() {
        assertNotNull(EmpDept);
        System.out.println(EmpDept.toString());
    }
}
