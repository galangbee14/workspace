package Interface.student;

import Interface.Box_614;

//Wrapper 클래스 : 기본 자료형을 클래스로 표현한 것.
//래퍼클래스는 기본자료형처럼 사용하면 된다.
//int -> Integer (정수 Wrapper 자료형)
//double -> Double (실수 Wrapper 자료형)
//boolean -> Boolean
//float -> Float
public class BoxTest_614 {
    public static void main(String[] args) {
        //정수 10을 클래스화
        Integer a = Integer.valueOf(10);
        Integer c = 10;
        int e = 10;

        Box_614 b = new Box_614();
        b.setBox(23); // 10 -> Integer
        //(기본 자료형 안되는데 왜 들어가지나?)
    }
}
