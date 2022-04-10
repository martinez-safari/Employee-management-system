package za.ac.cput.repository;
/* PayrollRepositoryTest.java
 repository for the PayrollRepositoryTest
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Payroll;
import za.ac.cput.factory.PayrollFactory;


import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class) //alphabetical order naming convention
class PayrollRepositoryTest
{
    private static PayrollRepository repository = PayrollRepository.getRepository();
    private static Payroll payroll = PayrollFactory.createPayroll(30000);

    @Test
    void a_create()
    {
        Payroll created = repository.create(payroll);//return salary obj else return null
        assertEquals(payroll.getPayrollId(),created.getPayrollId());
        System.out.println("Create : "+created );
    }

    @Test
    void b_read()
    {
        Payroll read = repository.read(payroll.getPayrollId());
        assertNotNull(read);
        System.out.println("Read : " + read);
    }

    @Test
    void c_update()
    {
        Payroll updated = new Payroll.Builder().copy(payroll).setTotalPayroll(2000)
                .build();
        assertNotNull(repository.update(updated)); //enter into set( & calling update on the repository)
        System.out.println("Updated : " +updated);
    }

    @Test
    void e_delete()
    {
        boolean success = repository.delete(payroll.getPayrollId());
        assertTrue(success);
        System.out.println("Deleted : " + success);
    }

    @Test
    void d_getAll()
    {
        System.out.println("Show all : ");
        System.out.println(repository.getAll());
    }
}
