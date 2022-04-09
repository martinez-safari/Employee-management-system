package za.ac.cput.repository;

import za.ac.cput.entity.Gender;

import java.util.Set;

public interface IGender extends  Irepository<Gender, String>
{



    public Set<Gender> getAll();
}

