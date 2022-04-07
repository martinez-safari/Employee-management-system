package za.ac.cput.factory;

import za.ac.cput.entity.Salary;
import za.ac.cput.util.Helper;

public class SalaryFactory
{
    public static Salary createSalary(double salaryAmount, String salaryDescription)
    {
        String salaryId = Helper.generateID();
        if (Helper.isNullorEmpty(salaryId) | Helper.isNullorEmpty(String.valueOf(salaryAmount))| Helper.isNullorEmpty(salaryDescription)) //short circuit evaluation
            return null;

        return new Salary.Builder()
                .setSalaryId(salaryId)
                .setSalaryAmount(salaryAmount)
                .setSalaryDescription(salaryDescription)
                .build();
    }
}
