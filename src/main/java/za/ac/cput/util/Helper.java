package za.ac.cput.util;
/* Helper.java
 group uses one helper class in util package
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
import java.util.UUID;

public class Helper
{
    public static boolean isNullorEmpty(String s)
    {
        return(s == null || s.isEmpty() || s.equalsIgnoreCase("null"));
    }

    public static String generateID()
    {

        return UUID.randomUUID().toString();
    }

}

