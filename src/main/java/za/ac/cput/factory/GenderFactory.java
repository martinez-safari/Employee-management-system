package za.ac.cput.factory;


import za.ac.cput.entity.Gender;
import za.ac.cput.util.Helper;

public class GenderFactory
{

    public static Gender createEmployeeAddress(String genderType, String description)
    {
        String genderId= Helper.generateID();
        Gender gender =new Gender .Builder()
         .setGenderId(genderId).setGenderType(genderType).setDescription(description).Build();

        return gender;
    }
}
