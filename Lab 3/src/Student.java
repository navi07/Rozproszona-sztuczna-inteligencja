public class Student extends Person {

    private int groupNumber;
    private double finalGrade;
    private Course course;
    private static int count;
    private int id;

    public Student(String name, String surname, String email,
                   Address address, int phoneNumber,
                   long pesel, Course course, int groupNumber) {
        super(name, surname, email, address, phoneNumber, pesel);
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

    @Override
    public void print() {
        System.out.println("Student : " + "\n Name : " + name + "\n Surname : " + surname + "\n Email : " + email
                + "\n Address : " + address + "\n Phone number : " + phoneNumber + "\n PESEL : " + pesel
                + "\n Group : " + groupNumber + "\n Final grade : " + finalGrade);
    }
}
