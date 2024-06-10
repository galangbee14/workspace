package class_basic.member13;

public class MemberService {
    private String id;
    private String password;

    public MemberService(String id, String password){
        this.id = id;
        this.password = password;
    }

    public boolean login(){
        if (id.equals("hong") && password.equals("12345")){
            return true;
        } else {
            return false;
        }
    }



}
