package class_basic.member13;

public class Member_610 {
    private String name;
    private String id;
    private String password;
    private int age;

    //Member 객체를 생성할 때 name 필드와 id 필드를 외부에서 받은 값으로 초기화 하려면
    //생성자를 어떻게 선언해야 하나?
    public Member_610(String name, String id){
        this.name = name;
        this.id = id;
    }
}
