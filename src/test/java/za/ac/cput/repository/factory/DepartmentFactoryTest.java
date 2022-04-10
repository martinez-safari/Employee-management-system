package za.ac.cput.repository.factory;

/*
Employee-management-system.java
DepartmentFactoryTest.java
Author: Martinez Safari 219325332
Date: 09/04/2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Department;
import za.ac.cput.factory.DepartmentFactory;
import static org.junit.jupiter.api.Assertions.*;

public class DepartmentFactoryTest {

    public static Department dept = DepartmentFactory.createDepartment("c222", "CoolDept", "Cold Room");

    @Test
    void createDepartment() {
        assertNotNull(dept);
        System.out.println(dept.toString());
    }
}
