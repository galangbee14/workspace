package Interface.math;

public class MyMath_613 implements MathUtil_613{

    //매개변수로 받은 두 수 중 작은 수를 리턴
    @Override
    public int getMin(int a, int b) {
//        int min = 0;
//        if (a > b){
//            min = b;
//        } else {
//            min = a;
//        }
//        return min;
        return a < b ? a : b;
    }

    //매개변수로 받은 반지름을 가진 원의 둘레 리턴
    //단, 매개변수로 들어온 반지름이 음수라면 둘레는 0이되어야 함
    @Override
    public double getCircleArea(int radius) {
//        double r = 0;
//        if(r > 0){
//        r = 2 * 3.14 * radius;}
//        return r;

//        if(radius < 0){
//            return 0;
//        }
//        else{
//            return 2 * Math.PI * radius;
//        }

        return radius < 0 ? 0 : 2 * Math.PI * radius;
    }

    //첫번째 매개변수로 받은 수의 n제곱 값을 리턴
    //3, 4 인 경우 결과 3*3*3*3
    @Override
    public int getMultiple(int num1, int n) {
//        double result = Math.pow(num1, n);
//        return (int)result;
        int result = 1;
        for(int i = 0; i < n; i++){
            result = result * num1;
        }
        return result;
    }
}
