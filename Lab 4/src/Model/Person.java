package Model;

public abstract class Person implements Print {

    protected String name;
    protected String surname;
    protected String email;
    protected Address address;
    protected int phoneNumber;
    protected long pesel;


    public Person(String name, String surname, String email, Address address, int phoneNumber, long pesel) {
                this.name = name;
                this.surname = surname;
                this.email = email;
                this.address = address;
                this.phoneNumber = phoneNumber;
                this.pesel = pesel;
    }

    public abstract void throwException() throws MyException.MyException; // Using class from other Packages without import


}
