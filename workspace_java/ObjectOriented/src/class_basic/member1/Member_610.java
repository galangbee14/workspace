package class_basic.member1;

import java.awt.*;

public class Member_610 {
    //1. Member 클래스는 필드로 이름, 아이디, 비밀번호를 갖는다.
    // 모든 필드를 선언하고, 각 필드에 대한 setter와  getter를 만들어라.

    private String name;
    private String id;
    private int pass;

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getPass() {
        return pass;
    }

    //2. 모든 필드의 값을 출력하는 displayInfo() 메소드를 만들어라.
    public void displayInfo(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(pass);
    }

}
