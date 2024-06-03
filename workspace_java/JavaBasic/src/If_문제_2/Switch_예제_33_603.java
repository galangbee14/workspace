package If_문제_2;

import java.util.Scanner;

//간단한 계산기 프로그램 IF문을 활용하여 만들어 보자. 계산을 위해 두 정수가 필요하고,
//연산자(+, -, *, /)를 입력받을 문자열 변수도 필요해 보인다.
// 만약 두 수를 각각 1, 2로 입력받고 연산자로 +를 입력받았다면 출력결과는 ‘1 + 2 = 3’처럼 되어야한다.
// 그리고 연산자를 잘못 입력하였다면 ‘연산자를 잘못 입력하였습니다.’라고 출력되어야한다.
// 아래 결과예시처럼 프로그램이 될 수 있도록 코드를 작성하세요.(굵은 기울임체는 입력받는 부분이다.)
//  -결과예시 (1) -
//첫 번째 수 : 3
//두 번째 수 : 5
//연산자 : *
// 3 * 5 = 15
public class Switch_예제_33_603 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번재 수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번재 수 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자 : ");
        String yeon = sc.next();

        switch (yeon){
            case "+" :
                System.out.println(num1 + " " + yeon + " "  + num2 + " = " + (num1 + num2));
                break;
            case "-" :
                System.out.println(num1 + " " + yeon + " "  + num2 + " = " + (num1 - num2));
                break;
            case "*" :
                System.out.println(num1 + " " + yeon + " "  + num2 + " = " + (num1 * (double)num2));
                break;
            case "/" :
                System.out.println(num1 + " " + yeon + " "  + num2 + " = " + (num1 / (double)num2));
                break;
            default:
                System.out.println("연산자를 잘못 입력하였습니다.");
        }
    }
}
