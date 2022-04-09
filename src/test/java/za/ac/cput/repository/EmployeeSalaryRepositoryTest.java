package za.ac.cput.repository;
/* EmployeeSalaryRepositoryTest.java
 repository for the EmployeeSalaryRepositoryTest
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.EmployeeSalary;
import za.ac.cput.factory.EmployeeSalaryFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class) //alphabetical order naming convention
class EmployeeSalaryRepositoryTest
{
    private static EmployeeSalaryRepository repository = EmployeeSalaryRepository.getRepository();
    private static EmployeeSalary employeeSalary = EmployeeSalaryFactory.createEmployeeSalary();

    @Test
    void a_create()
    {
        EmployeeSalary created = repository.create(employeeSalary);//return employeeSalary obj else return null
        assertEquals(employeeSalary.getEmployeeId(),created.getEmployeeId());
        System.out.println("Create : "+created );
    }

    @Test
    void b_read()
    {
        EmployeeSalary read = repository.read(employeeSalary.getEmployeeSalaryId());
        assertNotNull(read);
        System.out.println("Read : " + read);
    }

    @Test
    void c_update()
    {
        EmployeeSalary updated = new EmployeeSalary.Builder().copy(employeeSalary)
                .build();
        assertNotNull(repository.update(updated)); //enter into set( & calling update on the repository)
        System.out.println("Updated : " +updated);
    }

    @Test
    void e_delete()
    {
        boolean success = repository.delete(employeeSalary.getEmployeeSalaryId());
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