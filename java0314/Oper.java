package java0314;

public class Oper {
    public static void operation(){
        int mathScore = 90;
        int engScore = 70;
        int totalScore = mathScore + engScore;
        System.out.println(totalScore);
        double avgScore = totalScore / 2.0;
        System.out.println(avgScore);

    }
    public static void operation1(){
        int gameScore = 150;
        int LastScore = ++gameScore;
        int LastScore1 = --gameScore;
        System.out.println(gameScore);
        System.out.println(LastScore);
        System.out.println(LastScore1);
    }
    public static void main(String[] args) {
        operation();
        operation1();

        //3항연산자
        int num = 10;
        int i =2;

        boolean value = ((num= num+ 10)<10 &&(i = i + 2) < 10);
        System.out.println(value);

        value = ((num= num+ 10)>10 || (i = i + 2) < 10);
        System.out.println(value);
    }
}
