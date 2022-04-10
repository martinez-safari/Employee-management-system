package za.ac.cput.repository;
/*
Full Name Mutmaba Prince Bulambo
Student Number 220177767
Date April 8 2022
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.AddressType;
import za.ac.cput.factory.AddressTypeFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class AddressTypeRepositoryTest {
    private static AddressTypeRepository repository= AddressTypeRepository .getRepository();
    private static AddressType address = AddressTypeFactory.createAddressType("Rose Road",
            "7460","GoodWood","CapeTown");



    @Test
    void a_create() {
        AddressType created= repository.create(address);
        assertEquals(address.getAddressTypeId(),created.getAddressTypeId());
        System.out.println("Created AddressType "+ created.toString());
    }

    @Test
    void b_read() {

        AddressType read = repository.read(address.getAddressTypeId());
        assertNotNull(read);
        System.out.println(" Read AddressType"+read);
    }

    @Test
    void c_update() {

        AddressType update= new AddressType.Builder().copy(address).setStreetName("champ de elysee").setAreaName("Nice")
                .setPostalCode("9023").setCity("Paris").build();
        assertNotNull(repository.update(update));
        System.out.println("Updated AddressType"+ repository.read(update.getAddressTypeId()));

    }
    @Test
    void d_getAll() {

        System.out.println("Repository AddressType"+repository.getAll());
    }

    @Test
    void e_delete() {

        boolean success= repository.delete(address.getAddressTypeId());
        assertTrue(success);

    }
}