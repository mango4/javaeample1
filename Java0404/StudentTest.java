package Java0404;

public class StudentTest {
    public static void main(String[] args) {
        Student student= new Student();
        student.studentName="hong";
        System.out.println(student.getStudentName());

        Student student2= new Student();
        student2.studentName="세종대왕";
        System.out.println(student2.getStudentName());

        System.out.println(student);
        System.out.println(student2);

        StudentCoruse studentCoruse = new StudentCoruse();
        studentCoruse.studentName = "김규빈";
        //studentCoruse.korean.Score=100;
        //studentCoruse.korean.subjectName = "개꿀국어";

        Subject subject = new Subject();
        subject.Score = 100;
        subject.subjectName = "개꿀국어";

        System.out.println(subject.subjectName);

        studentCoruse.korean = subject;

        System.out.println(studentCoruse.korean.subjectName);

        studentCoruse.korean.subjectName = "개꿀국어";


    }
}