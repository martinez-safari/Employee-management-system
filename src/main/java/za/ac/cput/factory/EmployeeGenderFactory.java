package za.ac.cput.factory;

import za.ac.cput.entity.EmployeeGender;
import za.ac.cput.util.Helper;


public class EmployeeGenderFactory
{


    public static EmployeeGender createEmployeeAddress( )
    {
        String employeeId= Helper.generateID();
        String genderId= Helper.generateID();
        EmployeeGender employeeGender=new EmployeeGender .Builder()
                .setEmployeeId(employeeId).setGenderId(genderId).Build();

        return employeeGender;
    }
}
