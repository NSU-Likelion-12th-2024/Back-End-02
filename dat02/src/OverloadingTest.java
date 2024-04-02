class Overloading{
    void cat(){
        System.out.println("운영진이다.");}
    void cat(String bark){
        System.out.println("사자는"+bark+"이라고 짖는다.");}
    void cat(int num){
        System.out.println("어미사자는 "+num+"마리가 있다.");
    }

}

public class OverloadingTest {
    public static void main(String[] args) {
        Overloading Cat = new Overloading();
        Cat.cat();
        Cat.cat("어흥");
        Cat.cat(8);
    }
}
