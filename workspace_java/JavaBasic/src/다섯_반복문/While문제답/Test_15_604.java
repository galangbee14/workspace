package 다섯_반복문.While문제답;

import java.util.Scanner;

//15. 임의의 정수를 입력받아 1부터 입력받은 수까지 중 짝수의 개수를 구하여라. while문 사용
public class Test_15_604 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수 입력 : ");
        int num = sc.nextInt();

        int i = 1;
        int cnt = 0;
        while (i < num + 1){
            if(i % 2 == 0){
                cnt++;
            }
            i++;
        }
        System.out.println(cnt);



    }
}
