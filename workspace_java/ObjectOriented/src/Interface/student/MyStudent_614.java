package Interface.student;

public class MyStudent_614 implements StudentUtil_613 {
    @Override
    //첫번째 매개변수로 받은 다수의 학생 중
    // 두번째 매개변수로 받은 이름을 가진 학생의 점수등급을 리턴.
    //단, 전달받은 이름을 가진 학생이 없다면 점수 등급은 "등급없음"이 된다.
    //점수등급
    // 90 <= 평균점수 <= 100 : "A"등급
    // 80 <= 평균점수 <= 89 : "B"등급
    // 70 <= 평균점수 <= 79 : "C"등급
    // 70 > 평균점수  : "D"등급
    public String getGradeByStudentName(Student_613[] students, String name) {
        String grade = "등급없음";
        for(Student_613 stu : students){
            if(stu.getName().equals(name)){
                double avg = (stu.getKorScore() + stu.getMathScore() + stu.getEngScore())/3.0;
                grade = getGradeByAvg(avg);
            }
        }
        return grade;
    }

    //점수에 따라 등급 결정
    private String getGradeByAvg(double avg){
        String grade = "등급없음";
        if(avg >= 90 && avg <= 100){
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }
        return grade;
    }

    @Override
    //매개변수로 받은 다수의 학생들의 총점을 배열로 리턴
    public int[] getTotalScoresToArray(Student_613[] students) {
        //학생들이 총점이 저장될 배열 생성
        int[] totalScores = new int[students.length];

        for(int i = 0; i < students.length; i++){
            totalScores[i] = students[i].getKorScore() + students[i].getMathScore() + students[i].getEngScore();
        }

        return totalScores;
    }

    @Override
    //매개변수로 두 명의 학생이 전달된다.
    //전달된 두 학생 중 총점이 높은 학생 객체를 리턴.
    //단, 전달된 두 학생의 총점이 같은 경우는 없다고 가정.
    public Student_613 getHighScoreStudent(Student_613 stu1, Student_613 stu2) {
        int sum1 = stu1.getKorScore() + stu1.getMathScore() + stu1.getEngScore();
        int sum2 = stu2.getKorScore() + stu2.getMathScore() + stu2.getEngScore();

        return sum1 > sum2 ? stu1 : stu2;
    }
}
