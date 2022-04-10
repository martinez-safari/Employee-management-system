package za.ac.cput.repository;
/*
EmployeeRepository.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date April 9 2022
 */

import za.ac.cput.entity.Employe;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepository implements IEmployee{
    private static EmployeeRepository repository =null;
    private Set<Employe> EmployeeDB;
    private EmployeeRepository(){
        EmployeeDB= new HashSet<Employe>();

    }

    public static EmployeeRepository getRepository(){
        if (repository==null) {
            repository = new EmployeeRepository();
        }
        return repository;

    }

    @Override
    public Employe create(Employe employee) {
        boolean success=EmployeeDB.add(employee);
        if(!success)
            return null;
        return employee;

    }

    @Override
    public Employe read(String employeeId) {
        Employe employee=EmployeeDB.stream().
                filter(e ->e.getEmployeeId().equals(employeeId))

                .findAny().orElse(null);
        return employee;
    }

    @Override
    public Employe update(Employe employee) {

        Employe oldEmployee=read(employee.getEmployeeId());
        if (oldEmployee !=null)
        {


            EmployeeDB.remove(oldEmployee);

            EmployeeDB.add(employee);
            return  employee;
        }
        return null;
    }

    @Override
    public boolean delete(String employeeId) {
        Employe deleteEmployee= read(employeeId);
        if (deleteEmployee ==null)
        {
            return false;
        }
        EmployeeDB.remove(deleteEmployee);
        System.out.println("Delete Sucessfull");
        return true;
    }

    @Override
    public Set<Employe> getAll() {
        return EmployeeDB;
    }

}
