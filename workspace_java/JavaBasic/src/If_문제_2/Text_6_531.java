package If_문제_2;

//*************시험출제**************
//세 정수를 선언하고 scanner로 값을 입력받는다.
// 그리고 세 수를 큰 순서대로 출력하여보라.(난이도 높음)
//        -출력예시-
//        첫번째 수 : 10
//        두번째 수 : 30
//        세 번째 수 : 20
//        30 > 20 > 10

import java.util.Scanner;

public class Text_6_531 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int max, mid, min;

        System.out.print("첫번째 수 : ");
        a = sc.nextInt();
        System.out.print("두번째 수 : ");
        b = sc.nextInt();
        System.out.print("세번째 수 : ");
        c = sc.nextInt();

        //a가 가장 큰 수라면
        if(a > b && a > c){
            max = a;
            if(b > c){
                mid = b;
                min = c;
            }
            else{
                mid = c;
                min = b;
            }
        }
        //b가 가장 큰 수라면
        else if(b > a && b > c){
            max = b;
            if(a > c){
                mid = a;
                min = c;
            }
            else{
                mid = c;
                min = a;
            }
        }
        //c가 가장 큰 수라면
        else{
            max = c;
            if(a > b){
                mid = a;
                min = b;
            }
            else{
                mid = b;
                min = a;
            }

        }
        System.out.println(max + ">" + mid + ">" + min);



    }
}
