package 일곱_메서드;

public class 메서드_5_607 {
    public static void main(String[] args) {

        //정수 합
//        int result = getSum(10, 31);
//        System.out.println(result);

        //위의 내용 아래 한 줄로
        //System.out.println(getSum(10, 31));

        //정수 + 실수 합
        double result2 = getSum2(10, 20);
    }

    //매개변수로 전달된 두 정수의 합을 리턴하는 메서드
    public static int getSum(int a, int b){
        return a + b;
    }

    //매개변수로 전달된 두 정수의 합을 실수형태로 리턴하는 메서드
    public static double getSum2(int c, int d){
        return c + (double)d;
    }

}
