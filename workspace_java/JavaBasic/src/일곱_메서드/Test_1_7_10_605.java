package 일곱_메서드;

public class Test_1_7_10_605 {
    public static void main(String[] args) {

        //test1(9, 3);
        //test2("문자열", "추가하기");
        //test3("민주스", 28, "울산");
        test4("민주스");
        test5(28);
        test6("ulsan");

    }

    //7 두 정수를 매개변수로 받아, 두 정수의 나눗셈 몫과 나머지를 출력하는 메소드를 선언하고 호출해보세요.
    public static void test1(int num1, int num2){
        System.out.println("나눗셈 몫 : " + num1/num2);
        System.out.println("나눗셈 나머지 : " + num1%num2);
    }

    //8 두 문자열을 매개변수로 받아, 두 문자열의 나열결과를 출력하는 메소드를 선언하고 호출해보세요.
    public static void test2(String text1, String text2){
        System.out.println("나열 : " + text1 + text2);
    }

    //9 이름을 매개변수로 받아 이름을 출력하는 메소드,
    // 나이를 매개변수로 받아 나이를 출력하는 메소드,
    // 주소를 매개변수로 받아 주소를 출력하는 메소드를 각각 만들고
    // 출력결과가 아래와 같게 프로그래밍하세요.

    //- 출력결과 예시-
    //이름은 김형진입니다.
    //나이는 33살입니다.
    //주소는 울산입니다.
    public static void test4(String name){
        System.out.println("이름은 " + name + "입니다.");
    }
    public static void test5(int age){
        System.out.println("나이는 " + age + "살입니다.");
    }
    public static void test6(String addr){
        System.out.println("주소는 " + addr + "입니다.");
    }

    //10 위의 문제를 하나의 메소드를 사용하여 출력결과가 같게 프로그래밍 해보세요.
    public static void test3(String name, int age, String addr){
//        System.out.println("이름은 " + name + "입니다.");
//        System.out.println("나이는 " + age + "살입니다.");
//        System.out.println("주소는 " + addr + "입니다.");

        test4(name);
        test5(age);
        test6(addr);
    }



}
