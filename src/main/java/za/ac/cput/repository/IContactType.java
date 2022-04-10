package za.ac.cput.repository;
/*
IContactType.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date April 9 2022
 */

import za.ac.cput.entity.ContactType;

import java.util.Set;

public interface IContactType extends Irepository <ContactType,String>{
    public Set<ContactType> getAll();
}
