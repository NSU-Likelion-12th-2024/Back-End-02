

public class EX_1 {

    static  int mod(int a , int b){
        int result = a%b;
        return result;
    }
    static void prinNUm(int a) {
        System.out.println(a);

    }
    static String greeting(){
        return "h2";
    }
    static  void greeting_2(){
        System.out.println("g2");
    }

    public static void main(String[] args) {
int a = 3 ;
int b = 2 ;
int mod_result = mod(3,2);

        System.out.println(mod_result);

        prinNUm(10);

        String str = greeting();
        System.out.println(str);

        greeting_2();
    }

}
