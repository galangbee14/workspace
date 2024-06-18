package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_2_618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("첫번째 : ");
            int a = sc.nextInt();
            System.out.println("두번째 : ");
            int b = sc.nextInt();

            System.out.println(a/b);
        }catch(ArithmeticException exception){   //나누기 0
            System.out.println("수학적 오류 발생");
        }catch(InputMismatchException exception){   //다른 자료형
            System.out.println("입력 자료형 불일치!!");
            //Exception 두가지 정보 모두 catch
        }

        //try catch 문을 코딩할 경우는 거의 없지만
        //어떻게 실행되는지는 알고 있어야 됨
    }
}
