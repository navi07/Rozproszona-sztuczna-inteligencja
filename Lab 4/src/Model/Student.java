<<<<<<< HEAD
package Model;

import Containers.Course; // Using classes from other Packages with import
import MyException.MyException;
import MyException.ExceptionSample;

public class Student extends Person {

    private int groupNumber;
    private double finalGrade;
    private Course course;
    private static int count;
    private int id;

    ExceptionSample sample = new ExceptionSample();

    public Student(String name, String surname, String email,
                   Address address, int phoneNumber,
                   long pesel, Course course, int groupNumber) {
        super(name, surname, email, address, phoneNumber, pesel);
        this.groupNumber = groupNumber;
        this.course = course;
        count++;
        id = count;
    }

    public void setFinalGrade(double finalGrade) {
        try {
            if(finalGrade < 2 || finalGrade > 5){
                throwException();
            }
            else {
                this.finalGrade = finalGrade;
            }
        }
        catch (MyException e){
                System.out.println("Exception has been caught !");
        }
        finally {
            System.out.println("Enter grade from 2 to 5 ! \n");
        }
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

    @Override
    public void throwException() throws MyException {
        sample.doSomething();
    }
}
=======
package Model;

import Containers.Course; // Using classes from other Packages with import
import MyException.MyException;
import MyException.ExceptionSample;

public class Student extends Person {

    private int groupNumber;
    private double finalGrade;
    private Course course;
    private static int count;
    private int id;

    ExceptionSample sample = new ExceptionSample();

    public Student(String name, String surname, String email,
                   Address address, int phoneNumber,
                   long pesel, Course course, int groupNumber) {
        super(name, surname, email, address, phoneNumber, pesel);
        this.groupNumber = groupNumber;
        this.course = course;
        count++;
        id = count;
    }

    public void setFinalGrade(double finalGrade) {
        try {
            if(finalGrade < 2 || finalGrade > 5){
                throwException();
            }
            else {
                this.finalGrade = finalGrade;
            }
        }
        catch (MyException e){
                System.out.println("Exception has been caught !");
        }
        finally {
            System.out.println("Enter grade from 2 to 5 ! \n");
        }
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

    @Override
    public void throwException() throws MyException {
        sample.doSomething();
    }
}
>>>>>>> a4061d3501f87c296bd18027dc103971f96c5ccd
