import java.util.Scanner;

class SignUp{
    public String name;
    protected  String id;
    private  int password;
    String Nickname;
    public void setPassword(int password) {

        this.password = password;
    }
}
public class accessTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SignUp signUp = new SignUp();

        System.out.println("패드워드 입력:");
        int password = sc.nextInt();
        signUp.setPassword(password);
    }
}
