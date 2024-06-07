package 일곱_메서드;

import java.io.IOError;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Test3_6_9_607 {
    public static void main(String[] args) {

        //6.
//        int[] arr = {1, 6, 9, 12, 18};
//        int maxi = maeGae1(arr);
//        System.out.println(maxi);

        //7.
//        String[] ar = {"lets", "go", "home"};
//        String outPut = test3_7(ar);
//        System.out.println(outPut);

        //8.

        //9.
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = test3_9(a);

        //배열 내용 출력
        System.out.println(Arrays.toString(result));
    }

    //9. 정수형 배열 하나를 매개변수로 받아
    // 배열의 요소 중 홀수를 제거한 새로운 배열을 리턴하는 메소드를 만들어보세요.

    public static int[] test3_9(int[] array){

        //매개변수로 넘어온 배열 요소 중 짝수의 개수
        int cnt = 0;
        for(int e : array){
            if(e % 2 == 0){
                cnt++;
            }
        }
        //짝수만 저장될 배열 생성
        int[] resultArr = new int[cnt];

        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                resultArr[index] = array[i];
                index++;
            }
        }
        return resultArr;
    }

    //8. 정수형 배열 두 개를 매개변수로 받아
    // 두 배열의 모든 요소를 갖는 새로운 배열을 리턴하는 메소드를 만들고 호출해보세요.
    //pass

    //7. 문자열 배열을 매개변수로 받아
    // 배열에 저장된 모든 문자열을 나열하여 리턴하는 메소드를 만들고 호출해보세요.

    public static String test3_7(String[] arr){
        String result = "";
        for(int i = 0; i < arr.length; i++){
            result = result + arr[i];
        }
        return result;
    }

    //6. 정수형 배열을 매개변수로 받아 배열의 모든 요소 중 최대값을 리턴하는 메소드를 만들고 호출해보세요.

    public static int maeGae1(int[] arr1){
        int max = 0;
        for(int i = 0; i < arr1.length; i++){

            if(max < arr1[i]){
                max = arr1[i];
            }
        }
        return max;
    }





}
