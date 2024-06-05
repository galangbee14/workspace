package 여섯_배열.문제;

import java.io.OutputStream;
import java.util.Scanner;

// 정수를 5개 저장할 수 있는 배열을 만들고, scanner를 통해 입력받은 값을 하나씩 배열의 요소에 저장해보자.
// 만약 키보드로 1 2 3 4 5를 입력했다면 배열의 요소에 각각 1 2 3 4 5 가 저장되어야 한다.
// 출력을 통해 결과를 확인해 보아라.
public class Test_10_604 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];

        Scanner sc = new Scanner(System.in);


       // int num1 = sc.nextInt(); - 오답

        //배열의 크기만큼 반복해서 입력값을 배열의 각 요소에 저장
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i + "번째 요소 입력 : ");
            arr1[i] = sc.nextInt();
        }

//        for (int i = 0; i < arr1.length; i++) { - 오답
//            arr1[i] = num1; - 오답
//        } - 오답

        System.out.println("-배열에 저장된 요소-");
        for(int b = 0; b < arr1.length; b++){
            System.out.print(arr1[b] + " ");}

        System.out.println();
        System.out.println("-for-each로 변경-");
        for(int e : arr1){
            System.out.print(e + " ");
        }
    }

}
