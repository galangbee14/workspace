package 상속;

public class Animal_2_612_n {
    public static void main(String[] args) {

        Animal[] animalHouse = new Animal[10];
        Dog_612 d1 = new Dog_612();
        Cat cat1 = new Cat();
        Cow cow1 = new Cow();

        animalHouse[0] = d1;
        animalHouse[1] = cat1;
        animalHouse[2] = cow1;

        //Animal클래스의 변수, 메서드 사용가능
        //Dog 클래스의 변수, 메서드 사용 불가

        //(Dog클래스가 아니라 Animal클래스로 인식됨?)
        //(메서드 오버라이딩 사용하면, 자식클래스를 인식함?)

        //(다형성)
        //원래 자바는 자료형이 다르면 데이터 저장을 하지 못함
        //상속 관계를 맺어주면 부모클래스에 자식 클래스의 객체를 저장
        //그렇게 저장된 객체는 부모클래스의 메서드, 변수만 사용 가능
        //(메서드오버라이딩)
        //이 상황에서 자식 클래스의 메서드를 강제로 실행하는 방법이 존재
        //자식 클래스에서 실행하고자 하는 메서드를 오버라이딩 시켜주면
        //자식 클래스의 메서드를 강제로 실행시킬 수 있다.
        animalHouse[0].bark();

        for(int i = 0; i < 3; i++){
            animalHouse[i].bark();
        }

    }
}
