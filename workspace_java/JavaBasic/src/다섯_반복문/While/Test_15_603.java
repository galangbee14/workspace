package 다섯_반복문.While;

import java.util.Scanner;

//15. 임의의 정수를 입력받아 1부터 입력받은 수까지 중 짝수의 개수를 구하여라. while문 사용
public class Test_15_603 {
    public static void main(String[] args) {

        int i = 1;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        int inPut = sc.nextInt();

        while (i <= inPut){
            if (i % 2 == 0){
                count = count + 1;
            }
            i++;
        }
        System.out.println("짝수의 개수 : " + count);
    }
}
