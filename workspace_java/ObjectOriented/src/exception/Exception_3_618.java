package exception;

//예외전가
public class Exception_3_618 {
    public static void main(String[] args) {
        try {
            bbb();
        }catch (Exception e){

        }

    }

    public static void aaa() throws Exception { //예외전가
        System.out.println(5 / 0);
    }

    public static void bbb() throws Exception {
        aaa();
    }
}
