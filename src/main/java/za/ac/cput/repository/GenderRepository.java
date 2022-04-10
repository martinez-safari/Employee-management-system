package za.ac.cput.repository;
/*
Full Name Mutmaba Prince Bulambo
Student Number 220177767
Date April 8 2022
 */
import za.ac.cput.entity.Gender;

import java.util.HashSet;
import java.util.Set;

public class GenderRepository implements  IGender{

    private  static GenderRepository  repository=null;
    private Set<Gender> genderDB=null;

    private  GenderRepository()
    {
        genderDB= new HashSet<Gender>();
    }
    public static GenderRepository getRepository()
    {
        if(repository==null)
        {
            repository= new GenderRepository();
        }
        return repository;
    }
    @Override
    public Gender create(Gender gender) {
        boolean success=genderDB.add(gender);
        if(!success)
            return null;
        return gender;
    }

    @Override
    public Gender read(String genderId) {
        Gender gender=genderDB.stream().
                filter(e ->e.getGenderId().equals(genderId))

                .findAny().orElse(null);
        return  gender;

    }

    @Override
    public Gender update(Gender gender){
    Gender currentGender=read(gender.getGenderId());
        if (currentGender!=null)
    {

        genderDB.remove(currentGender);
        genderDB.add(gender);
    }
        return  currentGender;
    }
    @Override
    public Set<Gender> getAll() {
        return genderDB;
    }
    @Override
    public boolean delete(String genderId) {
        Gender deleteGender= read(genderId);
        if (deleteGender ==null)
        {
            return false;
        }
        genderDB.remove(deleteGender);
        return true;
    }

}
