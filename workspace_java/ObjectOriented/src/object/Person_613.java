package object;

public class Person_613 {
    String name;
    int age;

    //부모클래스의 메서드를 오버라이딩
    //오버라이딩이 되려면 메서드명 일치, 매개변수 정보 일치, 리턴타입 일치

    @Override
    public boolean equals(Object obj) {
        if(name.equals(((Person_613)obj).name) && age == ((Person_613)obj).age){
            return true;
        }
        else{
            return false;
        }
    }

    //tostring() 오버라이딩
    //객체를 문자열로 표현 -> 모든 맴버변수의 값을 문자열로 표현

    //generate -> override methods 로 자동완성 가능
//    @Override
//    public String toString() {
//        return super.toString();


    //generate -> toString 로 자동완성 가능

    @Override
    public String toString() {
        return "Person_613{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

