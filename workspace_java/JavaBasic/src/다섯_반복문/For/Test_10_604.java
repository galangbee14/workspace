package 다섯_반복문.For;

//1 ~ 10까지의 합을 구하여라.
//for문을 사용하여 풀어보아라.

public class Test_10_604 {
    public static void main(String[] args) {

        int sum = 0;
        for(int i = 1; i < 11; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
