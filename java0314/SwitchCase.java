package java0314;

public class SwitchCase {
    public static void intCase(int ranking) {
        char medalcolor;
        switch (ranking){
            case 1 :  medalcolor = 'g';
                 break;
            case 2 :  medalcolor = 'g';
                break;
            case 3 :  medalcolor = 'g';
                break;
            default:  medalcolor = 'a';
        }
        System.out.println(ranking + "동 메달의 색깔은"+medalcolor + "입니다");
        System.out.println(ranking + "동 메달의 색깔은"+medalcolor + "입니다");

    }
    public static void main(String[] args) {
        int ranking = 1;
        String medal = "Gold";
        intCase(ranking);

        int month = 3;
        int day = 0;
        switch (month){
            case 1: case 3 : case  5: case 7: case 8: case 10: case 12:  day = 31;
                break;
            case 4: case 6: case 9: case 11: day = 30;
               break;
            case 2: day = 28;
                 break;
        }
        System.out.println(day);
    }
}
