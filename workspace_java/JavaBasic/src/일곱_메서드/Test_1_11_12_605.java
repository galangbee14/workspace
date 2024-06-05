package 일곱_메서드;

import java.util.Scanner;

public class Test_1_11_12_605 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //11
//        System.out.print("입력 : ");
//        int num = sc.nextInt();

        //12
//        test1(num);

        //12
        System.out.println("이름 입력 : ");
        String numBer1 = sc.next();
        System.out.println("나이 입력 : ");
        int numBer2 = sc.nextInt();
        System.out.println("지역 입력 : ");
        String numBer3 = sc.next();
        test3(numBer1, numBer2, numBer3);


    }
    //11 입력받은 정수를 매개변수로 받아, 해당 정수를 출력하는 메소드를 선언하고 호출해보세요.
    public static void test1(int num1){
        System.out.println("정수 : " + num1);
    }

    //12 10번 문제를 풀었다면,
    // 10번 문제에서 매개변수로 받는 이름, 나이, 주소를 scanner를 통한 입력으로 바꾸어 풀어보세요.
    public static void test3(String name, int age, String addr){
        System.out.println("이름은 " + name + "입니다.");
        System.out.println("나이는 " + age + "살입니다.");
        System.out.println("주소는 " + addr + "입니다.");
    }
}
