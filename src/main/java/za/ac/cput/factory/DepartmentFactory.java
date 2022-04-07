package za.ac.cput.factory;

import za.ac.cput.entity.Department;
import za.ac.cput.util.Helper;

public class DepartmentFactory {

    // creating department objects
    public static Department createDepartment(String deptId, String deptName, String deptDesc){
        if(!Helper.isNullorEmpty(deptId) || Helper.isNullorEmpty(deptName) || Helper.isNullorEmpty(deptDesc) )
            return null;

        return new Department.Builder().setDeptId(deptId)
                .setDeptName(deptName)
                .setDeptDesc(deptDesc)
                .build();

    }

}
