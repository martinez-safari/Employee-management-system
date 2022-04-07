package za.ac.cput.entity;

public class EmployeeSalary
{
    private String employeeId;
    private String salaryId;

    //private constructor
    private EmployeeSalary(Builder builder)
    {
        this.employeeId = builder.employeeId;
        this.salaryId = builder.salaryId;
    }

    public String getEmployeeId()
    {
        return employeeId;
    }
    public void setEmployeeId(String employeeId)
    {
        this.employeeId = employeeId;
    }
    public String getSalaryId()
    {
        return salaryId;
    }
    public void setSalary(String salaryId)
    {
        this.salaryId = salaryId;
    }

    @Override
    public String toString()
    {
        return "Employee salary\n" + "Employee Id: "  + employeeId +"\nSalary Id: "  + salaryId;
    }

    public static class Builder
    {
        private String employeeId;
        private String salaryId;

        public Builder setEmployeeId(String employeeId)
        {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setSalaryId(String salaryId)
        {
            this.salaryId = salaryId;
            return this;
        }

        public Builder copy(EmployeeSalary employeeSalary)
        {
            this.employeeId = employeeSalary.employeeId;
            this.salaryId = employeeSalary.salaryId;
            return this;
        }

        public EmployeeSalary build()
        {
            return new EmployeeSalary(this);
        }
    }
}
