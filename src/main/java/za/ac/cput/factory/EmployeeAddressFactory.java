package za.ac.cput.factory;


import za.ac.cput.entity.EmployeeAddress;
import za.ac.cput.util.Helper;


public class EmployeeAddressFactory {

    public static EmployeeAddress createEmployeeAddress()
    {
        String employeeId= Helper.generateID();
        String addressTypeId=Helper.generateID();

        EmployeeAddress employeeAddress =new EmployeeAddress .Builder()
        .setEmployeeId(employeeId).setAddressTypeId(addressTypeId).Build();

        return employeeAddress;
    }
}
