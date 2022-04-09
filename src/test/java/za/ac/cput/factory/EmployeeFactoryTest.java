package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {
    public static Employee emp =EmployeeFactory.createEmployee("Farai","malone");
    @Test
    void createEmployee() {
        assertNotNull(emp);
        System.out.println(emp.toString());
    }
}