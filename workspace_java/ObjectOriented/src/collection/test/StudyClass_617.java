package collection.test;

import java.util.ArrayList;
import java.util.List;

public class StudyClass_617 {
    private List<Student_617> stuList1;
    private String className;
    private String teacher;

    public List<Student_617> getStuList(){
        return stuList1;
    }

    public StudyClass_617(String className, String teacher, List<Student_617> stuList1){
        this.className = className;
        this.teacher = teacher;
        this.stuList1 = stuList1;
//        stuList1 = new ArrayList<>();
    }

    //1) 해당 반의 모든 학생의 모든 정보를 출력하는 기능
    public void printStuAll (){
        for(Student_617 stu : stuList1) {
            System.out.println(stu);
        }
    }

    //2) 해당 반의 평균 성적을 리턴하는 기능
    public double stuScore (){
        int sum = 0;
        for(int i = 0 ; i < stuList1.size(); i++){
        sum = stuList1.get(i).getScore();}
        double avg = (double)sum / stuList1.size();
        return avg;
    }

    //3) 해당 반에서 최고 성적을 지닌 학생을 리턴하는 기능
    public Student_617 stuMaxScore (){

        int max = 0;
        int index = 0;
        for(int i = 0; i < stuList1.size(); i++) {
            if (max < stuList1.get(i).getScore()) {
                max = stuList1.get(i).getScore();
                index = i;
            }
        }
        return stuList1.get(index);
    }


}
