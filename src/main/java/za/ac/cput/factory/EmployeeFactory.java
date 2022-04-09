package za.ac.cput.factory;
/*
EmployeeFactory.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date April 9 2022
 */

import za.ac.cput.entity.Employee;
import za.ac.cput.util.Helper;

public class EmployeeFactory {
    public  static Employee createEmployee(String firstName, String lastName  ){
        String id = Helper.generateID();
        Employee emp=new Employee.Builder().setEmployeeId(id).setFirstName(firstName)
                .setLastName(lastName).build();
        return emp;

    }

    public static void main(String[] args) {
        Employee emp=EmployeeFactory.createEmployee("Nolu","Malone");

    }
}
