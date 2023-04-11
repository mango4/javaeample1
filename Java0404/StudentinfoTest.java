package Java0404;

public class StudentinfoTest {
    public static void main(String[] args) {
        Studentinfo studentinfo = new Studentinfo();

        //studentinfo.studenName= "김규빈";

        studentinfo.setStudentName("김규빈");
        System.out.println(studentinfo.getStudentName());
    }
}
