package Static;

//클래스를 배우기 전에는 왜 메서드에 static을 붙였는가?
//(최우선으로 해석하기 위해)(아래 메서드에 static 없애면 aaa(); 오류남)
public class Test2_613 {
    public static void main(String[] args) {
        aaa();
    }

    public static void aaa(){
        System.out.println("111");
    }
}
