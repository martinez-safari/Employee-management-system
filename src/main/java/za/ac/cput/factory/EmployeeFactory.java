package za.ac.cput.factory;

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
