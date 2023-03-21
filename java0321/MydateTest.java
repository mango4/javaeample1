package java0321;

public class MydateTest {
    public static void main(String[] args){


        Mydate mydate = new Mydate();
        //mydate.day = 31;
        mydate.setDay(31);
        int day = mydate.getDay();
        System.out.println(day);
    }
}
