package 일곱_메서드;

public class Test_1_1_3_605 {
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3(5);
    }

    //1번 ‘안녕하세요’ 라는 문자열를 출력하는 기능을 가진 메소드를 선언하고, 호출해 보세요.
    public static void test1(){
        System.out.println("안녕하세요");
    }

    //2번 ‘반갑습니다’ 라는 문자열을 출력하는 기능을 가진 메소드와
    // ‘오서오세요’라는 문자열을 출력하는 메소드를 각각 선언하고,
    // 실행 결과 ‘반갑습니다 어서오세요’라는 문자열이 출력되게 호출하여 보자.
    public static void test2(){
        System.out.println("반갑습니다");
        System.out.println("어서오세요");
    }

    //3번 정수 하나를 매개변수로 받아, 그 값을 출력하는 메소드를 선언하고 호출하여 보세요.
    public static void test3(int come){
        System.out.println("정수 : " + come);
    }

}
