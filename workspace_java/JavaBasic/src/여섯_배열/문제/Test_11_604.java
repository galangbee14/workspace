package 여섯_배열.문제;

//1, 2, 3, 4, 5, 6 ,7 ,8 로 초기화된 배열을 만들고,
// 배열의 요소 중 짝수의 개수를 구하는 프로그램을 만들어라.

public class Test_11_604 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};

        int count = 0;

//        for(int i = 0; i < arr1.length; i++) {
//            if (arr1[i] % 2 == 0) {
//                count += 1;
//            }
//        }
//        System.out.println(count);

        for (int e : arr1) {
            if (e % 2 == 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
