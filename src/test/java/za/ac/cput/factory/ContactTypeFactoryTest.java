package za.ac.cput.factory;
/*
ContactTypeFactoryTest.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date April 9 2022
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.ContactType;

import static org.junit.jupiter.api.Assertions.*;

class ContactTypeFactoryTest {
    public static ContactType con=ContactTypeFactory.createContactType("f@gmail.com","0114244");
    @Test
    void createContactType() {
        assertNotNull(con);
        System.out.println(con.toString());
    }
}