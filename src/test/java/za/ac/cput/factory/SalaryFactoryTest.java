package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Salary;
import static org.junit.jupiter.api.Assertions.*;

class SalaryFactoryTest
{
    @Test
    public void test()
    {
        Salary salary = SalaryFactory.createSalary( 30000, "Amount Paid per monthly");
        System.out.println(salary.toString());
        assertNotNull(salary);
    }
}