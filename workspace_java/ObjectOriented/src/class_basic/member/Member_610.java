package class_basic.member;

public class Member_610 {
    //회원정보로는 이름, 아이디, 비밀번호, 나이를 관리할 것이다. 이 데이터를 가지는 클래스를 만들어 보세요.
    String name;
    String id;
    String pass;
    int age;

    //회원 등록을 위한 메소드를 만들어보세요.
    //(속성 하나하나를 각각 변경하는 메소드들을 만들어보세요.)

    public void setMemInfo(String name1, String id1, String pass1, int age1){
        name = name1;
        id = id1;
        pass = pass1;
        age = age1;
    }

    //각각
//    public void setName(String name1){
//        name = name1;
//    }
//    public void setId(String id2){
//        id = id2;
//    }
//    public void setPass(String pass1){
//        pass = pass1;
//    }
//    public void setAge(int age1){
//        age = age1;
//    }

    //등록한 회원의 정보를 확인(출력)하기 위한 메소드를 만들어 보세요.
    public void printMemInfo(){
        System.out.println("이름 : " + name);
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + pass);
        System.out.println("나이 : " + age);
    }

    //회원의 이름을 변경하기 위한 메소드를 만들어보세요.
    public void setName(String name2){
        name = name2;
    }

    //이름 변경이 잘 됬는지 확인하기 위한 이름 출력 메소드를 만들어보세요.
    public void printSetName(){
        System.out.println("변경된 이름 : " + name);
    }

}
