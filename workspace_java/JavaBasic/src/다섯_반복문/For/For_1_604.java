package 다섯_반복문.For;

public class For_1_604 {
    public static void main(String[] args) {
//        int i = 1;
//
//        while (i < 11){
//            System.out.println(i);
//            i++;
//        }

        //for문으로

//        for(int i = 1; i < 11; i++){
//            System.out.println(i);
//        }

        //1~10까지 합

        int sum = 0;
        for(int i = 1; i < 11; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
