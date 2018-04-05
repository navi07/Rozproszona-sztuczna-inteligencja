<<<<<<< HEAD
package Model;

public class Address {

    private String city;
    private String street;
    private String houseNumber;
    private String voivodeship;
    private String zipCode;

    public Address(String city, String street, String houseNumber,
                   String voivodeship, String zipCode) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.voivodeship = voivodeship;
        this.zipCode = zipCode;
    }

    @Override
    public String toString(){
        return (city + ", " + street + ", " + houseNumber + ", " + voivodeship + ", " + zipCode);
    }
}
=======
package Model;

public class Address {

    private String city;
    private String street;
    private String houseNumber;
    private String voivodeship;
    private String zipCode;

    public Address(String city, String street, String houseNumber,
                   String voivodeship, String zipCode) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.voivodeship = voivodeship;
        this.zipCode = zipCode;
    }

    @Override
    public String toString(){
        return (city + ", " + street + ", " + houseNumber + ", " + voivodeship + ", " + zipCode);
    }
}
>>>>>>> a4061d3501f87c296bd18027dc103971f96c5ccd
