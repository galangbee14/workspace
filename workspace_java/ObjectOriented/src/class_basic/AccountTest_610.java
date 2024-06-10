package class_basic;

public class AccountTest_610 {
    public static void main(String[] args) {
        Account_610_n acc = new Account_610_n();
        //객체 생성시 생성자 실행됨
        //생성자는 임의로 2번 호출할 수 없음

        acc.printAccount();

        Account_610_n acc1 = new Account_610_n(100000);
        acc1.printAccount();

        //객체 초기화 (객체 생성 시 최초 1회 실행)
//        acc.initAccount();
//
//        acc.printAccount();
    }
}
