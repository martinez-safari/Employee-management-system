package za.ac.cput.factory;


import za.ac.cput.entity.EmployeeAddress;


public class EmployeeAddressFactory {

    public static EmployeeAddress createEmployeeAddress(String employeeId, String addressTypeId)
    {

        EmployeeAddress employeeAddress =new EmployeeAddress .Builder()
        .setEmployeeId(employeeId).setAddressTypeId(addressTypeId).Build();

        return employeeAddress;
    }
}
