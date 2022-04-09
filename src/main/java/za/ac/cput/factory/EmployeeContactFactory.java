package za.ac.cput.factory;

import za.ac.cput.entity.EmployeeContact;
import za.ac.cput.util.Helper;

public class EmployeeContactFactory {
    public static EmployeeContact createEmployeeContact(){
        String empId= Helper.generateID();
        String cotactId=Helper.generateID();
        EmployeeContact empConatct=new EmployeeContact.Builder().setEmployeeId(empId)
                .setContactId(cotactId).build();
        return empConatct;
    }

}
