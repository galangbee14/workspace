package Interface;

public class SamsungTv_613 implements Tv_613{


    @Override
    public void turnOn() {
        System.out.println("삼성티비 - 전원 켭");
    }

    @Override
    public void turnOff() {
        System.out.println("삼성티비 - 전원 끔");
    }

    @Override
    public void volumeUp() {
        System.out.println("삼성티비 - 소리 올림");
    }

    @Override
    public void volumeDown() {
        System.out.println("삼성티비 - 소리 내림");
    }
}
