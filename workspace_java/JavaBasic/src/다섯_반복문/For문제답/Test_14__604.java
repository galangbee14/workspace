package 다섯_반복문.For문제답;

//1 ~ 100까지의 숫자 중 5의 배수인 수를 모두 출력하고, 5의 배수인 수의 개수도 출력하되,
//for문을 사용하여 풀어보아라.

public class Test_14__604 {
    public static void main(String[] args) {
        int cnt = 0;

        for(int i = 1; i < 101; i++){
            if(i % 5 == 0){
                cnt++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("5의 배수의 개수 : " + cnt);
    }
}
