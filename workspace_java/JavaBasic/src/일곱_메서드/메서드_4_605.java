package 일곱_메서드;

public class 메서드_4_605 {
    public static void main(String[] args) {
        introduce("자바", 20, "울산");

        String a = "홍길동";
        int b = 40;
        String c = "서울";

        System.out.println();
        introduce(a, b, c);

    }

    public static void introduce(String name, int age, String addr){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
    }

}
