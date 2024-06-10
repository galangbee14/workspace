package class_basic;

public class StudentTest_607 {
    public static void main(String[] args) {

        //학생 객체 stu1 생성
        Student_607 stu1 = new Student_607();

        //stu1 이라는 학생의 이름을 출력
        System.out.println(stu1.name);

        //stu1 학생의 모든 정보 출력
        stu1.introduce();

        System.out.println();
        stu1.setName("kim");
        stu1.introduce();

        //같은 기능을 하는 코드이지만
        stu1.age = 30; //실제로 이렇게 코딩하지 않음
        stu1.setAge(30); //이렇게 하는 것을 추천
    }
}
