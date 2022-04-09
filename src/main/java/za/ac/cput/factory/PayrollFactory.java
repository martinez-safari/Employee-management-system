package za.ac.cput.factory;
/* PayrollFactory.java
 Factory for the PayrollFactory
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
import za.ac.cput.entity.Payroll;
import za.ac.cput.util.Helper;

public class PayrollFactory
{
    public static Payroll createPayroll(double totalPayroll)
    {
        String payrollId = Helper.generateID();
        if (Helper.isNullorEmpty(payrollId) | Helper.isNullorEmpty(String.valueOf(totalPayroll))) //short circuit evaluation
            return null;

        return new Payroll.Builder()
                .setPayrollId(payrollId)
                .setTotalPayroll(totalPayroll)
                .build();
    }


}
