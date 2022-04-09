package za.ac.cput.entity;

public class EmployeeDepartment {
    private String employeeId;
    private String deptId;

    private EmployeeDepartment() {
    }

    private EmployeeDepartment(Builder builder) {
        this.employeeId = builder.employeeId;
        this.deptId = builder.deptId;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "EmployeeDepartment{" +
                "employeeId='" + employeeId + '\'' +
                ", deptId='" + deptId + '\'' +
                '}';
    }

    public static class Builder {
        private String employeeId;
        private String deptId;

        public Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setContactId(String contactId) {
            this.deptId = deptId;
            return this;
        }

        public Builder copy(EmployeeDepartment employeeDepartment) {
            this.employeeId = employeeDepartment.employeeId;
            this.deptId = employeeDepartment.deptId;
            return this;
        }

        public EmployeeDepartment build() {
            return new EmployeeDepartment(this);
        }
    }
}