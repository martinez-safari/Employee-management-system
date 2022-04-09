package za.ac.cput.factory;

import za.ac.cput.entity.AddressType;
import za.ac.cput.util.Helper;

public class AddressTypeFactory {

    public static AddressType createAddressType( String streetName, String postalCode, String areaName)
    {
        String addressTypeId= Helper.generateID();
        AddressType addressType =new AddressType .Builder().setAddressTypeId(addressTypeId).setStreetName(streetName)
                .setPostalCode(postalCode).setAreaName(areaName).Build();

        return  addressType;
    }
}
