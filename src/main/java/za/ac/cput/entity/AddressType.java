package za.ac.cput.entity;

public class AddressType
{
    private String addressTypeId;
    private String streetName;
    private String postalCode;
    private String areaName;
    private String name;
    public AddressType(AddressType.Builder builder)
    {
        this.addressTypeId=builder.addressId;
        this.streetName=builder.streetName;
        this.postalCode=builder.postalCode;
        this.areaName=builder.areaName;
        this.name=builder.name;
    }

    public String getAddressId() {
        return addressTypeId;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "AddressType{" +
                "addressId='" + addressTypeId + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", areaName='" + areaName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder
    {
        private String addressId;
        private String streetName;
        private String postalCode;
        private String areaName;
        private String name;

        public AddressType.Builder setAddressId(String addressId) {
            this.addressId=addressId;
            return this;
        }

        public AddressType.Builder setStreetName(String streetName) {
            this.streetName= streetName;
            return this;
        }

        public AddressType.Builder setPostalCode(String postalCode) {
            this.postalCode= postalCode;
            return this;
        }

        public AddressType.Builder setAreaName(String areaName) {
            this.areaName= areaName;
            return this;
        }

        public AddressType.Builder setName(String name) {
            this.name= name;
            return this;
        }
        public AddressType.Builder cody(AddressType addressType)
        {
            this.addressId=addressType.addressTypeId;
            this.streetName=addressType.streetName;
            this.postalCode=addressType.postalCode;
            this.areaName=addressType.areaName;
            this.name=addressType.name;
            return this;
        }
        public AddressType  Build()
        {
            return new AddressType (this);
        }
    }
}
