package za.ac.cput.repository;
/*
Full Name Mutmaba Prince Bulambo
Student Number 220177767
Date April 8 2022
 */
import za.ac.cput.entity.AddressType;
import java.util.*;


public class AddressTypeRepository implements IAddressType{
    private static AddressTypeRepository repository =null;
    private Set<AddressType> DB;
    private AddressTypeRepository(){
        DB= new HashSet<AddressType>();

    }

    public static AddressTypeRepository getRepository(){
        if (repository==null) {
            repository = new AddressTypeRepository();
        }
        return repository;

    }



    @Override
    public AddressType create(AddressType object) {
        boolean success=DB.add(object);
        if(!success)
            return null;
        return object;
    }

    @Override
    public AddressType read(String ID) {
        AddressType employee=DB.stream().
                filter(e ->e.getAddressTypeId().equals(ID))

                .findAny().orElse(null);
        return employee;
    }

    @Override
    public AddressType update(AddressType addressTypeObject) {
        AddressType currentAddressType=read(addressTypeObject.getAddressTypeId());
        if (currentAddressType !=null)
        {


            DB.remove(currentAddressType);

            DB.add(addressTypeObject);
            return addressTypeObject;
        }
        return null;
    }

    @Override
    public boolean delete(String ID) {
        AddressType deleteEmployeeGender= read(ID);
        if (deleteEmployeeGender ==null)
        {
            return false;
        }
        DB.remove(deleteEmployeeGender);
        System.out.println("deleted successfully");

        return true;
    }

    @Override
    public Set<AddressType> getAll()
    {
        System.out.println("getAll successfully");
        return DB;
    }
}
