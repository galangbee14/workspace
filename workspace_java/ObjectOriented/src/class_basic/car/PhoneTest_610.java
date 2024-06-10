package class_basic.car;

public class PhoneTest_610 {
    public static void main(String[] args) {
        Phone_610_n p = new Phone_610_n();

        //System.out.println(p.price);

        //아래 방법 사용 못하게, 선언할 때 private을 앞에 붙인다.
        //p.price = 1000;
        //아래 방법으로 하면 잘못된 값 설정되는 것 방지
        p.setPrice(1000);

    }
}
