package 다섯_반복문.While;

//9. while문을 사용하여 1 ~ 10까지의 합을 구하여라.

public class Test_9_603 {
    public static void main(String[] args) {

        int a = 1; //반복 시작점
        int sum = 0; //1~5까지의 합을 저장할 변수

        while(a <= 10){
            sum = sum + a;
            a++;
        }

        System.out.println(sum);
    }
}
