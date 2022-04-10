package za.ac.cput.repository;
/* Irepository.java
 Interface for the Irepository
 Author: Taariq Khan (219231141)
 Date: 2 April 2022
*/
public interface Irepository <Object,ID>
{
    Object create(Object object);
    Object read(ID id);
    Object update(Object object);
    boolean delete(ID id);
}


