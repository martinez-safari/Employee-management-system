package za.ac.cput.repository;

import za.ac.cput.entity.ContactType;

import java.util.Set;

public interface IContactType extends Irepository <ContactType,String>{
    public Set<ContactType> getAll();
}
