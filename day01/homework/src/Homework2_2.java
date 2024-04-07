class HamBurger { // HamBurger 클래스 정의
    protected String name; // name이라는 멤버변수 선언

    public HamBurger(String name) { // HamBurger 클래스의 생성자 정의
        this.name = name; // 생성자의 매개변수 name의 값을 객체의 멤버 변수 name에 저장
    }

    public void cook() {
        System.out.println("--------------");
        System.out.println(name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println(">양상추");
        System.out.println("+패티");
        System.out.println("+피클");
    }
}
class HamBurger1 extends HamBurger{//햄버거1이 햄버거를 상속받음
    public HamBurger1(){
        super("햄버거");
    }
}
class Cheeseburger extends HamBurger { //치즈버거가 햄버거를 상속받음
    public Cheeseburger() { // Cheeseburger 클래스의 기본 생성자 정의
        super("치즈버거");//부모 클래스인 햄버거 클래스 생성자 호출, "치즈버거"라는 이름 전달
    }

    @Override
    public void cook() {//햄버거에서 상속받은 cook을 오버라이드,cook호출(실행) + 치즈를 출력
        super.cook();
        System.out.println("+치즈");
    }
}
    class ShrimpBurger extends HamBurger {
        public ShrimpBurger() {
            super("새우버거");
        }


        @Override
        public void cook() {
            super.cook();
            System.out.println("+새우");
        }
    }

    public class Homework2_2 {
        public static void main(String[] args) {
            HamBurger[] hamBugers = new HamBurger[3];
            hamBugers[0] = new HamBurger1();
            hamBugers[1] = new Cheeseburger();
            hamBugers[2] = new ShrimpBurger();

            System.out.println("주문하신 메뉴를 만듭니다.");
            System.out.println("---------------");
            for (HamBurger hamBurger : hamBugers) {
                hamBurger.cook();
                System.out.println("--------------");
            }
            System.out.println("메뉴 준비가 완료되었습니다.");
        }
    }
