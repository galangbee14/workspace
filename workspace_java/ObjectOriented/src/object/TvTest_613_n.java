package object;

import 상속.MobilePhone_612;

public class TvTest_613_n {
    public static void main(String[] args) {

        Tv_613 tv = new Tv_613();

        //객체명.변수명, 객체명.메서드명으로  변수와 메서드 호출 가능!
        System.out.println(tv.modelName);
        tv.powerOn();

        //Object 클래스는 모든 클래스의 부모클래스다.
        //자료형이 다르면 데이터 저장 불가
        //다형성에 의해서 부모클래스로 자식클래스 객체를 저장할 수 있다.
        Object o1 = new Tv_613();
        Object o2 = new MobilePhone_612();



    }
}
