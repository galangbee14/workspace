package 상속;

//super(); -> 부모클래스의 생성자 호출
//this(); -> 현재 클래스의 생성자 호출

//super.변수 -> 부모클래스에서 선언한 변수
//this.변수 -> 이 클래스에서 선언한 변수



public class SuperCls_612 {
    public SuperCls_612(){}
    public SuperCls_612(int a){

    }
    public SuperCls_612(String a, int b){

    }
}

class SubCls_n extends SuperCls_612{
    public SubCls_n(){
        super(5);
    }
}
