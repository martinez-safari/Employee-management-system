package za.ac.cput.factory;

import za.ac.cput.entity.EmployeeSalary;
import za.ac.cput.util.Helper;

public class EmployeeSalaryFactory
{//creating EmployeeSalary objects
    public static EmployeeSalary createEmployeeSalary(String employeeId, String salaryId)
    {
        if (Helper.isNullorEmpty(employeeId) | Helper.isNullorEmpty(salaryId)) //short circuit evaluation
            return null;


        return new EmployeeSalary.Builder()
                .setEmployeeId(employeeId)
                .setSalaryId(salaryId)
                .build();
    }
}
