package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper {
    public static String generateID()
    {
        return UUID.randomUUID().toString();
    }
    public static String IsValidEmail(String str) {
        if( EmailValidator.getInstance().isValid(str)){
            return str;
        }
        System.out.println("Please enter correct email");
        String str2=" Please enter correct email";
        return str2;
    }
}
