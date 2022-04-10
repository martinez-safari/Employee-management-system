package za.ac.cput.repository;
/* EmployeeSalaryRepository.java
 repository for the EmployeeSalaryRepository
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
import za.ac.cput.entity.EmployeeSalary;
import java.util.HashSet;
import java.util.Set;

public class EmployeeSalaryRepository implements IEmployeeSalaryRepository
{
    private static EmployeeSalaryRepository repository = null;
    private Set<EmployeeSalary> employeeSalaryDB = null;

    private EmployeeSalaryRepository()//constructor
    {
        employeeSalaryDB = new HashSet<EmployeeSalary>();
    }

    public static EmployeeSalaryRepository getRepository()//private static EmployeeSalaryRepository repository = EmployeeSalaryRepository.getRepository(); Test
    {
        if(repository == null)
        {
            repository = new EmployeeSalaryRepository();
        }
        return repository;
    }

    @Override
    public EmployeeSalary create(EmployeeSalary employeeSalary)
    {
        boolean success = employeeSalaryDB.add(employeeSalary);
        if(!success)
            return null;
        return employeeSalary;
    }

    @Override
    public EmployeeSalary read(String employeeSalaryId)
    {
        EmployeeSalary employeeSalary = employeeSalaryDB.stream()
                .filter(es -> es.getEmployeeSalaryId().equals(employeeSalaryId))
                .findAny()
                .orElse(null);
        return employeeSalary;
        /*
        for (Salary s : salaryDB) //for every salary object in db // linear search or sequential search
        {
            if (s.getSalaryId().equals(salaryId))
                return s;
        }
        return null;
        lambda expressions java 8 same function as linear
         */
    }

    @Override
    public EmployeeSalary update(EmployeeSalary employeeSalary)
    {
        EmployeeSalary oldEmployeeSalary = read(employeeSalary.getEmployeeSalaryId()); //pass id to find employeeSalary object
        if(oldEmployeeSalary != null)
        {
            employeeSalaryDB.remove(oldEmployeeSalary);//remove old information
            employeeSalaryDB.add(employeeSalary);//adding updated value(information)
            return employeeSalary;//returning new vale(parameter that was passed)
        }
        return null;
    }

    @Override
    public boolean delete(String employeeSalaryId)
    {
        EmployeeSalary employeeSalaryToDelete = read(employeeSalaryId);
        if(employeeSalaryToDelete == null )
        {
            return false;
        }
        employeeSalaryDB.remove(employeeSalaryToDelete);
        return true;
    }

    @Override
    public Set<EmployeeSalary> getAll()
    {
        return employeeSalaryDB;
    }
}
