package za.ac.cput.factory;
/* EmployeeSalaryFactory.java
 Factory for the EmployeeSalaryFactory
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
import za.ac.cput.entity.EmployeeSalary;
import za.ac.cput.util.Helper;

public class EmployeeSalaryFactory
{//creating EmployeeSalary objects
    public static EmployeeSalary createEmployeeSalary()
    {
        String employeeSalaryId = Helper.generateID();
        String employeeId = Helper.generateID();
        String salaryId = Helper.generateID();
        if (Helper.isNullorEmpty(employeeId) | Helper.isNullorEmpty(salaryId) | Helper.isNullorEmpty(employeeSalaryId)) //short circuit evaluation
            return null;

        return new EmployeeSalary.Builder()
                .setEmployeeSalaryId(employeeSalaryId)
                .setEmployeeId(employeeId)
                .setSalaryId(salaryId)
                .build();
    }
}
