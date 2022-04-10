package za.ac.cput.factory;

import za.ac.cput.entity.ContactType;
import za.ac.cput.util.Helper;
/*
ContactTypeFactory.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date April 9 2022
 */

public class ContactTypeFactory {
    public static ContactType createContactType(String email, String phoneNumber){
        String id= Helper.generateID();
        //String validEmail= String.valueOf(Helper.IsValidEmail(email));

        ContactType cntTyp= new ContactType.Builder().setContactId(id).setEmail(email)
                .setPhoneNumber(phoneNumber).build();
        return cntTyp;
}
}
