package class_basic.car;

//접근제한자 : 클래스, 메서드, 맴버변수에서 사용.
//1. public : 프로젝트 내에 존재하면 접근 가능
//2. default : 같은 패키지 내에 있으면 접근 가능
//3. protected : 해당 클래스 + 그 클래스를 상속한 자식 클래스에서...
//4. private : 변수, 메서드가 선언된 클래스 안에서만 접근 가능

//맴버변수에는 무조건 private (다른 클래서에서 직접 잘못된 데이터 입력하는 것 방지)
//메서드는 무조건 public
public class Phone_610_n {
    private int price;
    String modelName;
    String brand; //(앞에 아무것도 안 적으면 default 제한자)

    //생성자
    public Phone_610_n(){
        this.price = 0;
        this.modelName = "";
    }

    public void  setPrice(int price){
        this.price = price;
    }

}
