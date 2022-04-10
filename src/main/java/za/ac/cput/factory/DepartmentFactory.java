package za.ac.cput.factory;

/*
Employee-management-system.java
DepartmentFactory.java
Author: Martinez Safari
        219325332
Date: 07/04/2022
 */

import za.ac.cput.entity.Department;
import za.ac.cput.util.Helper;

public class DepartmentFactory {

    public static Department createDepartment(String deptId, String deptName, String deptDesc){
        String id= Helper.generateID();


        Department dept= new Department.Builder()
                .setDeptId(deptId)
                .setDeptName(deptName)
                .setDeptDesc(deptDesc).build();
        return dept;

}
}
