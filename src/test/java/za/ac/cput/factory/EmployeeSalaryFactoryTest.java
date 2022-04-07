package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.EmployeeSalary;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeSalaryFactoryTest
{
    @Test
    public void test()
    {
        EmployeeSalary employeeSalary = EmployeeSalaryFactory.createEmployeeSalary("001", "002");
        System.out.println(employeeSalary.toString());
        assertNotNull(employeeSalary);
    }
}