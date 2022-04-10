package za.ac.cput.factory;

/*
Employee-management-system.java
EmployeeDepartmentFactory.java
Author: Martinez Safari 219325332
Date: 07/04/2022
 */

import za.ac.cput.entity.EmployeeDepartment;
import za.ac.cput.util.Helper;


public class EmployeeDepartmentFactory {

    public static EmployeeDepartment createEmployeeDepartment(){
        String employeeId= Helper.generateID();
        String deptId=Helper.generateID();
        EmployeeDepartment empDept=new EmployeeDepartment.Builder()
                .setEmployeeId(employeeId)
                .setDeptId(deptId).build();
        return empDept;
    }

}