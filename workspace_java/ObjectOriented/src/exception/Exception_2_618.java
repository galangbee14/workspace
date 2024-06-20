package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_2_618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("첫번째 : ");
            int a = sc.nextInt();
            System.out.print("두번째 : ");
            int b = sc.nextInt();

            System.out.println(a / b);
        } catch (ArithmeticException exception) {
            System.out.println("수학적 오류 발생-!");
            //(ArithmeticException는 /0 오류 담아서 전달, catch는 예외처리를 전담해 전달받음)(catch는 여러개 예외 받을 수 있음)
        } catch (InputMismatchException e) {
            System.out.println("입력 자료형 불일치-!");
            //(InputMismatchException)
//        }catch (Exception ex){
            //(Exception는 모든 예외처리 클래스의 부모클래스)
        }
        System.out.println("오류 발행-!");
    }
}
