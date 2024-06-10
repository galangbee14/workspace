package class_basic.car;

public class CarTest_610 {
    // 새로운 클래스를 만들어 7,8번에서 만든 메소드가 잘 동작되는지 확인하세요.
    public static void main(String[] args) {
        Car_610 c1 = new Car_610();

        //c1의 정보를 출력
        //(객체명.변수명)
        System.out.println(c1.brand);
        System.out.println(c1.price);

        //c1 변수의 값 변경
        //(객체명.변수명)
        c1.brand = "현대";
        c1.price = 100;

        //변경된 c1의 정보를 출력
        System.out.println(c1.brand);
        System.out.println(c1.price);

        System.out.println();
        //새로운 클래스 생성
        Car_610 c2 = new Car_610();
        c2.printCarInto();

        //변경
        System.out.println();
        c2.setBrand("기아");
        c2.setModelName("k3");
        c2.setCarNumber("1111");
        c2.setPrice(1000);
        c2.printCarInto();

    }
}
