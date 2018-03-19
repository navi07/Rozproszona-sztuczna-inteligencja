package Model;


import java.io.Serializable;

public abstract class Person implements Print, Serializable {

    protected String name;
    protected String surname;
    protected String email;
    protected Address address;
    protected int phoneNumber;
    protected long pesel;

    public Person() {}

    public Person(String name, String surname, String email, Address address, int phoneNumber, long pesel) {
                this.name = name;
                this.surname = surname;
                this.email = email;
                this.address = address;
                this.phoneNumber = phoneNumber;
                this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public long getPesel() {
        return pesel;
    }

    public abstract void throwException() throws MyException.MyException; // Using class from other Packages without import


}
