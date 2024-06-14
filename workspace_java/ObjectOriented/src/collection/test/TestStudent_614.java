package collection.test;

import java.util.ArrayList;
import java.util.List;

public class TestStudent_614 {
    public static void main(String[] args) {


        //list 사용법
        //저장_ list.add()           읽기_ list.get(번호);
        //삭제_ list.remove(번호);    수_ list.size();

        //TestStudent 라는 클래스를 만들어, 위에서 만든 Student클래스의 객체가 저장되는 리스트를 만들어
        // 3명의 학생 정보를 추가한 다음, 아래 문제를 풀어보세요
        Student_614 stu1 = new Student_614("kimjava", 70, 80);
        Student_614 stu2 = new Student_614("parkjava", 80, 90);
        Student_614 stu3 = new Student_614("leejava", 60, 70);
        List<Student_614> list1 = new ArrayList<>();
        list1.add(stu1);
        list1.add(stu2);
        list1.add(stu3);

        //1) 리스트에 저장된 모든 정보를 출력해보세요.
        for(Student_614 student : list1){
            System.out.println(student.toString());
        }
        //2) 총점이 150점 이상인 학생의 모든 정보를 출력하세요.
        //3) 모든 학생에 대한 평균 점수를 출력하세요.
        //4) 총점이 1등인 학생의 모든 정보를 출력해보세요.
    }
}
