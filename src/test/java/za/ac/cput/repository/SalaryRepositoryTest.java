package za.ac.cput.repository;
/* SalaryRepositoryTest.java
 repository for the SalaryRepositoryTest
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Salary;
import za.ac.cput.factory.SalaryFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class) //alphabetical order naming convention
class SalaryRepositoryTest
{
    private static SalaryRepository repository = SalaryRepository.getRepository();
    private static Salary salary = SalaryFactory.createSalary(30000, " perMonthly");

    @Test
    void a_create()
    {
        Salary created = repository.create(salary);//return salary obj else return null
        assertEquals(salary.getSalaryId(),created.getSalaryId());
        System.out.println("Create : "+created );
    }

    @Test
    void b_read()
    {
        Salary read = repository.read(salary.getSalaryId());
        assertNotNull(read);
        System.out.println("Read : " + read);
    }

    @Test
    void c_update()
    {
        Salary updated = new Salary.Builder().copy(salary).setSalaryAmount(2000)
                .setSalaryDescription("per week")
                .build();
        assertNotNull(repository.update(updated)); //enter into set( & calling update on the repository)
        System.out.println("Updated : " +updated);
    }

    @Test
    void e_delete()
    {
        boolean success = repository.delete(salary.getSalaryId());
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