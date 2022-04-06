package za.ac.cput.repository;

public interface Irepository <Object,ID>

{
    Object Create(Object object);
    Object Read(ID id);
    Object Update(Object object);
    boolean delete(ID id);
}


