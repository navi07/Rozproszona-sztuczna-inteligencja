public class Student {

    private String name;
    private String surname;
    private String email;
    private Address address;
    private int phoneNumber;
    private double finalGrade;
    private long pesel;
    private int groupNumber;
    private Course course;
    private static int count;
    private int id;

    public Student(String name, String surname, String email, Address address, int phoneNumber, long pesel,Course course, int groupNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.pesel = pesel;
        this.groupNumber = groupNumber;
        this.course = course;
        count++;
        id = count;
    }

    public void setAverageGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    @Override
    public String toString(){
        return ("\nID : " + id + " " + name + " " + surname +"\n");
    }

    public void print() {
        System.out.println("Student : " + "\n Name : " + name + "\n Surname : " + surname + "\n Email : " + email
                + "\n Address : " + address + "\n Phone number : " + phoneNumber + "\n PESEL : " + pesel
                + "\n Group : " + groupNumber + "\n Final grade : " + finalGrade);
    }
}
