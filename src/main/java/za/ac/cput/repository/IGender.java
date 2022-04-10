package za.ac.cput.repository;
/*
Full Name Mutmaba Prince Bulambo
Student Number 220177767
Date April 8 2022
 */
import za.ac.cput.entity.Gender;

import java.util.Set;

public interface IGender extends  Irepository<Gender, String>
{



    public Set<Gender> getAll();
}

