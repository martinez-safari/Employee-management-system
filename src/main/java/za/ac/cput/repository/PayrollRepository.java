package za.ac.cput.repository;
/* PayrollRepository.java
 repository for the PayrollRepository
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
import za.ac.cput.entity.Payroll;
import java.util.HashSet;
import java.util.Set;

public class PayrollRepository implements IPayrollRepository
{
    private static PayrollRepository repository = null;
    private Set<Payroll> payrollDB = null;

    private PayrollRepository()//constructor
    {
        payrollDB = new HashSet<Payroll>();
    }

    public static PayrollRepository getRepository()//private static SalaryRepository repository = SalaryRepository.getRepository(); Test
    {
        if(repository == null)
        {
            repository = new PayrollRepository();
        }
        return repository;
    }

    @Override
    public Payroll create(Payroll payroll)
    {
        boolean success = payrollDB.add(payroll);
        if(!success)
            return null;
        return payroll;
    }

    @Override
    public Payroll read(String payrollId)
    {
        /*
        for (Salary s : salaryDB) //for every salary object in db // linear search or sequential search
        {
            if (s.getSalaryId().equals(salaryId))
                return s;
        }
        return null; */
        Payroll payroll = payrollDB.stream()
                .filter(p -> p.getPayrollId().equals(payrollId))
                .findAny()
                .orElse(null);
        return payroll;
    }

    @Override
    public Payroll update(Payroll payroll)
    {
        Payroll oldPayroll = read(payroll.getPayrollId()); //pass id to find salary object
        if(oldPayroll != null)
        {
            payrollDB.remove(oldPayroll);//remove old information
            payrollDB.add(payroll);//adding updated value(information)
            return payroll;//returning new vale(parameter that was passed)
        }
        return null;
    }

    @Override
    public boolean delete(String payrollId)
    {
        Payroll payrollToDelete = read(payrollId);
        if(payrollToDelete == null )
        {
            return false;
        }
        payrollDB.remove(payrollToDelete);
        return true;
    }

    @Override
    public Set<Payroll> getAll()
    {
        return payrollDB;
    }
}


