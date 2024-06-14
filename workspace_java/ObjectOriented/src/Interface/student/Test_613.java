package Interface.student;

import java.util.Arrays;

public class Test_613 {
    public static void main(String[] args) {
        MyStudent_614 s = new MyStudent_614();

        Student_613[] students = new Student_613[5];
        Student_613 s1 = new Student_613("kim", 80, 70, 90);
        Student_613 s2 = new Student_613("lee", 30, 70, 90);
        Student_613 s3 = new Student_613("park", 10, 30, 90);
        Student_613 s4 = new Student_613("kang", 70, 70, 40);
        Student_613 s5 = new Student_613("ko", 90, 50, 90);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        String result1 = s.getGradeByStudentName(students, "kang");
        System.out.println(result1);

        System.out.println();

        int[] result2 = s.getTotalScoresToArray(students);
        System.out.println(Arrays.toString(result2));

        System.out.println();

        Student_613 stu = s.getHighScoreStudent(s1, s2);
        System.out.println(stu.getName());
    }
}
