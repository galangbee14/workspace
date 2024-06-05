package 일곱_메서드;

import java.util.Scanner;

public class Test_1_17_19_605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //test17(5, 1);
        //test18(65, 0);
        test19("집에 가자  ",10);

    }

    //17 두 정수를 매개변수로 받아,
    // 두 정수 사이의 모든 숫자를 출력하는 메소드를 선언하고 호출해보세요.

    public static void test17(int a, int b){
        int max = a > b ? a : b;
        int min = a < b ? a : b;

        for(int i = min + 1; i < max; i++){
            System.out.println(i);
        }
    }


    //18 두 정수를 매개변수로 받아,
    // 두 정수 사이의 5의 배수의 개수를 출력하는 메소드를 선언하고 호출해보세요.

    public static void test18(int a, int b){
        int max = a > b ? a : b;
        int min = a < b ? a : b;

        int cnt = 0;
        for(int i = min + 1; i < max; i++){
            if(i % 5 == 0){
                cnt++;
            }
        }
        System.out.println(cnt);

    }

    //19 한 문자열과 정수를 매개변수로 받아,
    // 매개변수로 받은 문자열을 매개변수로 받은 숫자만큼 반복 출력하는 메소드를 선언하고 호출해보세요.

    public static void test19(String s, int num){
        String result = "";
        for (int i = 0; i < num; i++){
            result = result + s;
        }
        System.out.println(result);
    }

}
