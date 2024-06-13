package Interface;

//Machine인터페이스에 정의한 메서드를 구현한 CoffeeMachine_613 클래스를 생성하겠다.
//인터페이스를 구현한 클래스는 맴버변수, 생성자 등 나머지 부분은 클래스와 동일하게 사용
public class CoffeeMachine_613 implements Machine_613{

    //마우스 올리고 Implement method 클릭
    @Override
    public void takeCoffee() {
        System.out.println("커피가 나옵니다.");
    }

    @Override
    public void takeMilk() {
        System.out.println("우유가 나옵니다.");
    }
}
