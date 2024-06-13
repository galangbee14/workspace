package object;

import class_basic.Monitor_607_n;

//클래스가 상속을 받고 있지 않다면 자동으로 Object 클래스를 상속 받음.
//모든 클래스는 Object 클래스를 상속 받는다.
public class Tv_613 extends Object{
    String modelName;

    public void powerOn(){
        System.out.println("전원을 켭니다~");
        aaa(5);
        Monitor_607_n mm = new Monitor_607_n();
        bbb(mm);
        //Object 클래스는 모든 객체를 다 저장할 수 있다.
        ccc(mm);
    }

    public void ccc(Object obj){

    }

    public void bbb(Monitor_607_n m){

    }

    public void aaa(int a){

    }
}

class LgTv extends Tv_613{

}