package za.ac.cput.repository;

import za.ac.cput.entity.EmployeeDepartment;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDepartmentRepository implements IEmployeeDepartment {

    private Set<EmployeeDepartment> EmployeeDepartmentDB;
    private static EmployeeDepartmentRepository EmpDep_repository = null;


    private EmployeeDepartmentRepository() {
        EmployeeDepartmentDB = new HashSet<EmployeeDepartment>();

    }

    public static EmployeeDepartmentRepository getInstance() {
        if (EmpDep_repository == null) {
            EmpDep_repository = new EmployeeDepartmentRepository();
        }
        return EmpDep_repository;
    }
    @Override
    public EmployeeDepartment create(EmployeeDepartment empDept) {
        boolean success= EmployeeDepartmentDB.add(empDept);
        if(!success)
            return null;
        return empDept;

    }

    @Override
    public EmployeeDepartment read(String ID) {
        EmployeeDepartment empDept= EmployeeDepartmentDB.stream().
                filter(e ->e.getEmployeeId().equals(ID))
               // filter(e ->e.getDeptId().equals(ID))

                .findAny().orElse(null);
        return empDept;

    }

    @Override
    public EmployeeDepartment update(EmployeeDepartment empDept) {
        EmployeeDepartment oldDept=read(empDept.getEmployeeId());
        if(oldDept!=null){
            EmployeeDepartmentDB.remove(oldDept);
            EmployeeDepartmentDB.add(empDept);

        }
        return empDept;
    }

    @Override
    public boolean delete(String ID) {
        EmployeeDepartment deleteEmpDept=read(ID);
        if(deleteEmpDept==null){
            return false;
        }
        EmployeeDepartmentDB.remove(deleteEmpDept);
        return true;
    }
    @Override
    public Set<EmployeeDepartment> getAll() {
        return EmployeeDepartmentDB;
    }

}