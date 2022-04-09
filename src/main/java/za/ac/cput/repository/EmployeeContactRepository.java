package za.ac.cput.repository;

import za.ac.cput.entity.EmployeeContact;

import java.util.HashSet;
import java.util.Set;

public class EmployeeContactRepository implements IEmployeeContact {
    private Set<EmployeeContact> EmployeeContactDB;
    private  static EmployeeContactRepository EC_repository=null;


    private EmployeeContactRepository(){
        EmployeeContactDB =new HashSet<EmployeeContact>();

    }
    public static EmployeeContactRepository getInstance(){
        if(EC_repository==null){
            EC_repository=new EmployeeContactRepository();}
        return EC_repository;
    }




    @Override
    public EmployeeContact create(EmployeeContact empConct) {
        boolean success= EmployeeContactDB.add(empConct);
        if(!success)
            return null;
        return empConct;

    }

    @Override
    public EmployeeContact read(String ID) {
        EmployeeContact empConct= EmployeeContactDB.stream().
                filter(e ->e.getEmployeeId().equals(ID))
                //filter(e ->e.getContactId().equals(ID))

                .findAny().orElse(null);
        return empConct;

    }

    @Override
    public EmployeeContact update(EmployeeContact empConct) {
        EmployeeContact oldConct=read(empConct.getEmployeeId());
        if(oldConct!=null){
            EmployeeContactDB.remove(oldConct);
            EmployeeContactDB.add(empConct);

        }
        return empConct;
    }

    @Override
    public boolean delete(String ID) {
        EmployeeContact deleteEmpConct=read(ID);
        if(deleteEmpConct==null){
            return false;
        }
        EmployeeContactDB.remove(deleteEmpConct);
        return true;
    }
    @Override
    public Set<EmployeeContact> getAll() {
        return EmployeeContactDB;
    }
}
