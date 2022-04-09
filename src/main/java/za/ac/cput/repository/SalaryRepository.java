package za.ac.cput.repository;
/* SalaryRepository.java
 repository for the SalaryRepository
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
import za.ac.cput.entity.Salary;
import java.util.HashSet;
import java.util.Set;

public class SalaryRepository implements ISalaryRepository
{
    private static SalaryRepository repository = null;
    private Set<Salary> salaryDB = null;

    private SalaryRepository()//constructor
    {
        salaryDB = new HashSet<Salary>();
    }

    public static SalaryRepository getRepository()//private static SalaryRepository repository = SalaryRepository.getRepository(); Test
    {
        if(repository == null)
        {
            repository = new SalaryRepository();
        }
        return repository;
    }

    @Override
    public Salary create(Salary salary)
    {
        boolean success = salaryDB.add(salary);
        if(!success)
            return null;
        return salary;
    }

    @Override
    public Salary read(String salaryId)
    {
        /*
        for (Salary s : salaryDB) //for every salary object in db // linear search or sequential search
        {
            if (s.getSalaryId().equals(salaryId))
                return s;
        }
        return null; */

        //lambda expressions java 8
        Salary salary = salaryDB.stream()
                .filter(s -> s.getSalaryId().equals(salaryId))
                .findAny()
                .orElse(null);
        return salary;
    }

    @Override
    public Salary update(Salary salary)
    {
        Salary oldSalary = read(salary.getSalaryId()); //pass id to find salary object
        if(oldSalary != null)
        {
            salaryDB.remove(oldSalary);//remove old information
            salaryDB.add(salary);//adding updated value(information)
            return salary;//returning new vale(parameter that was passed)
        }
        return null;
    }

    @Override
    public boolean delete(String salaryId)
    {
        Salary salaryToDelete = read(salaryId);
        if(salaryToDelete == null )
        {
            return false;
        }
        salaryDB.remove(salaryToDelete);
        return true;
    }

    @Override
    public Set<Salary> getAll()
    {
        return salaryDB;
    }
}

