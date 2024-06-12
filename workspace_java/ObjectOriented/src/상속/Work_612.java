package 상속;

class A1{
    private int x;
    private int y;

    public A1(){
        x = 1;
        y = 1;
    }

    public A1(int x){
        this.x = x;
        y = 1;
    }

    public A1(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void disp(){
        System.out.print("x = " + x + ", y = " + y +", ");
    }

}

class B1 extends A1{
    private int x;
    private int y;

    //super(); 가 생략되어 있다. <- 부모클래스의 생성자
    public B1(){
        x = 1;
        y = 1;
    }

    public B1(int x){
        super(x);
        this.x = 1;
        y = 1;
    }

    public B1(int x, int y){
        super(x, y);
        this.x = 1;
        this.y = 1;
    }

    public void disp(){
        super.disp(); //부모클래스에서 선언한 disp 호출
        System.out.println("x = " + x + ", y = " + y);
    }
}

public class Work_612 {
    public static void main(String[] args) {
        B1 bp = new B1();
        B1 bp1 = new B1(10);
        B1 bp2 = new B1(10, 20);
//        B1 bp3 = new B1(10, 20, 30);
//        B1 bp4 = new B1(10, 20, 30, 40);

        bp.disp();
        bp1.disp();
        bp2.disp();
//        bp3.disp();
//        bp4.disp();
    }
}
