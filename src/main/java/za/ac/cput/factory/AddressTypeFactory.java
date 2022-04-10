package za.ac.cput.factory;

import za.ac.cput.entity.AddressType;
import za.ac.cput.util.Helper;

public class AddressTypeFactory {

    public  static AddressType createAddressType(String streetName, String postalCode,String areaName,String city  ){

        String id = Helper.generateID();
        AddressType emp=new AddressType.Builder().setAddressTypeId(id).setStreetName(streetName)
                .setPostalCode(postalCode).setAreaName(areaName).setCity(city ).build();
        return emp;

    }


}
