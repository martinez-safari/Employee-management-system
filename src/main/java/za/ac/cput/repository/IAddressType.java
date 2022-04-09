package za.ac.cput.repository;

import za.ac.cput.entity.AddressType;

import java.util.Set;

public interface IAddressType extends   Irepository <AddressType, String>
{



          public Set<AddressType> getAll();
 }