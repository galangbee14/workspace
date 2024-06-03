package IF_문제_3;

import java.sql.SQLOutput;
import java.util.Scanner;

// 369게임을 간단히 작성해보자.
// 1~99까지의 정수를 키보드로부터 입력받고 정수에 3, 6, 9 중 하나가 있는 경우는
// "박수짝"을 출력하고 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라.
// 예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하면 된다.
public class Test3_603 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1~99 사이의 정수를 입력하시오>>");
        int num = sc.nextInt();

        //십의 자리
        int tens = num / 10;
        //일의 자리
        int ones = num % 10;
        //박수의 횟수
        int clapCnt = 0;

        // 십의 자리가 3, 6, 9면 clapCnt를 1증가
        if(tens == 3 || tens == 6 || tens == 9){
           clapCnt++;
        }
        // 일의 자리가 3, 6, 9면 clapCnt를 1증가
        if(ones == 3 || ones == 6 || ones == 9){
            clapCnt++;
        }

        //clapCnt의 값에 따라 출력
        switch (clapCnt){
            case 1 :
                System.out.println("박수짝");
                break;
            case 2 :
                System.out.println("박수짝짝");
                break;

        }

    }

}
