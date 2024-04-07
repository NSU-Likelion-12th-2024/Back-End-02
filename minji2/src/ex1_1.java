//public class ex1_1 {
//    static int mod(int a, int b) {
//        int result = a % b;
//        return result;
//    }
//
//    static void printNum(int a) {
//        System.out.println(a);
//    }
//
//    static String greeting() {
//        return "Hello";
//    }
//
//    static void greeting_2() {
//        System.out.println("Hello!");
//    }
//
//    public static void main(String[] args) {
//        int a = 3;
//        int b = 2;
//        int mod_result = mod(3, 2);
//
//        System.out.println(mod_result);
//
//        printNum(10);
//
//        String str = greeting();
//        System.out.println(str);
//
//        greeting_2();
//        }
// }

//class Tv{
//    String color;
//    boolean power;
//    int channel;
//
//    Tv(){} // 기본생성자
//    Tv(String color,boolean power, int channel){ //생성자를 만들어서 윗줄 생성자가 없어짐
//        this.color = color; // this.color는 매칭시켜줌
//        this.power = power;
//        this.channel = channel;
//    }
//
//    void Power(){power = !power;}
//    void ChannelUp(){channel++;}
//    void ChannelDown(){channel--;}
//}
//
//public class ex1_1 {
//    public static void main(String[] args){
//        Tv LgTv = new Tv();
//        Tv SamsungTv = new Tv();
//        Tv AppleTv = new Tv();
//
//        SamsungTv.Power();
//    }
//}

import java.sql.SQLOutput;

//class Overleading{
//    void cat(){System.out.println("나는 냐옹이다옹");}
//    void cat(String bark){System.out.println("고양이는"+bark+"라고 짖는다옹");}
//    void cat(int num){System.out.println("고양이는"+num+"마리 있다옹");}
//   }
//public class ex1_1{
//    public static void main(String[] args) {
//        Overleading Cat = new Overleading();
//        Cat.cat();
//        Cat.cat("냐옹");
//        Cat.cat(3);
//
//    }
//}

interface Animal{
    public static final String name = "동물";
    public abstract void move();
    public abstract void bark();
}
class Dog implements Animal{
    public void move(){
        System.out.println("타다다닥");
    }
    public void bark(){
        System.out.println("왈왈");
    }
}
class Horse implements Animal{
    public void move(){
        System.out.println("다그닥다그닥");
    }
    public void bark(){
        System.out.println("히이이잉");
    }
}