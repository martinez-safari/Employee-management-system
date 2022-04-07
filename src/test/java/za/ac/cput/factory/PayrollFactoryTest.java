package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Payroll;

import static org.junit.jupiter.api.Assertions.*;

class PayrollFactoryTest
{
    @Test
    public void test()
    {
        Payroll payroll = PayrollFactory.createPayroll("003", 30000);
        System.out.println(payroll.toString());
        assertNotNull(payroll);
    }
}
