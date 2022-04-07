package za.ac.cput.factory;
/* PayrollFactoryTest.java
 Test for the PayrollFactoryTest
 Author: Taariq Khan (219231141)
 Date: 2 April 2022
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Payroll;

import static org.junit.jupiter.api.Assertions.*;

class PayrollFactoryTest
{
    @Test
    public void test()
    {
        Payroll payroll = PayrollFactory.createPayroll( 30000);
        System.out.println(payroll.toString());
        assertNotNull(payroll);
    }
}
