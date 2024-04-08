package Quiz;

// HamBurger 클래스 정의 만들어!!
class HamBurger {
    // 멤버 변수 name 선언
    String name;

    // HamBurger 생성자 생성하기 하는 뜻
    HamBurger(String name) {
        // 인스턴스의 name 멤버 변수에 전달받은 name 값 할당
        this.name = name;
    }

    // cook 메서드 만들어야지 조리시작 전 메소드
    public void cook() {
        // 햄버거 조리 시작 메시지 출력
        System.out.println(name + " 조리 시작 합니다.");
        // Cookingredient 메서드 호출
        Cookingredient();
    }

    // Cookingredient 메서드 만들어야지 재료 메소드
    public void Cookingredient() {
        // 햄버거의 재료 출력
        System.out.println("햄버거의 재료는:\n" +
                "> 양상추\n" +
                "+ 패티\n" +
                "+ 피클");
    }
}

// CheeseBurger 클래스 정의 (HamBurger 클래스 상속) 치즈 버거 클래스 만들고 햄버거 공통된걸 상속 받아
class CheeseBurger extends HamBurger {
    // CheeseBurger 생성자 정의
    CheeseBurger() {
        // 부모 클래스의 생성자 호출하여 "치즈버거" 이름 전달
        super("치즈버거");
    }

    // Cookingredient 메서드 오버라이드
    @Override
    public void Cookingredient() {
        // 부모 클래스의 Cookingredient 메서드 호출
        super.Cookingredient();
        // 치즈 추가 메시지 출력
        System.out.println("+ 치즈\n" +
                "치즈버거는 치즈가 드러간다능.");
    }
}


/*
    오버라이딩은 상속 관계에서 부모 클래스의 메서드를 자식 클래스에서 재정의하여 사용하는 것. 이를 사용하는 이유를 4가지로 이해 시켜드릴게요!

        1. 다형성 구현: 오버라이딩을 통해 같은 메서드 이름을 사용하여 다양한 동작을 구현할 수 있어요. 이는 같은 부모 클래스 타입으로 여러 가지 서브 클래스 인스턴스를 다룰 때 편리하죠

        2. 기능 확장: 자식 클래스에서 부모 클래스의 메서드를 오버라이딩하여 추가적인 기능을 구현할 수 있어요 이는 우리기 지금 사용하는 햄버거 클래스 부분에서 사용하는것이라고 생각하시면 되죠!
          이를 통해 프로그램의 유연성을 높일 수 있습니다.

        3. 캡슐화 유지: 부모 클래스(햄버거)의 메서드 시그니처는 보존하면서, 자식 클래스(새우거버거,치즈버거) 에서 메서드 내용을 변경할 수 있어요. 이는 캡슐화를 유지하면서도 클래스의 특정 기능을 변경할 수 있도록 하죠

        4. 다양한 환경 대응: 서브 클래스에서 특정 메서드를 오버라이딩하여, 다른 환경이나 요구에 따라 해당 메서드의 동작을 수정할 수 있어요. 이는 프로그램의 유연성을 높이고, 다양한 요구 사항에 대응할 수 있도록 하죠!

        이러한 이유로 오버라이딩은 상속을 통해 클래스 간의 유연하고 다양한 기능을 구현하는 데 중요한 역할을 하고있습니다.
*/






// ShrimpBurger 클래스 정의 (HamBurger 클래스 상속) 새우버거 클래스 만들고 햄버거(클래스) 공통된 재료를 상속받는다.
class ShrimpBurger extends HamBurger {
    // ShrimpBurger 생성자 정의
    ShrimpBurger() {
        // 부모 클래스의 생성자 호출하여 "새우버거" 이름 전달
        super("새우버거");
    }

    // Cookingredient 메서드 오버라이드
    @Override
    public void Cookingredient() {
        // 부모 클래스의 Cookingredient 메서드 호출
        super.Cookingredient();
        // 새우 추가 메시지 출력
        System.out.println("+ 새우\n" +
                "새우버거는 새우가 드러간다능.");
    }
}

// 메인 클래스 Q_2 정의
public class Q_2 {
    // main 메서드 정의
    public static void main(String[] args) {
        // HamBurger 배열 hamBurgers 선언 및 할당 (길이 3)
        HamBurger[] hamBurgers = new HamBurger[3];
        // 배열 요소 할당
        hamBurgers[0] = new HamBurger("햄버거");
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        // 주문 시작 메시지 출력
        System.out.println("주문해라");
        // 구분선 출력
        System.out.println("-------------------");
        // 햄버거 요리 반복문
        for (HamBurger hamBurger : hamBurgers) {
            // 각 햄버거 요리 메서드 호출
            hamBurger.cook();
            // 구분선 출력
            System.out.println("-------------------");
        }
        // 메뉴 나왔다 메시지 출력
        System.out.println("메뉴 나왔다. 가져가라 ~ ");
    }
}
