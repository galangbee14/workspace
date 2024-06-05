package 일곱_메서드;

public class Test_1_4_6_605 {
    public static void main(String[] args) {
        //test1("돈터치미");
        //test2(5, 8);
        //test3(2, 5, 3);
    }

    //4 문자열 하나를 매개변수로 받아, 그 문자열을 출력하는 메소드를 선언하고 호출해보세요.
    public static void test1(String comeOn){
        System.out.println("문자열 : " + comeOn);
    }

    //5 정수 두 개를 매개변수로 받아, 두 수의 합을 출력하는 메소드를 선언하고 호출해 보세요.
    public static void test2(int num1, int num2){
        System.out.println("두 수의 합 : " + (num1 + num2));
    }

    //6 정수 세 개를 매개변수로 받아, 세 수의 곱을 출력하는 메소드를 선언하고 호출해 보세요.
    public static void test3(int numBer1, int numBer2, int numBer3){
        System.out.println("세 수의 곱 : " + numBer1*numBer2*numBer3);
    }

}
