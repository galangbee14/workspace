package Interface.array;

import javax.xml.transform.Result;

public class MyArray_613 implements MyArrayUtil_613 {

    //매개변수로 받은 두 배열의 모든 요소의 평균을 리턴
    @Override
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {

        //내가 푼 것
//        double result1 = 0;
//        for(int i = 0; i < arr1.length; i++){
//        result1 += arr1[i];}
//        double result2 = 0;
//        for(int i = 0; i < arr2.length; i++){
//        result2 += arr2[i];}
//
//        return ( result1 + result2 ) / ( arr1.length + arr2.length);

        //풀이
        int sum1 = 0; //arr1 배열의 합
        int sum2 = 0; //arr2 배열의 합

        //arr1 배열의 합
        for(int i = 0; i < arr1.length; i++){
            sum1 += arr1[i];}
        //arr2 배열의 합
        for(int i = 0; i < arr2.length; i++){
            sum2 += arr2[i];}

        //double로 꼭 변경하기
        return (sum1 + sum2) / (double)(arr1.length + arr2.length);
    }

    //매개변수로 받은 배열의 모든 요소가 짝수일때만 리턴 true.
    @Override
    //is~ -> 대부분 리턴타입 boolean
    public boolean isEvenArray(int[] array) {

        //내가 푼 것
//        boolean result = false;
//        int cnt = 0;
//
//        for(int i = 0; i < array.length; i++){
//        if(array[i] % 2 == 0){
//            cnt++;
//            if (cnt == array.length){
//                result = true;
//            }
//            }
//        }
//        return result;

        //풀이
        for(int e : array){
            if(e % 2 == 1){
                return false;
                //return은 메소드의 마지막에만 실행 됨, 아래 return은 실행되지 않음
                //홀수 한 번이라도 마주치면 false 실행되고 끝
            }
        }
        return true;
    }
}
