package Interface;

public class TvUser_613 {
    public static void main(String[] args) {
        //인터페이스를 구현한 클래스의 생성자로 인터페이스 객체 생성
        Tv_613 tv = new LgTv_613();
        tv.turnOn();
        tv.volumeDown();
        tv.volumeUp();
        tv.turnOff();

        //아래 4가지 방식으로 사용 가능
//        SamsungTv_613 tv1 = new SamsungTv_613();
//        LgTv_613 tv2 = new LgTv_613();
//        Tv_613 tv3 = new SamsungTv_613();
//        Tv_613 tv4 = new LgTv_613();
    }
}
