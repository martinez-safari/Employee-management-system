package za.ac.cput.factory;
/* SalaryFactoryTest.java
 Test for the SalaryFactoryTest
 Author: Taariq Khan (219231141)
 Date: 2 April 2022
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Payroll;
import za.ac.cput.entity.Salary;

//import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SalaryFactoryTest
{
    @Test
    public void test()
    {
        Salary salary1 = SalaryFactory.createSalary(30000, "Amount Paid per monthly");
        System.out.println(salary1.toString());
        assertNotNull(salary1);
        Salary salary2 = SalaryFactory.createSalary(20000, "Amount Paid per monthly");
        System.out.println(salary2.toString());
        assertNotNull(salary2);

        Payroll payroll = PayrollFactory.createPayroll(50000);
        System.out.println(payroll.toString());
        assertNotNull(payroll);

       /* ArrayList<Salary> salary = new ArrayList<>();
        salary.add(SalaryFactory.createSalary(100, "Nick"));
        salary.add(SalaryFactory.createSalary(200, "kanon"));
        for (int i = 0; i < salary.size(); i++)
        { //size() is the length of ArrayList students
            System.out.println(salary);
            assertNotNull(salary);*/
        }
}
