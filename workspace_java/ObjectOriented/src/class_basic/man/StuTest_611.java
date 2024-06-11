package class_basic.man;

//배열 + 클래스
public class StuTest_611 {
    public static void main(String[] args) {

    //학생(Student class)을 5명 저장할 수 있는 배열 생성
    //학생 5명을 저장할 수 있는 통을 생성
    Student_611[] students = new Student_611[5];

    //배열에 저장할 학생 객체 생성
    Student_611 s1 = new Student_611("김", 20, 80);
    Student_611 s2 = new Student_611("이", 30, 75);
    Student_611 s3 = new Student_611("최", 40, 85);
    Student_611 s4 = new Student_611("박", 35, 90);
    Student_611 s5 = new Student_611("홍", 25, 70);
//    s1.print();

    //배열 0번째 요소에 학생 s1 저장
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;
    students[3] = s4;
    students[4] = s5;

    //1. 배열에 저장된 모든 학생의 이름, 나이, 점수를 출력
        for(int i = 0; i < students.length; i++){
            students[i].print();
            System.out.println();
        }
        System.out.println("1foreach------------");

    //1번 문제를 for-each문으로 해결
//        for(Student_611 s : students){
//            s.print();
//            System.out.println();
//        }
//        System.out.println("2------------");
    //2. 배열에 저장된 학생 중 점수가 80점 이상인 학생의 이름, 나이, 점수 출력
//        for(int i = 0; i < students.length; i++){
//            if(students[i].getScore() >= 80) {
//                students[i].print();
//                System.out.println();
//            }
//            }

        //3. 이름이 '박'인 학생을 찾아 해당 학생의 나이를 10으로 변경
        //for
        for(int i = 0; i < students.length; i++){
            if(students[i].getName().equals("박")){
                students[i].setAge(10);
            }
        }
        //for-each
        for(Student_611 e : students){
            if(e.getName().equals("박")){
                e.setAge(10);
            }
        }

    }
}
