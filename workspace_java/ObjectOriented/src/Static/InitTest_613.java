package Static;

public class InitTest_613 {
    public static void main(String[] args) {

        StaticInit_613 i1 = new StaticInit_613();
        StaticInit_613 i2 = new StaticInit_613();
        StaticInit_613 i3 = new StaticInit_613();

        //static 변수를 읽고 사용하는 방법
        //객체명.변수명으로 static 변수도 사용가능.
        // 추천하지 않는 방법 (i1 객체 안에 값 없고 num값 공용으로 만들어 참조만 하고 있으므로)
        System.out.println(i1.num); //8
        System.out.println(i2.num); //8

        //static변수 및 메서드는
        //클래스명.변수명 으로 접근
        //이러한 접근 방법은 객체를 만들지 않아도 사용가능
        // (객체 만들기 전에 num값 먼저 공용으로 생성되므로)
        System.out.println(StaticInit_613.num);

        //random은 static 붙어있음
        //클래스명.변수명 (으로 사용가능)
        Math.random();

                   //매서드 오버로딩 되어있기 때문에 가능
               //static 변수, 참조자료형
        System.out.println();
    }
}
