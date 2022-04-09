package za.ac.cput.factory;
/* SalaryFactory.java
 Factory for the SalaryFactory
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
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
