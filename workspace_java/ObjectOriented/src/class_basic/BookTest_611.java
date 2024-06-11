package class_basic;



public class BookTest_611 {
    public static void main(String[] args) {
        Book_611 book1 = new Book_611("java", "kim", 1000);
        Book_611 book2 = new Book_611("a", "b", 10);

        //자료형 변수명
        Book_611 book3 = book1;
        System.out.println(book1.title); //java
        System.out.println(book3.title); //java
        book1.title = "c++";
        System.out.println(book1.title); //c++
        System.out.println(book3.title); //c++


    }
}
