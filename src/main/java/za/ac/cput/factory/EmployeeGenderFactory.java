package za.ac.cput.factory;

import za.ac.cput.entity.EmployeeGender;


public class EmployeeGenderFactory
{


    public static EmployeeGender createEmployeeAddress(String employeeId,String genderId )
    {

        EmployeeGender employeeGender=new EmployeeGender .Builder()
                .setEmployeeId(employeeId).setGenderId(genderId).Build();

        return employeeGender;
    }
}
