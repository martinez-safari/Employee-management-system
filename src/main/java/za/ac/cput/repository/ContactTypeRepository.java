package za.ac.cput.repository;

import za.ac.cput.entity.ContactType;

import java.util.HashSet;
import java.util.Set;

public class ContactTypeRepository implements IContactType {
    private Set<ContactType> ContactDB;
    private static ContactTypeRepository repository =null;
    private ContactTypeRepository(){
        ContactDB=new HashSet<ContactType>();

    }
    public static ContactTypeRepository getRepository(){
        if(repository==null){
            repository =new ContactTypeRepository();
        }
        return repository;
    }

    @Override
    public ContactType create(ContactType contact) {

        boolean success= ContactDB.add(contact);
        if(!success)
            return null;
        return contact;
    }

    @Override
    public ContactType read(String conctID) {
        ContactType conct=ContactDB.stream().
                filter(e ->e.getContactId().equals(conctID))

                .findAny().orElse(null);
        return conct;
    }

    @Override
    public ContactType update(ContactType conct) {
        ContactType oldConct=read(conct.getContactId());
        if(oldConct!=null){
            ContactDB.remove(oldConct);
            ContactDB.add(conct);

        }
        return conct;
    }

    @Override
    public boolean delete(String ID) {
        ContactType deleteConct=read(ID);
        if(deleteConct==null){
            return false;
        }
        ContactDB.remove(deleteConct);
        return true;
    }
    @Override
    public Set<ContactType> getAll() {
        return ContactDB;
    }
}
