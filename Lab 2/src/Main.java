import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends Deanery {

    public static void main(String[] args) {

        Deanery deanery = new Deanery();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int choice;
        int id;

        // Created objects :
        Address address1 = new Address("Kraków", "Mickiewicza", "30", "Małopolskie", "34-051");
        Address address2 = new Address("Kraków", "Reymonta", "20", "Małopolskie", "34-051");
        deanery.teachers.add(new Teacher("Patryk", "Kurzeja", "kurzeja.patryk@gmail.com",
                address1, 88022550, 96090909336L, AcademicTitle.valueOf(AcademicTitle.class, "Student")));
        deanery.teachers.add(new Teacher("Janusz", "Kowalski", "kowalski.janusz@agh.edu.pl",
                address2, 98122850, 77050702336L, AcademicTitle.valueOf(AcademicTitle.class, "Student")));
        deanery.students.add(new Student("Student1", "Test1", "mail@wp.pl", address1, 894856456,
                95050702336L, Course.valueOf(Course.class, "ComputationalEngineering"), 1 ));
        deanery.students.add(new Student("Student2", "Test2", "mail@yahoo.com", address2, 594855456,
                96050702336L, Course.valueOf(Course.class, "AppliedComputerScience"), 1 ));

        while (!exit) {
            try {
                System.out.println(deanery.departmentName);
                for (char x: deanery.departmentShortcut) {
                    System.out.print(x);
                }

                System.out.println("\nSelect operation :");
                System.out.println("1. Add subject");
                System.out.println("2. Add teacher");
                System.out.println("3. Add student");
                System.out.println("4. Show students");
                System.out.println("5. Show teachers");
                System.out.println("6. Show subjects");
                System.out.println("7. Show if teachers have subjects");
                System.out.println("8. Show student informations");
                System.out.println("9. Show teacher informations");
                System.out.println("10. Show subject informations");
                System.out.println("11. Add final grade for student");
                System.out.println("12. Exit");
                System.out.print("Your choice : ");

                choice = scanner.nextInt();
                if ((Integer) choice instanceof Integer) {
                    switch (choice) {
                        case 1:
                            deanery.addSubject();
                            break;

                        case 2:
                            deanery.addTeacher();
                            break;

                        case 3:
                            deanery.addStudent();
                            break;

                        case 4:
                            deanery.showStudents();
                            break;

                        case 5:
                            deanery.showTeachers();
                            break;

                        case 6:
                            deanery.showSubjects();
                            break;

                        case 7:
                            deanery.showSubjectsOfATeacher();
                            break;

                        case 8:
                            System.out.println("Choice a student : ");
                            deanery.showStudents();
                            System.out.print("ID : ");
                            id = scanner.nextInt();
                            deanery.students.get(id-1).print();
                            break;

                        case 9:
                            System.out.println("Choice a teacher : ");
                            deanery.showTeachers();
                            System.out.print("ID : ");
                            id = scanner.nextInt();
                            deanery.teachers.get(id-1).print();
                            break;

                        case 10:
                            System.out.println("Choice a subject : ");
                            deanery.showSubjects();
                            System.out.print("ID : ");
                            id = scanner.nextInt();
                            deanery.subjects.get(id-1).print();
                            break;

                        case 11:
                            System.out.println("Choice a student : ");
                            deanery.showStudents();
                            System.out.print("ID : ");
                            id = scanner.nextInt();
                            System.out.print("Input final grade : ");
                            double grade = scanner.nextDouble();
                            deanery.students.get(id-1).setAverageGrade(grade);
                            break;

                        case 12:
                            exit = true;
                            break;
                    }
                } else {
                    throw new InputMismatchException();
                }

            } catch (InputMismatchException e) {
                System.out.println("Enter the correct value !");
                scanner.next();
            }
        }
        System.exit(0);






    }
}