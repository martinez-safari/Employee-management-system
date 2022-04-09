package za.ac.cput.repository;
/*
Full Name Mutmaba Prince Bulambo
Student Number 220177767
Date April 8 2022
 */
import za.ac.cput.entity.EmployeeAddress;
import java.util.*;


public class EmployeeAddressRepository implements  IEmployeeAddress{

    private Set<EmployeeAddress> DB;
    private  static EmployeeAddressRepository repository=null;

    private EmployeeAddressRepository(){
        DB =new HashSet<EmployeeAddress>();

    }
    public static EmployeeAddressRepository getInstance(){
        if(repository==null){
            repository=new EmployeeAddressRepository();}
        return repository;
    }



    @Override
    public EmployeeAddress create(EmployeeAddress employeeAddressObject) {
        boolean success=DB.add(employeeAddressObject);
        if(!success)
            return null;

        return employeeAddressObject;
    }

    @Override
    public EmployeeAddress read(String id) {
        EmployeeAddress empConct= DB.stream().
                filter(e ->e.getEmployeeId().equals(id))
                 .findAny().orElse(null);

        return empConct;

    }

    @Override
    public EmployeeAddress update(EmployeeAddress employeeAddressObject) {
        EmployeeAddress CurrentEmployeeAddress=read(employeeAddressObject.getEmployeeId());
        if(CurrentEmployeeAddress!=null){
            DB.remove(CurrentEmployeeAddress);
            DB.add(employeeAddressObject);}
    return employeeAddressObject;}
    @Override
    public boolean delete(String ID) {
        EmployeeAddress deleteById=read(ID);
        if(deleteById==null){
            return false;
        }
        DB.remove(deleteById);

        return true;
    }
    @Override
    public Set<EmployeeAddress> getAll() {


        return DB;
    }
}
