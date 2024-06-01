package If_문제_2;



import java.util.Scanner;

public class Text_5_531 {
    //정수형 변수를 두 개 선언하고, scanner로 값을 입력받는다.
    // 입력받은 수의 크기를 비교하여 큰수부터 나열하여 출력하여라.
    // (굵은 기울기체는 사용자가 입력하는 부분이다)
    //-출력예시-
    //첫번째 수 : 10
    //두번째 수 : 20
    //20 > 10
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int max;
        int min;

        System.out.print("첫번째 수 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 수 : ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        System.out.println(max + ">" + min);
    }
}
