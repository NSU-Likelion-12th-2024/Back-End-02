package review.oop;
class Phone{
    void message() {
        System.out.println("일반 메시지 입니다.");
    }
}
class SmartPhone extends Phone {
    void message() {
        System.out.println("오버라이딩 된 메시지 입니다.");
    }
}
public class OOP4 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        SmartPhone smartPhone = new SmartPhone();
        phone.message();
        smartPhone.message();
    }
}
