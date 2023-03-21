package java0321;

public class book {
    String title;
    String author;

    void show(){
        System.out.println(title + " " + author);
    }
    public book(){
        this("","홍길동");
    }
    public book(String title){
        this(title, "작가미상");
    }
    public book(String title, String author){
        this.title= title;
        this.author = author;
    }

    public static void main(String[] args){
        book emptybook = new book("자바를 배우자");
        emptybook.show();
    }
}
