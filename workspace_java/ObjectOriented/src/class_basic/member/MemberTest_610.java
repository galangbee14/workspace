package class_basic.member;

public class MemberTest_610 {
    //9 ~ 13번으로 클래스를 잘 구성했는지 확인하기 위해 객체를 만들어 확인하세요.
    public static void main(String[] args) {
        Member_610 m1 = new Member_610();

        //입력
        m1.setMemInfo("java","gajago","3333",65);
        //출력
        m1.printMemInfo();

        System.out.println();
        //이름 변경
        m1.setName("gagisiro");
        m1.printSetName();
        //이름만 출력
        System.out.println();
        //전체 출력
        m1.printMemInfo();

    }
}
