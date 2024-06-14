package Interface;

//무엇이든 넣고 뺄 수 있는 만능 박스
public class Box_614 {
    Object str;

    //(object 어떤 자료형이든 들어올 수 있다)
    //("모든 클래스가 들어올 수 있다." 기본 자료형(int, double..)은 원칙상 들어갈 수 없다.)
    //(object에 기본자료형도 들어가게하기 위해)
    //(기본 자료형을 클래스 형태로 만들어 놓을 것을 wrapper 클래스 라고 한다.)
    public void setBox(Object str){
        this.str = str;
    }

    public Object getBox(){
        return str;
    }

}
