package za.ac.cput.repository;
/*
Full Name Mutmaba Prince Bulambo
Student Number 220177767
Date April 8 2022
 */

import za.ac.cput.entity.EmployeeGender;
import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepository implements  IEmployeeGender{
    private  static EmployeeGenderRepository repository=null;
    private Set<EmployeeGender> employeeGenderDB= null;

    private  EmployeeGenderRepository()
    {
        employeeGenderDB= new HashSet<EmployeeGender>();
    }
    public static EmployeeGenderRepository getRepository()
    {
        if(repository==null)
        {
            repository= new EmployeeGenderRepository();
        }
        return repository;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {

        boolean success=employeeGenderDB.add(employeeGender);
        if(!success)
            return null;
        return employeeGender;

    }



    @Override
    public EmployeeGender read(String employeeid) {
        EmployeeGender employeeGender=employeeGenderDB.stream().
                filter(e ->e.getEmployeeId().equals(employeeid))

                .findAny().orElse(null);
        return  employeeGender;

    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {

        EmployeeGender CurrentEmployeeAddress=read(employeeGender.getEmployeeId());
        if(CurrentEmployeeAddress!=null){
            employeeGenderDB.remove(CurrentEmployeeAddress);
            employeeGenderDB.add(employeeGender);}

        return employeeGender;
    }
    @Override
    public Set<EmployeeGender> getAll() {

        return employeeGenderDB;
    }
    @Override
    public boolean delete(String genderId) {
        EmployeeGender deleteEmployeeGender= read(genderId);
        if (deleteEmployeeGender ==null)
        {
            return false;
        }
        employeeGenderDB.remove(deleteEmployeeGender);

        return true;
    }

}
