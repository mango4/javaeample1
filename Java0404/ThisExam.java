package Java0404;

class BirthDay{
    int day;
    int month;
    private int year;
    public void setYear(int year){
        this.year = year;
    }

    public  void printThis(){
        System.out.println(this);
    }

}
public class ThisExam {

    public static void main(String[] args) {
        BirthDay birthday = new BirthDay();
        birthday.setYear(2000);

        System.out.println(birthday);

        birthday.printThis();
    }
}


class School{
    String SchoolName = "한아전";
}