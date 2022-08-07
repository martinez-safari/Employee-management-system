package za.ac.cput.entity;

/*
Employee-management-system.java
Department.java
Author: Martinez Safari  219325332
Date: 07/04/2022
 */

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="Department")
public class Department implements Serializable {
    @Id
    @NotNull
    @Column

    private String deptId;
    @Column private String deptName;
    @Column private String deptDesc;

    protected Department() {}

    private Department(Builder builder){
        this.deptId= builder.deptId;
        this.deptName= builder.deptName;
        this.deptDesc= builder.deptDesc;


    }


    public String getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getDeptDesc() {
        return deptDesc;
    }


    @Override
    public String toString() {
        return "Department{" +
                "deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", deptDesc='" + deptDesc + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptId, deptName, deptDesc);
    }

    public static class Builder{
        private String deptId, deptName, deptDesc;

        public Builder setDeptId(String deptId) {
            this.deptId = deptId;
            return this;
        }

        public Builder setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }

        public Builder setDeptDesc(String deptDesc) {
            this.deptDesc = deptDesc;
            return this;
        }
        public Builder copy(Department department){
            this.deptId= department.deptId;
            this.deptName= department.deptName;
            this.deptDesc= department.deptDesc;
            return this;
        }
        public Department build(){

            return new Department(this);
        }

    }



}
