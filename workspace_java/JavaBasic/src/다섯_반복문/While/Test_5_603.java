package 다섯_반복문.While;

//5. 출력문을 한번만 사용하여 ‘2 4 6 8 10’을 출력하되, while문을 사용하여라.

public class Test_5_603 {
    public static void main(String[] args) {

        int a = 1;

        while(a <= 10){
            if(a % 2 == 0){
                System.out.println(a);
            }
            a++;
        }
    }
}
