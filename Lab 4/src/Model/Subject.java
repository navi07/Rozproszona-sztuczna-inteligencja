<<<<<<< HEAD
package Model;

public class Subject implements Print {

    private String name;
    private Teacher teacher;
    private int hours;
    private boolean exam;

    public Subject(String name, Teacher teacher, int hours, boolean exam) {
        this.name = name;
        this.teacher = teacher;
        this.hours = hours;
        this.exam = exam;
    }

    public String  isExam(){
        if (exam) return "Yes";
        else return "No";
    }

    @Override
    public String toString(){
        return ("\nName : " + name + " Hours : " + hours + " Exam : " + isExam() + "\n");
    }

    public void print() {

        System.out.println("Subject : " + name + "\n Model.Teacher : " + teacher +
                "\n Hours : " + hours + "\n Exam : " + isExam());
    }
}
=======
package Model;

public class Subject implements Print {

    private String name;
    private Teacher teacher;
    private int hours;
    private boolean exam;

    public Subject(String name, Teacher teacher, int hours, boolean exam) {
        this.name = name;
        this.teacher = teacher;
        this.hours = hours;
        this.exam = exam;
    }

    public String  isExam(){
        if (exam) return "Yes";
        else return "No";
    }

    @Override
    public String toString(){
        return ("\nName : " + name + " Hours : " + hours + " Exam : " + isExam() + "\n");
    }

    public void print() {

        System.out.println("Subject : " + name + "\n Model.Teacher : " + teacher +
                "\n Hours : " + hours + "\n Exam : " + isExam());
    }
}
>>>>>>> a4061d3501f87c296bd18027dc103971f96c5ccd
