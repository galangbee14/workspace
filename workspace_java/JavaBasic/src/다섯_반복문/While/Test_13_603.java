package 다섯_반복문.While;

//13. 1 ~ 100까지의 숫자 중 5의 배수인 수를 모두 출력하고,
// 5의 배수인 수의 개수도 출력하되, while문을 사용하여라.
public class Test_13_603 {
    public static void main(String[] args) {

        int i = 1;
        int count = 0;

        while (i <= 100){
            if (i % 5 == 0){
                count = count +1;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("5의 배수의 개수 : " + count);
    }
}
