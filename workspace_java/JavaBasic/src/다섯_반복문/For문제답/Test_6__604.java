package 다섯_반복문.For문제답;

//출력문을 한번만 사용하여 ‘2 4 6 8 10’을 출력하되,
//for문을 사용하여 풀어라.
public class Test_6__604 {
    public static void main(String[] args) {

        for(int i = 2; i < 11; i += 2){
            System.out.println(i);
        }

        //2번째 방법
        for(int i = 1 ; i < 11; i++){
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }

}
