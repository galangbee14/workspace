package collection.test;

import java.util.ArrayList;
import java.util.List;

public class SchoolTest_617 {
    public static void main(String[] args) {
    //
    //자바반에 소속될 학생 3명 생성
    Student_617 s1 = new Student_617("김자바", 20, 80);
    Student_617 s2 = new Student_617("이자바", 30, 85);
    Student_617 s3 = new Student_617("박자바", 40, 90);

    //자바반에 저장할 학생 list
    List<Student_617> stuList1 = new ArrayList<>();
    stuList1.add(s1);
    stuList1.add(s2);
    stuList1.add(s3);

    //자바반
    StudyClass_617 javaClass = new StudyClass_617("자바반","자바강사",stuList1);

    //
    //캐드반에 저장될 학생 3명 생성
    Student_617 s4 = new Student_617("김캐드", 25, 85);
    Student_617 s5 = new Student_617("이캐드", 35, 95);
    Student_617 s6 = new Student_617("박캐드", 45, 90);

    //캐드반 학생들이 저장될 list생성 및 해당 list에 캐드반 학생 저장
    List<Student_617> stulist2 = new ArrayList<>();
    stulist2.add(s4);
    stulist2.add(s5);
    stulist2.add(s6);

    //캐드반 객체 생성 + 캐드반에 위에서 만든 캐드반 학생 목록 저장
    StudyClass_617 cadClass = new StudyClass_617("캐드반", "캐드강사", stulist2);

    //
    //영상반에 저장될 학생 3명 생성
    Student_617 s7 = new Student_617("김영상", 26, 86);
    Student_617 s8 = new Student_617("이영상", 36, 96);
    Student_617 s9 = new Student_617("박영상", 21, 81);

    //영상반 학생들이 저장될 list생성 및 해당 list에 캐드반 학생 저장
    List<Student_617> stulist3 = new ArrayList<>();
    stulist3.add(s7);
    stulist3.add(s8);
    stulist3.add(s9);

    //영상반 객체 생성 + 캐드반에 위에서 만든 캐드반 학생 목록 저장
    StudyClass_617 mediaClass = new StudyClass_617("영상반", "영상강사", stulist3);

    //
    //교실을 여러개 저장할 수 있는 list 생성
    List<StudyClass_617> classList = new ArrayList<>();
    classList.add(javaClass);
    classList.add(cadClass);
    classList.add(mediaClass);


    School_617 school = new School_617(classList);

    //학교 안의 모든 학생의 정보 출력
    for(int i = 0; i < school.getClassList().size(); i++){
        for(int j = 0; j < school.getClassList().get(i).getStuList().size(); j++)
            System.out.println(school.getClassList().get(i).getStuList());
    }
    }
}

//웹 개발
//(원래 순서)
//java -> jsp, servlet(웹 개발 기초) -> Spring
