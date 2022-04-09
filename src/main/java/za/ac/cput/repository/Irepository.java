package za.ac.cput.repository;

public interface Irepository <Object,ID>

{
    Object create(Object object);
    Object read(ID id);
    Object update(Object object);
    boolean delete(ID id);
}


