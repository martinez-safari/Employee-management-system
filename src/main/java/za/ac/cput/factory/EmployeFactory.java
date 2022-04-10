package za.ac.cput.factory;
/*
EmployeeFactory.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date April 9 2022
 */

import za.ac.cput.entity.Employe;
import za.ac.cput.util.Helper;

public class EmployeFactory {
    public  static Employe createEmployee(String firstName, String lastName  ){
        String id = Helper.generateID();
        Employe emp=new Employe.Builder().setEmployeeId(id).setFirstName(firstName)
                .setLastName(lastName).build();
        return emp;

    }


}
