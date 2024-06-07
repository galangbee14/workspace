package 일곱_메서드;

import javax.xml.transform.Result;

public class Test_2_7_9_607 {
    public static void main(String[] args) {

        //7.
//        System.out.println(maeGae1(3.5));

        //8.
//        double Result1 = maeGae2(6,3,25);
//        System.out.println(Result1);

        //9.
        System.out.println(maeGae3(5));
    }

    //9. 한 정수를 매개변수로 받아, 1부터 매개변수로 받은 수까지 중
    // 홀수의 합을 리턴하는 메소드를 선언하고 사용해보세요.

    public static int maeGae3(int num5){
        int sum = 0;
        for(int i = 1; i < num5 + 1; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }

    //8. 세 정수를 매개변수로 받아, 세 정수의 평균을 리턴하는 메소드를 선언하고 사용해보세요.

    public static double maeGae2(int num2, int num3, int num4){
        return (num2+num3+num4) / 3.0;
    }

    //7. 실수를 매개변수로 받아, 그 수의 제곱 값을 리턴하는 메소드를 만들고 사용해보세요.

    public static double maeGae1(double num1){
        return num1*num1;
    }

}
