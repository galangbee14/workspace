package 일곱_메서드;

import java.util.Scanner;

public class Test_1_14_16_605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //test14(5);
        //test15(10, 6);
        test16(5);

    }

    //14 한 정수를 매개변수로 받아, 그 정수가 짝수이면 ‘짝수입니다’,
    // 홀수이면 ‘홀수입니다’를 출력하는 메소드를 선언하고 호출해보세요.

    public static void test14(int num){
        //삼항연산자
        //참또는것짓 ? 참 : 거짓;
//        int a = 10 > 5 ? 1 : 2;

        //아래 내용을 삼항 연산자로 표현
        System.out.println(num % 2 == 0 ? "짝수" : "홀수");

//        if(num % 2 == 0){
//            System.out.println("짝수");
//        }
//        else{
//            System.out.println("홀수");
//        }
    }

    //15 두 정수를 매개변수로 받아, 두 정수가 모두 짝수이면 ‘두 수는 짝수입니다.’를 출력하고,
    // 한 정수만 짝수일 경우 ‘한 수만 짝수입니다.’를,
    // 두 수 모두 홀수일 때는 ‘두 수는 홀수입니다.’를 출력하는 메소드를 선언하고 호출해보세요.

    public static void test15(int a, int b){
        if(a % 2 == 0 && b % 2 == 0){
            System.out.println("둘 다 짝수");
        }
        else if(a % 2 != 0 && b % 2 != 0){
            System.out.println("둘 다 홀수");
        }
        else {
            System.out.println("하나만 짝수");
        }
    }


    //16 한 정수를 매개변수로 받아,
    // 0부터 입력받은 숫자까지 출력하는 메소드를 선언하고 호출해보세요.

    public static void test16(int num){
        for(int i = 0; i < num + 1; i++){
            System.out.println(i);
        }
    }

}
