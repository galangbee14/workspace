package 일곱_메서드;

import java.util.Scanner;

public class Test_1_13_605 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        test13(x, y);
    }

    //13 scanner로 정수 두 개를 입력받아,
    // 입력받은 두 수를 매개변수로 사용하여 두 수의 합을 출력하는 메소드를 선언하고, 호출해보세요.
    public static void test13(int num1, int num2){
        System.out.println(num1 + num2);

    }
}
