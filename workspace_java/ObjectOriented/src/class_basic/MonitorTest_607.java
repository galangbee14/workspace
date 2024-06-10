package class_basic;

public class MonitorTest_607 {
    public static void main(String[] args) {

        //모니터 설계도에서 모니터 객체 생성
        //객체 생성 문법 : 클래스명 객체명 = new 클래스명();
        Monitor_607 m1 = new Monitor_607();

        //객체의 정보(변수) 값을 확인하는 방법
        //문법 : 객체명.변수명;
        System.out.println(m1.brand); //m1 모니터의 브랜드명 출력
        System.out.println(m1.price); //m1 모니터의 가격 출력
        System.out.println(m1.color); //m1 모니터의 색상 출력

        //변수값 바꾸는 첫번째 방법
        Monitor_607 m2 = new Monitor_607();
        m2.price = 1000;
        m2.brand = "samsung";
        m2.color = "black";

        System.out.println(m2.price);
        System.out.println(m2.brand);
    }

}
