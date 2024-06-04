package 다섯_반복문.For;

//1 ~ 100까지 숫자 중 3의 배수인 수의 개수를
//for문을 사용하여 풀어보아라.
public class Test_12_604 {
    public static void main(String[] args) {

        int count = 0;
        for(int i = 1; i < 101; i++){
            if(i % 3 == 0){
                count++;
            }
        }
        System.out.println("3의 배수의 개수 : " + count);
    }
}
