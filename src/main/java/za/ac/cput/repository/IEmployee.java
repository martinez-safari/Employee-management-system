package za.ac.cput.repository;
/*
IEmployee.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date April 9 2022
 */

import za.ac.cput.entity.Employe;

import java.util.Set;

public interface IEmployee extends   Irepository<Employe,String>{
    public Set<Employe> getAll();
}
