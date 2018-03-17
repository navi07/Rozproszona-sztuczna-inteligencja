package Model;

import Containers.AcademicTitle; // Using classes from other Packages with import
import MyException.MyException;
import MyException.ExceptionSample;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private AcademicTitle academicTitle;
    private List<Subject> subjectList = new ArrayList<>();
    private static int count;
    private int id;

    ExceptionSample sample = new ExceptionSample();

    public Teacher(String name, String surname, String email, Address address, int phoneNumber, long pesel, AcademicTitle academicTitle){
        super(name, surname, email, address, phoneNumber, pesel);
        this.academicTitle = academicTitle;
        count++;
        id = count;
    }

    @Override
    public void print() {
        System.out.println("Teacher : " + "\n Name : " + name + "\n Surname : " + surname + "\n Email : " + email
                + "\n Address : " + address + "\n Phone number : " + phoneNumber + "\n PESEL : " + pesel
                + "\n Academic Title : " + academicTitle);
    }

    @Override
    public String toString(){
        return ("\nID : " + id + " " + name + " " + surname + "\n");
    }

    public boolean isTeaching(Subject subject) {
        return subjectList.contains(subject);
    }

    public void addSubject(Subject subject){
        subjectList.add(subject);
    }

    @Override
    public void throwException() throws MyException {
        sample.doSomething();
    }
}
