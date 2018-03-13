public class Subject {

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

        System.out.println("Subject : " + name + "\n Teacher : " + teacher +
                "\n Hours : " + hours + "\n Exam : " + isExam());
    }
}
