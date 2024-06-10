package class_basic.calculator;

import javax.xml.transform.Result;
import java.util.Scanner;

public class CalculatorTest_610 {
    //계산기 클래스를 사용하는 클래스를 만들어 계산기 프로그램을 실행하여 보세요.
    // main 메소드에서는 두 정수와 연산자를 scanner로 입력받습니다.
    // 입력받은 연산자에 따라 더하기, 뺴기, 곱셈, 나눗셈 중 하나를 실행합니다. 실행 후 결과를 출력해보세요.
    // 실행 결과는 아래와 같아야 합니다.(굵은 기울임체는 입력받는 수입니다.)
    //-결과-
    //첫 번째 수 : 10
    //두 번째 수 : 20
    //연산자 : +
    //10 + 20 = 30

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번재 수 : ");
        int numBer1 = sc.nextInt();
        System.out.print("두 번째 수 : ");
        int numBer2 = sc.nextInt();
        System.out.print("연산자 : ");
        String yeon = sc.next();

        Calculator_610 cal = new Calculator_610();

        System.out.print(numBer1 + yeon + numBer2 + " = ");

        //cal 객체의 num1과 num2를 키보드로 입력받은 값으로 변경
//        cal.setNumber(num1,num2);

        double result = 0;
        if(yeon.equals("+")){
//            System.out.println(numBer1 + yeon + numBer2 + " = " + cal.pluse());
            result = cal.pluse(numBer1,numBer2);
        }
        else if (yeon.equals("-")) {
            result = cal.minus(numBer1,numBer2);
        }
        else if (yeon.equals("*")){
            result = cal.gop(numBer1,numBer2);
        }
        else if (yeon.equals("/")){
            result =  cal.nanu(numBer1,numBer2);
        }
        else{
            System.out.println("연산자를 잘못입력했어요-!!");
        }

        System.out.println(result);
    }
}
