package 상속;

//다형성 : 객체의 생성 형태(방법)가 다양함.
public class MobilePhone_612 {
    String number;

    public void sendMsg(){
        System.out.println("메세지 전송~");
    }
}

class SmartPhone extends MobilePhone_612{
    String os;

    public void playApp(){
        System.out.println("앱 실행~");
    }
}
