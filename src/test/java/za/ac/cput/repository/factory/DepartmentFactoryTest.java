package za.ac.cput.repository.factory;

/*
Employee-management-system.java
DepartmentFactoryTest.java
Author: Martinez Safari   219325332
Date: 09/04/2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.factory.DepartmentFactory;

public class DepartmentFactoryTest {

    @Test
    void createDepartment() {
        System.out.println(DepartmentFactory.createDepartment("c234","CoolDep","Cold Room"));
    }
}
