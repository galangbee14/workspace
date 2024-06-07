package 일곱_메서드;

public class Test_2_4_6_607 {

    public static void main(String[] args) {
        //4.
//        String result1 = maeGae1("삼각", "김밥");
//        System.out.println(result1);

        //5.
//        System.out.println(maeGae2(80));

        //6.
        System.out.println(maeGae3(365));

    }

    //6. 매개변수로 정수를 입력받아, 입력받은 정수를 문자열로 리턴하는 메소드를 선언하고 사용해보세요.

    public static String maeGae3(int num2){
        //------------------이런게 있구나 하고 넘기기-----------
        //정수 -> 문자열
        String bb = String.valueOf(10);

        //문자열 -> 정수  (실무에서 굉장히 많이 씀)
        int aa = Integer.parseInt("10");
        //----------------------------------------------------

        return num2 + "";
    }


    //5. 임의의 정수를 매개변수로 받아, 만약 매개변수로 받은 정수가 90 이상이면 ‘A’,
    // 70 이상이면 ‘B’, 그 외의 수가 들어오면 ‘C’를 리턴하는 메소드를 선언하고 사용해보세요.

    public static String maeGae2(int num1){
        if(num1 >= 90){
            return "A";
        }
        else if (num1 >= 70) {
            return "B";
        }
        else {
            return "c";
        }
    }

    //4. 두 문자열을 매개변수로 받아,
    // 두 문자열의 나열결과를 리턴하는 메소드를 선언하고 사용해보세요.

    public static String maeGae1(String str1, String str2) {
        return str1 + str2;
    }

}
