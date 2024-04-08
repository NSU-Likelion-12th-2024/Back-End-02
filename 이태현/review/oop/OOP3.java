package review.oop;
class Overloading{
    void cat(){
        System.out.println("나는 냐옹이다옹.");
    }
    void cat(String bark){
        System.out.println("고양이는 " + bark + "라고 짖는다옹.");
    }
    void cat(int num){
        System.out.println("고양이는 " + num + "마리 있다옹.");
    }
}
public class OOP3 {
    public static void main(String[] args) {
        Overloading Cat = new Overloading();
        Cat.cat();
        Cat.cat("냐옹");
        Cat.cat(3);
    }
}
