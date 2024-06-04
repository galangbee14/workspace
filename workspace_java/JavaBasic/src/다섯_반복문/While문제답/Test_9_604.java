package 다섯_반복문.While문제답;

//9. while문을 사용하여 1 ~ 10까지의 합을 구하여라.

public class Test_9_604 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        // 통상적으로 i <= 10보다는 i < 11로 씀
        while (i < 11){
            sum += i;
            i++;
        }
        System.out.println(sum);

    }
}
