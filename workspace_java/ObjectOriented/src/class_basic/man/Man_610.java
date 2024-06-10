package class_basic.man;

public class Man_610 {
    //Man 클래스는 이름, 나이, 주소를 멤버로 가지고 있다. 모든 멤버를 선언하세요.
    private String name;
    private int age;
    private String addr;

    //멤버 모두의 값을 초기화 할 수 있는 메소드를 만드세요,
//    public void setMan(String name1, int age1, String add1){
//        name = name1;
//        age = age1;
//        add = add1;
//    }
    //위의 내용 대신
    //모든 값을 변경할 수 있는 생성자
    public Man_610(String name, int age, String addr){
        this.name = name;
        this.age = age;
        this.addr = addr;
    }
    //getter, setter만드는 법
    //마우스 우클릭 generate -> getter,setter -> 전체 선택 후 만들기

    //setter : 맴버변수 각가그이 값을 변경하는 메서드
    //setter의 이름은 set변수명으로 반드시 지정!
    //멤버 각각의 값을 변경하는 메소드를 3개를 만드세요.

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }


    //getter : 맴법변수 각각의 값을 return 받는 메서드
    //getter의 이름은 get변수명으로 반드시 지정!
    //리턴하는 메서드 통상적으로 get~
    //각 멤버의 값을 리턴하는 메소드를 3개 만드세요.
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddr() {
        return addr;
    }

    //멤버의 모든 정보를 출력하는 메소드를 만드세요.
    public void printMan(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
    }


}
