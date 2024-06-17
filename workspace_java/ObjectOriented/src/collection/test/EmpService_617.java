package collection.test;
//두번째 유인물(2)
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService_617 {
    private List<Emp_617> empList; //list로 맴버변수 선언, 초기화는 따로
    private Scanner sc;

    //생성자에서 초기화
    public EmpService_617(){
        sc = new Scanner(System.in);
        empList = new ArrayList<>();

        Emp_617 e1 = new Emp_617(1001, "kim", "개발부", "1111-1111", 200);
        Emp_617 e2 = new Emp_617(1002, "lee", "개발부", "2222-2222", 300);
        Emp_617 e3 = new Emp_617(1003, "park", "영업부", "3333-3333", 350);
        Emp_617 e4 = new Emp_617(1004, "choi", "영업부", "4444-4444", 100);
        Emp_617 e5 = new Emp_617(1005, "jeong", "인사부", "5555-5555", 150);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
    }

    //1번문제
    public void login(){
        boolean isRunning = true;
        boolean isFind = false; //id,pw 불일치를 기본값
        while(isRunning){
            System.out.println("사번 : ");
            int empNo = sc.nextInt();
            System.out.println("비밀번호(연락처 마지막 4자리) : ");
            String pw = sc.next();

            //입력한 사번과 비밀번호 일치 여부 확인
            for(Emp_617 e : empList){
                if(e.getEmpNo() == empNo && e.getPw().equals(pw)){
                    isRunning = false; //while문 벗어남
                    System.out.println("로그인 하였습니다.");
                    System.out.println(e.getName() + "님 반갑습니다.");
                    isFind = true; //id,pw 일치
                }
            }
            if(!isFind){ // '!' : 부정연산자
            System.out.println("사번 혹은 비번이 일치하지 않습니다.");}

        }

    }

    //2번문제
    public void printDeptMoney(){
        System.out.print("부서명 : ");
        String dept = sc.next();

        int sum = 0;
        int cnt = 0;
        System.out.println("==" + dept + " 월급 현황==");
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i).getDept().equals(dept)){
                System.out.println(empList.get(i)); //toString 안 붙여도 자동으로 toString 호출됨
                sum += empList.get(i).getMoney();
                cnt++;
            }
        }
        System.out.println(dept + "서의 월급 총액은 " + sum + "원이며, 평균급여는" + (sum/(double)cnt) + "원 입니다.");

    }

    //3번문제
    public void increaseMoney(){
        System.out.println("부서명 : ");
        String dept = sc.next();
        System.out.println("인상급여 : ");
        int money = sc.nextInt();

        System.out.println(dept + "각 사원의 급여가 각각 " + money + "원씩 인상됩니다.");

        //급여 인상 코드
        for(Emp_617 e : empList){
            if(e.getDept().equals(dept)){
                int result = e.getMoney() + money; //사원의 원래 월급 + 인상금액;
                e.setMoney(result);
            }
        }
        //인상된 사원 정보 출력
        for(Emp_617 e : empList){
            if(e.getDept().equals(dept)){
            System.out.println(e);}
        }

    }
}
