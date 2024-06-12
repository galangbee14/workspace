package 상속;

public class PhoneTest_612_n {
    public static void main(String[] args) {
        MobilePhone_612 m1 = new MobilePhone_612();
        SmartPhone sp1 = new SmartPhone();

        //부모클래스로는 자식 클래스의 객체를 받을 수 있음.
        //다형성으로 생성된 객체는 부모클래스의 변수, 메서드만 사용 가능
        //(smartphone의 메서도 사용 불가, mobilephone의 메서드 사용 가능)
        MobilePhone_612 m2 = new SmartPhone();
//        SmartPhone sp2 = new MobilePhone_612(); 오류!

    }
}
