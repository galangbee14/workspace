package class_basic.rect;


public class RectTest_611 {
    public static void main(String[] args) {


        Rectangle_611 r = new Rectangle_611();
        Rectangle_611 s = new Rectangle_611(1, 1, 2, 3);

        r.show();
        s.show();
        System.out.println(s.square());
        r.set(-2, 2, -1, 4);
        r.show();
        System.out.println(r.square());

        if(r.equals(s))
            System.out.println("두 사각형의 넓이는 같습니다.");
    }
}
