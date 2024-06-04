package 다섯_반복문.For;

//임의의 정수를 입력받아 1부터 입력받은 수까지 중 짝수의 개수를 구하여라.
//for문을 사용하여 풀어보아라.

import java.util.Scanner;

public class Test_16_604 {
    public static void main(String[] args) {

        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int inPut = sc.nextInt();

        for(int i = 1; i < inPut; i++){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println("짝수의 개수 : " + count);
    }
}
