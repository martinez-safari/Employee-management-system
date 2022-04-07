package za.ac.cput.factory;

import za.ac.cput.entity.Payroll;
import za.ac.cput.util.Helper;

public class PayrollFactory
{
    public static Payroll createPayroll(String payrollId, double totalPayroll)
    {
        if (Helper.isNullorEmpty(payrollId) | Helper.isNullorEmpty(String.valueOf(totalPayroll))) //short circuit evaluation
            return null;


        return new Payroll.Builder()
                .setPayrollId(payrollId)
                .setTotalPayroll(totalPayroll)
                .build();
    }


}
