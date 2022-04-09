package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.ContactType;
import za.ac.cput.factory.ContactTypeFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class ContactTypeRepositoryTest {
    private static ContactTypeRepository repository=ContactTypeRepository.getRepository();
    private static ContactType contact= ContactTypeFactory.createContactType("farai@gmail.com","0916675543");
    //ContactType con=repository.create(contact);

    @Test
    void a_create() {
        ContactType con=repository.create(contact);
        assertSame(contact.getContactId(),con.getContactId());
        System.out.println("Created Entity "+ contact.toString());
    }

    @Test
    void b_read() {
        ContactType read= repository.read(contact.getContactId());
        assertNotNull(read);
        System.out.println("Entity Read-"+read);
    }

    @Test
    void c_update() {
        ContactType update=new ContactType.Builder().copy(contact).setPhoneNumber("0986543218").build();

        assertNotNull(repository.update(update));
        System.out.println("Updated Entity-"+ repository.read(update.getContactId()));
    }

    @Test
    void e_delete() {
        boolean success= repository.delete(contact.getContactId());
        assertTrue(success);
        System.out.println(repository.getAll());
    }

    @Test
    void d_getAll() {
        System.out.println("Repository Contents-"+repository.getAll());
    }
}