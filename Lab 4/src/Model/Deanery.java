<<<<<<< HEAD
package Model;

import Containers.AcademicTitle; // Using classes from other Packages with import
import Containers.Course;

import java.util.ArrayList;
import java.util.Scanner;

public class Deanery {

    public String departmentName = "Wydział Inżynierii Metali i Informatyki Przemysłowej";
    public char[] departmentShortcut = { 'W', 'I', 'M', 'i', 'I', 'P' };

    public ArrayList<Teacher> teachers = new ArrayList<>();
    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Subject> subjects = new ArrayList<>();
    public ArrayList<Address> addresses = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void showSubjectsOfATeacher() {
        boolean table[][] = new boolean[teachers.size()][subjects.size()];

            for(int i = 0; i < teachers.size() ;i++) {
                for (int j = 0; j < subjects.size(); j++) {
                    table[i][j] = teachers.get(i).isTeaching(subjects.get(j));
                    int number = (table[i][j]) ? 1 : 0;
                    System.out.print(number + " ");
                }
                System.out.println(" ");
            }
    }

    public void addTeacher(){
        System.out.println("Making a new teacher : ");
        System.out.println("Input informations : ");
        System.out.print("Name : ");
        String name = scanner.nextLine();
        System.out.print("Surname : ");
        String surname = scanner.nextLine();
        System.out.print("E-mail : ");
        String email = scanner.nextLine();
        System.out.println("Model.Address  : ");
        System.out.print(" City : ");
        String city = scanner.nextLine();
        System.out.print(" Street : ");
        String street = scanner.nextLine();
        System.out.print(" House number : ");
        String houseNumber = scanner.nextLine();
        System.out.print(" Voivodeship : ");
        String voivodeship = scanner.nextLine();
        System.out.print(" Zip Code : ");
        String zipCode = scanner.nextLine();
        addresses.add(new Address(city, street, houseNumber,
                voivodeship, zipCode));
        Address address = addresses.get(addresses.size() - 1);

        System.out.print("Phone number : ");
        int phoneNumber = scanner.nextInt();
        System.out.print("PESEL : ");
        long pesel = scanner.nextLong();

        System.out.println("Academic Titles : ");
        System.out.println(java.util.Arrays.asList(AcademicTitle.values()));
        scanner.nextLine();
        System.out.print("Academic Title : ");
        String titleString = scanner.nextLine();

        teachers.add(new Teacher(name, surname, email,
                address, phoneNumber, pesel, AcademicTitle.valueOf(AcademicTitle.class, titleString)));
        scanner.nextLine();
    }

    public void addStudent(){
        System.out.println("Making a new student : ");
        System.out.println("Input informations : ");
        System.out.print("Name : ");
        String name = scanner.nextLine();
        System.out.print("Surname : ");
        String surname = scanner.nextLine();
        System.out.print("E-mail : ");
        String email = scanner.nextLine();
        System.out.println("Model.Address  : ");
        System.out.print(" City : ");
        String city = scanner.nextLine();
        System.out.print(" Street : ");
        String street = scanner.nextLine();
        System.out.print(" House number : ");
        String houseNumber = scanner.nextLine();
        System.out.print(" Voivodeship : ");
        String voivodeship = scanner.nextLine();
        System.out.print(" Zip Code : ");
        String zipCode = scanner.nextLine();
        addresses.add(new Address(city, street, houseNumber,
                voivodeship, zipCode));
        Address address = addresses.get(addresses.size() - 1);

        System.out.print("Phone number : ");
        int phoneNumber = scanner.nextInt();
        System.out.print("PESEL : ");
        long pesel = scanner.nextLong();

        System.out.print("Courses : ");
        System.out.println(java.util.Arrays.asList(Course.values()));
        scanner.nextLine();
        System.out.print("Containers.Course : ");
        String courseString = scanner.nextLine();

        System.out.print("Group number: ");
        int groupNumber = scanner.nextInt();
        students.add(new Student(name, surname, email, address, phoneNumber,
                pesel, Course.valueOf(Course.class, courseString), groupNumber ));
        scanner.nextLine();
    }

    public void addSubject(){
        System.out.println("Making a new subject : ");
        System.out.println("Input informations : ");
        System.out.print("Name : ");
        String name = scanner.nextLine();
        System.out.print("Hours : ");
        int hours = scanner.nextInt();
        System.out.print("Exam ( Yes / No ) : ");
        boolean exam = scanner.nextBoolean();
        System.out.print("Model.Teacher : ");
        System.out.println(teachers);
        System.out.println("ID : ");
        int id = scanner.nextInt();

       Subject subject =  new Subject(name, teachers.get(id-1), hours, exam);
       subjects.add(subject);
       teachers.get(id-1).addSubject(subject);
       scanner.nextLine();
    }

    public void showStudents(){
        System.out.println(students);
    }
    public void showTeachers(){
        System.out.println(teachers);
    }
    public void showSubjects(){
        System.out.println(subjects);
    }
    public void setStudentFinalGrade(int id, double finalGrade){
        students.get(id-1).setFinalGrade(finalGrade);
    }
}
=======
package Model;

