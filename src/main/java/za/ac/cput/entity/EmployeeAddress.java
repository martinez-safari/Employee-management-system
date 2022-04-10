package za.ac.cput.entity;

public class EmployeeAddress
{
    private String employeeId;
    private String addressTypeId;


    public EmployeeAddress(EmployeeAddress.Builder builder)
    {
        this.employeeId=builder.employeeId;
        this.addressTypeId=builder.addressTypeId;

    }
    public String getEmployeeId() {
        return employeeId;
    }

    public String getAddressTypeId() {
        return addressTypeId;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "employeeId='" + employeeId + '\'' +
                ", addressTypeId='" + addressTypeId +
                '}';
    }

    public static class Builder
    {
        private String employeeId;
        private String addressTypeId;


        public EmployeeAddress.Builder setEmployeeId(String employeeId) {
            this.employeeId =employeeId;
            return this;
        }

        public EmployeeAddress.Builder setAddressTypeId(String addressTypeId) {
            this.addressTypeId= addressTypeId;
            return this;
        }


        public EmployeeAddress.Builder cody(EmployeeAddress employeeAddress)
        {
            this.employeeId=employeeAddress.getEmployeeId();
            this.addressTypeId=employeeAddress.addressTypeId;


            return this;
        }
        public EmployeeAddress Build()
        {
            return new EmployeeAddress (this);
        }
    }


}
