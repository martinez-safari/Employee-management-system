package za.ac.cput.repository;
/*
Full Name Mutmaba Prince Bulambo
Student Number 220177767
Date April 8 2022
 */
import za.ac.cput.entity.AddressType;

import java.util.Set;

public interface IAddressType extends   Irepository <AddressType, String>
{



          public Set<AddressType> getAll();
 }