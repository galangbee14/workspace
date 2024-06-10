package class_basic.car;

//자동차는 제조사, 차이름, 차량번호, 가격, 소유주의 속성을 가지고 있다.
// 이 속성을 가진 Car 클래스를 선언해 보세요.
public class Car_610 {
    String brand;
    String modelName;
    String carNumber;
    int price;
    String owner;

    //자동차의 속성 하나하나를 각각 변경하는 메소드들을 만들어보세요.
    //제조사 값을 변경(set)하는 메서드 //값 변경은 통상적으로 set 변수명 사용
    public void setBrand(String b){
        brand = b;
    }
    //차이름을 변경하는 메서드
    public void setModelName(String modelName1){
        modelName = modelName1;
    }
    //차량번호를 변경하는 메서드
    public void setCarNumber(String carNumber1){
        carNumber = carNumber1;
    }
    //가격을 변경하는 메서드
    public void setPrice(int price1){
        price = price1;
    }
    //소유주를 변경하는 메서드
    public void setOwner(String owner1){
        owner = owner1;
    }

    //자동차의 속성을 출력하는 메소드를 만들고,
    // 새로운 클래스를 만들어 7,8번에서 만든 메소드가 잘 동작되는지 확인하세요.
    public void printCarInto(){
        System.out.println("브랜드 : " + brand);
        System.out.println("차량이름 : " + modelName);
        System.out.println("차량번호 : "+ carNumber);
        System.out.println("가격 : " + price);
        System.out.println("소유주 : " + owner);
    }


}
