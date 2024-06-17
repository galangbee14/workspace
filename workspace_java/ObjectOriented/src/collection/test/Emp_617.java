package collection.test;
//두번째 유인물(1)
public class Emp_617 {
    private int empNo;
    private String name;
    private String dept;
    private String tel;
    private int money;

    public Emp_617(int empNo, String name, String dept, String tel, int money) {
        this.empNo = empNo;
        this.name = name;
        this.dept = dept;
        this.tel = tel;
        this.money = money;
    }

    public int getEmpNo(){
        return empNo;
    }

    //사원의 연락처 마지막 4자리값 리턴
    public String getPw(){
        //substring
//        String num = "010-1111-2222";
//        num.substring(1,4); //"10-"
//        num.substring((7)); // "1-2222"
        return tel.substring(5);
    }

    public String getName(){
        return name;
    }

    public String getDept(){
        return dept;
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int money){
        this.money = money;
    }

    @Override
    public String toString() {
        return "Emp_617{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

}
