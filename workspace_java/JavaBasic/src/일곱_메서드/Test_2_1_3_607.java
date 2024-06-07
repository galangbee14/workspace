package 일곱_메서드;

import java.util.Scanner;

public class Test_2_1_3_607 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //2.
//        int in1 = sc.nextInt();
//        int in2 = sc.nextInt();
//
//        int result1 = maeGae1 (in1, in2);
//        System.out.println(result1);

        //3.
            int result2 = test3(1,20);
            System.out.println(result2);
    }

    //2. scanner로 입력받은 두 정수를 매개변수로 받아,
    // 두 정수의 곱을 리턴하는 메소드를 선언하고 호출하여 결과를 호학인해보세요.

    public static int maeGae1(int num1, int num2){
        return num1 * num2;
    }

    //3. 두 정수를 매개변수로 받아,
    // 두 정수 중 큰 숫자를 리턴하는 메소드를 선언하고 사용해보세요.

    public static int test3(int a, int b){
//        if(a > b){
//            return a;
//        }
//        else {
//            return b;
//        }

        return a > b ? a : b;

        //return을 두 번 작성 할 수 있음, 실행 만 한 번 되면 됨.
    }

}
