package class_basic.member1;

public class MemberTest_610 {
    //1. 실행 클래스를 만들어 이름을 ‘자바’, 아이디는  ‘java’,
    // 비밀번호는  ‘123’으로 변경하고 출력메소드를 사용하여 결과를 확인하여라.
    public static void main(String[] args) {
        Member_610 mem = new Member_610();
        mem.setName("자바");
        mem.setId("java");
        mem.setPass(123);

        System.out.println(mem.getName());
        System.out.println(mem.getId());
        System.out.println(mem.getPass());
    }
}
