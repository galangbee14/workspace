package 일곱_메서드;

public class Test3_1_5_607 {
    public static void main(String[] args) {

        //5.
//        int[] a = {1, 3, 5};
//        arr_5(a);

        //1.
//        gugu(7);

        //2.
        //baeSu(8);

        //3.
        //System.out.println(ranDom());

        //4.
        //System.out.println(holJjak(4));


    }

    //5. 정수형 배열을 매개변수로 받아 배열의 모든 요소를 출력하는 메소드를 만들고 호출하세요.

    public static void maeGae(int[] num2){

    }

    //4. 정수 하나를 매개변수로 받아, 매개변수가 짝수면 true,
    // 홀수면 false를 리턴하는 메소드를 만들고 활용해보자.

    public static boolean holJjak(int num1){
        if(num1 % 2 == 0){
            return true;
        }
        else{
            return false;
        }

        //아래와 같이 짧게 표현 가능
        //return num % 2 == 0 ? true : false;

        //아래와 같이 더 짧게 표현 가능
        //return num % 2 ==0; -->어차피 true 또는 false로 출력됨
    }

    //3. Math.random() 메소드를 활용하여
    // 1~ 50의 수 중 랜덤한 정수를 리턴하는 메소드를 만들고 호출해보자.

    public static int ranDom(){
        int num1 = 0;
        num1 = (int)(Math.random() * 50 + 1);

        return num1;

        //짧게 아래와 같이 표현 가능
        // return (int)(Math.random() * 50 + 1);
    }

    //2. 정수 하나를 매개변수로 받아,
    // 1 ~ 100까지의 수 중에서 매개변수로 받은 수의 배수를 출력하는 메소드를 만들고 호출해보세요.
    public static void baeSu(int num2){
        for(int i = 1; i < 101; i++){
            if(i % num2 == 0){
                System.out.println(i);
            }
        }
    }

    //1. 정수 하나를 매개변수로 받아 해당 정수의 구구단을 출력하는 메소드를 만들고 호출해보세요.

    public static void gugu(int num1){

        for(int i = 1; i <10; i++){
            int dan = 0;
            dan = num1 * i;
            System.out.println(num1 + "*" + i + "=" + dan);

        }
    }


    //5. 정수형 배열을 매개변수로 받아 배열의 모든 요소를 출력하는 메소드를 만들고 호출하세요.

    public static void arr_5(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
