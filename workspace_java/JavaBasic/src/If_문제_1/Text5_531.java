package If_문제_1;

public class Text5_531 {
    public static void main(String[] args) {
        int num1 = 99;
        String grade;

        if(90 < num1 && num1 <= 100){
           grade = "A";
        }
        else if(num1 > 80){
            grade = "B";
        }
        else{
            grade = "C";
        }
        System.out.println("학점은 " + grade);
    }
}
