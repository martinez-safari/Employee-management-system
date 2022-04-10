package za.ac.cput.repository;
/*
Employee-management-system.java
DepartmentRepository.java
Author: Martinez Safari  219325332
Date: 09/04/2022
 */

import za.ac.cput.entity.Department;
import java.util.HashSet;
import java.util.Set;


public class DepartmentRepository implements IDepartment{

    private Set<Department> DepartmentDB;
    private static DepartmentRepository repository =null;
    private DepartmentRepository(){
        DepartmentDB=new HashSet<Department>();

    }
    public static DepartmentRepository getRepository(){
        if(repository==null){
            repository =new DepartmentRepository();
        }
        return repository;
    }

    @Override
    public Department create(Department department) {

        boolean success= DepartmentDB.add(department);
        if(!success)
            return null;
        return department;
    }

    @Override
    public Department read(String deptId) {
        Department dept=DepartmentDB.stream().
                filter(e ->e.getDeptId().equals(deptId))

                .findAny().orElse(null);
        return dept;
    }

    @Override
    public Department update(Department dept) {
        Department oldDept=read(dept.getDeptId());
        if(oldDept!=null){
            DepartmentDB.remove(oldDept);
            DepartmentDB.add(dept);

        }
        return dept;
    }

    @Override
    public boolean delete(String ID) {
        Department deleteDept=read(ID);
        if(deleteDept==null){
            return false;
        }
        DepartmentDB.remove(deleteDept);
        return true;
    }
    @Override
    public Set<Department> getAll() {
        return DepartmentDB;
    }
}
