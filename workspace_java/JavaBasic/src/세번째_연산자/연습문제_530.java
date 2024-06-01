package 세번째_연산자;

import java.util.Scanner;

/*
키보드로 이름, 국어점수, 영어점수, 수학점수를 입력받는다.
단, 정수들은 정수만 입력한다고 가정한다.
모든 정보를 입력받은 후
입력받은 이름, 국어점수, 영어점수, 수학점수와  총점 및 평균을 출력.
*/
public class 연습문제_530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //변수 선언부터 하기
        int ko, en, ma, total;
        double average;

        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("국어점수 : ");
        ko = sc.nextInt();
        System.out.print("영어점수 : ");
        en = sc.nextInt();
        System.out.print("수학점수 : ");
        ma = sc.nextInt();

        total = ko + en + ma;
        average = total / 3.0;

        System.out.println();
        System.out.println("------------ 입력결과 ------------");

        System.out.println("이름은 " + name);
        System.out.println("국어점수는 " + ko);
        System.out.println("영어점수는 " + en);
        System.out.println("수학점수는 " + ma);

        //총점, 평균
        System.out.println("총점 " + total);
        System.out.println("평균 " + average);



    }
}
