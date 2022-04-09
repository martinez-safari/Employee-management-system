package za.ac.cput.factory;
/*
EmployeeContactFactory.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date April 9 2022
 */

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
