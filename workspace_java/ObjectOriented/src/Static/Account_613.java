package Static;

//예금 이율 : 7%
public class Account_613 {
    String accNum; //계좌번호
    int money; //예금액
    static double iyul; //이율

    static {
        iyul = 7.0;
    }

    public Account_613(String accNum, int money){
        this.accNum = accNum;
        this.money = money;
//        iyul = 7.0; (매번 실행되지 않게 하기 위해서 static은 따로 정의해줌)
    }

    //generate toString으로 생성
    @Override
    public String toString() {
        return "Account_613{" +
                "accNum='" + accNum + '\'' +
                ", money=" + money +
                ", iyul=" + iyul +
                '}';
    }
}