import Containers.AcademicTitle; // Using classes from other Packages with import
import Containers.Course;

import java.util.ArrayList;
import java.util.Scanner;

public class Deanery {

    public String departmentName = "Wydział Inżynierii Metali i Informatyki Przemysłowej";
    public char[] departmentShortcut = { 'W', 'I', 'M', 'i', 'I', 'P' };

    public ArrayList<Teacher> teachers = new ArrayList<>();
    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Subject> subjects = new ArrayList<>();
    public ArrayList<Address> addresses = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void showSubjectsOfATeacher() {
        boolean table[][] = new boolean[teachers.size()][subjects.size()];

            for(int i = 0; i < teachers.size() ;i++) {
                for (int j = 0; j < subjects.size(); j++) {
                    table[i][j] = teachers.get(i).isTeaching(subjects.get(j));
                    int number = (table[i][j]) ? 1 : 0;
                    System.out.print(number + " ");
                }
                System.out.println(" ");
            }
    }

    public void addTeacher(){
        System.out.println("Making a new teacher : ");
        System.out.println("Input informations : ");
        System.out.print("Name : ");
        String name = scanner.nextLine();
        System.out.print("Surname : ");
        String surname = scanner.nextLine();
        System.out.print("E-mail : ");
        String email = scanner.nextLine();
        System.out.println("Model.Address  : ");
        System.out.print(" City : ");
        String city = scanner.nextLine();
        System.out.print(" Street : ");
        String street = scanner.nextLine();
        System.out.print(" House number : ");
        String houseNumber = scanner.nextLine();
        System.out.print(" Voivodeship : ");
        String voivodeship = scanner.nextLine();
        System.out.print(" Zip Code : ");
        String zipCode = scanner.nextLine();
        addresses.add(new Address(city, street, houseNumber,
                voivodeship, zipCode));
        Address address = addresses.get(addresses.size() - 1);

        System.out.print("Phone number : ");
        int phoneNumber = scanner.nextInt();
        System.out.print("PESEL : ");
        long pesel = scanner.nextLong();

        System.out.println("Academic Titles : ");
        System.out.println(java.util.Arrays.asList(AcademicTitle.values()));
        scanner.nextLine();
        System.out.print("Academic Title : ");
        String titleString = scanner.nextLine();

        teachers.add(new Teacher(name, surname, email,
                address, phoneNumber, pesel, AcademicTitle.valueOf(AcademicTitle.class, titleString)));
        scanner.nextLine();
    }

    public void addStudent(){
        System.out.println("Making a new student : ");
        System.out.println("Input informations : ");
        System.out.print("Name : ");
        String name = scanner.nextLine();
        System.out.print("Surname : ");
        String surname = scanner.nextLine();
        System.out.print("E-mail : ");
        String email = scanner.nextLine();
        System.out.println("Model.Address  : ");
        System.out.print(" City : ");
        String city = scanner.nextLine();
        System.out.print(" Street : ");
        String street = scanner.nextLine();
        System.out.print(" House number : ");
        String houseNumber = scanner.nextLine();
        System.out.print(" Voivodeship : ");
        String voivodeship = scanner.nextLine();
        System.out.print(" Zip Code : ");
        String zipCode = scanner.nextLine();
        addresses.add(new Address(city, street, houseNumber,
                voivodeship, zipCode));
        Address address = addresses.get(addresses.size() - 1);

        System.out.print("Phone number : ");
        int phoneNumber = scanner.nextInt();
        System.out.print("PESEL : ");
        long pesel = scanner.nextLong();

        System.out.print("Courses : ");
        System.out.println(java.util.Arrays.asList(Course.values()));
        scanner.nextLine();
        System.out.print("Containers.Course : ");
        String courseString = scanner.nextLine();

        System.out.print("Group number: ");
        int groupNumber = scanner.nextInt();
        students.add(new Student(name, surname, email, address, phoneNumber,
                pesel, Course.valueOf(Course.class, courseString), groupNumber ));
        scanner.nextLine();
    }

    public void addSubject(){
        System.out.println("Making a new subject : ");
        System.out.println("Input informations : ");
        System.out.print("Name : ");
        String name = scanner.nextLine();
        System.out.print("Hours : ");
        int hours = scanner.nextInt();
        System.out.print("Exam ( Yes / No ) : ");
        boolean exam = scanner.nextBoolean();
        System.out.print("Model.Teacher : ");
        System.out.println(teachers);
        System.out.println("ID : ");
        int id = scanner.nextInt();

       Subject subject =  new Subject(name, teachers.get(id-1), hours, exam);
       subjects.add(subject);
       teachers.get(id-1).addSubject(subject);
       scanner.nextLine();
    }

    public void showStudents(){
        System.out.println(students);
    }
    public void showTeachers(){
        System.out.println(teachers);
    }
    public void showSubjects(){
        System.out.println(subjects);
    }
    public void setStudentFinalGrade(int id, double finalGrade){
        students.get(id-1).setFinalGrade(finalGrade);
    }
}
>>>>>>> a4061d3501f87c296bd18027dc103971f96c5ccd
