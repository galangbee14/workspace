package class_basic;

public class Book_611 {
    String title;
    String writer;
    int price;

    public Book_611(){
        this.title = "";
        this.writer = "";
        this.price = 0;
    }

    //우클릭 --> generate --> constructor로 생성자 한 번에 만들 수 있음
    public Book_611(String title, String writer, int price) {
        this.title = title;
        this.writer = writer;
        this.price = price;
    }
}
