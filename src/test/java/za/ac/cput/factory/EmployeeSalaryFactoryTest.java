package za.ac.cput.factory;
/* EmployeeSalaryFactoryTest.java
 Test for the EmployeeSalaryFactoryTest
 Author: Taariq Khan (219231141)
 Date: 2 April 2022
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.EmployeeSalary;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeSalaryFactoryTest
{
    @Test
    public void test()
    {
        EmployeeSalary employeeSalary = EmployeeSalaryFactory.createEmployeeSalary();
        System.out.println(employeeSalary.toString());
        assertNotNull(employeeSalary);
    }
}