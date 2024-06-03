package IF_문제_3;

import java.util.Scanner;

// 2차원 평면에서 하나의 직사각형은 두 점으로 표현된다.
// (50, 50)과 (100, 100)의 두 점으로 이루어진 사각형이 있다고 하자.
// 이때 키보드로부터 한 점을 구성하는 정수 x와 y값을 입력받고 점 (x, y)가
// 이 직사각형 안에 있는지를 판별하는 프로그램을 작성하라.
public class Test2_603 {
    public static void main(String[] args) {

        System.out.println("점 (x,y)의 좌표를 입력하시오>>");

        Scanner sc = new Scanner(System.in);
        int xPos = sc.nextInt();
        int yPos = sc.nextInt();

        if(50 <= xPos && xPos <= 100 && 50 <= yPos && yPos <= 100){
            System.out.println("입력한 좌표는 사각형 내부에 있습니다.");
        }else{
            System.out.println("입력한 좌표는 사각형 외부에 있습니다.");

        }
    }
}
