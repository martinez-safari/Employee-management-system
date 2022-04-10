package za.ac.cput.repository;
/*
Full Name Mutmaba Prince Bulambo
Student Number 220177767
Date April 8 2022
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Gender;
import za.ac.cput.factory.GenderFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class GenderRepositoryTest {
    private static GenderRepository repository= GenderRepository.getRepository();
    private static Gender gender= GenderFactory.createGender("Male","Gender is used to describe the characteristics of women and men");


    @Test
    void a_create()
    {
        Gender created =repository.create(gender);
        assertEquals(gender.getGenderId(),created.getGenderId());
        System.out.println("creating Gender"+created);
    }

    @Test
    void b_read() {
        Gender created =repository.create(gender);
        Gender GenderObject =repository.read(gender.getGenderId());
        assertNotNull(GenderObject);
        System.out.println("reading Gender :"+GenderObject);
    }

    @Test
    void c_update() {
        Gender created =repository.create(gender);
        Gender updated= new Gender.Builder().cody(gender).setGenderType("Female").setDescription("ender refers to the characteristics of women, men, girls and boys that are socially constructed.").Build();
        assertNotNull(repository.update(updated));
        System.out.println("update Gender "+updated);
    }

    @Test
    void d_getAll() {


        System.out.println("List Gender  "+repository.getAll());
    }

    @Test
    void e_delete() {
        Gender created =repository.create(gender);
        boolean success=repository.delete(gender.getGenderId());
        assertTrue(success);
        System.out.println("delete Gender  :"+ true);
    }
}