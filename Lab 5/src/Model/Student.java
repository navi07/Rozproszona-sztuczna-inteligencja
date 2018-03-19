package Model;

import Containers.Course; // Using classes from other Packages with import
import MyException.MyException;
import MyException.ExceptionSample;

import java.io.Serializable;

public class Student extends Person implements Serializable{

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

    public int getGroupNumber() {
        return groupNumber;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public Course getCourse() {
        return course;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
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
    public String toString() {
        return ("Student : " + "\nID : " + id + "\n Name : " + name + "\n Surname : " + surname + "\n Email : " + email
                + "\n Address : " + address + "\n Phone number : " + phoneNumber + "\n PESEL : " + pesel
                + "\n Group : " + groupNumber + "\n Final grade : " + finalGrade + "\n");
    }

    @Override
    public void print() {
        System.out.println("Student : " + "\n Name : " + name + "\n Surname : " + surname + "\n Email : " + email
                + "\n Address : " + address + "\n Phone number : " + phoneNumber + "\n PESEL : " + pesel
                + "\n Group : " + groupNumber + "\n Final grade : " + finalGrade + "\n");
    }

    @Override
    public void throwException() throws MyException {
        sample.doSomething();
    }
}
