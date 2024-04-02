class Phone2 {
    void massage() {
        System.out.println("운영진 메세지 입니다.");}
    }
    class SmartPhone2 extends Phone2{
    void massage(){
        System.out.println("멋쟁이사자처럼 아기 사자 입니다.");}
}
public class Phone2Test {
    public static void main(String[] args) {

        Phone2 phone2 = new Phone2();
        SmartPhone2 smartPhone2 = new SmartPhone2();

        phone2.massage();
        smartPhone2.massage();
    }
}
