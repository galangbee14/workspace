package collection.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestMember_614 {
    public static void main(String[] args) {
        //6. TestMember클래스에 main메소드를 만들어 위에서 만든 Member클래스의 객체를 저장할 수 있는 리스트를 만들어라.
        // 그리고 3개의 Member객체를 저장하고 저장된 객체의 정보를 모두 출력하는 프로그램을 만드세요.

        //Member 객체를 저장할 수 있는 list 객체 생성
        Member_614 m1 = new Member_614("356", "msi", 35);
        Member_614 m2 = new Member_614("614","msg",36);
        Member_614 m3 = new Member_614("386","java",66);
        List<Member_614> memberlist = new ArrayList<>();

        memberlist.add(m1);
        memberlist.add(m2);
        memberlist.add(m3);

//        for(int i = 0; i < memberlist.size(); i++){
//        System.out.println(memberlist.get(i));}

        //toString 사용!!
        for(Member_614 member :memberlist){
            System.out.println(member.toString());
        }

        System.out.println();
        //7. List에 저장된 모든 회원의 나이의 합을 출력하여라.
        int sum = 0;
        for(int i = 0; i < memberlist.size(); i++){
            sum += memberlist.get(i).getAge();
        }
        System.out.println("나이의 합 : " + sum);

        System.out.println();
        //8. List에 저장된 회원 중 id가 java인 회원을 지우는 코드를 작성하세요.
        int index = 0;
        for(int i = 0; i < memberlist.size(); i++){
            if(memberlist.get(i).getName().equals("java")){
                index = i;
            }
        }
        memberlist.remove(index);

    }
}
