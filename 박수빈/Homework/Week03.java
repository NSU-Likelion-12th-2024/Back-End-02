package Homework;
/*
public class Week03 {

        public static void main(String[] args) {
            String name = "박교수";
            String id = "990130-1234567";
            String phone = "010-1234-5678";

            System.out.println("이름 : " + getHiddenData(name, 1));
            System.out.println("주민등록번호 : " + getHiddenData(id, 8));
            System.out.println("전화번호 : " + getHiddenData(phone, phone.length() - 4));
        }

        public static String getHiddenData(String data, int visibleCount) {
            String visiblePart = data.substring(0, visibleCount);
            String hiddenPart = "*".repeat(data.length() - visibleCount);
            return visiblePart + hiddenPart;
        }



}
*/



/*
class Hamburger {
    protected String name;

    public Hamburger() {
        this.name = "햄버거";
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}

class CheeseBurger extends Hamburger {

    public CheeseBurger() {
        this.name = "치즈버거";
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}

class ShrimpBurger extends Hamburger {

    public ShrimpBurger() {
        this.name = "새우버거";
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}
 */



//2조 조별 과제
/*
class Tv{ // Tv라는 이름의 클래스를 정의
    String color;	// color라는 이름의 문자열 변수를 선언한다. 이 변수는 TV의 색상을 저장한다.
    boolean power; // power라는 이름의 불리언 변수를 선언한다. 이 변수는 TV의 전원 상태를 저장한다.
    int channel; // channel이라는 이름의 정수 변수를 선언한다. 이 변수는 현재 TV 채널을 저장한다.

    void Power(){power = !power;} // Power라는 메소드를 정의한다. 이 메소드는 TV의 전원 상태를 말한다.
    void channeUp() {channel++;} // channelUp이라는 메소드를 정의한다. 이 메소드는 채널을 한 채널 올린다.
    void ChannelDown() {channel--;} // ChannelDown이라는 메소드를 정의한다. 이 메소드는 채널을 한 채널 내린다.
}

public class Main { // Main이라는 이름의 공개 클래스를 정의한다. 이 클래스에서 프로그램의 실행이 시작된다.
    public static void main(String[] args) { // main 메소드를 정의한다.
        Tv LgTv = new Tv(); // Tv 클래스의 인스턴스를 생성하고 LgTv라는 이름의 변수에 할당한다.
        Tv SamsungTv = new Tv(); // Tv 클래스의 또 다른 인스턴스를 생성하고 SamsungTv라는 이름의 변수에 할당한다.
        Tv AppleTv = new Tv(); // Tv 클래스의 또 다른 인스턴스를 생성하고 AppleTv라는 이름의 변수에 할당한다.

        SamsungTv.Power(); // SamsungTv 인스턴스의 Power 메소드를 호출하여 전원 상태를 말한다.
    }
}



class Overloading{ // Overloading이라는 이름의 클래스를 정의.
    void cat(){System.out.println("나는 냐옹이다옹");} // cat이라는 메소드를 정의. 매개변수가 없을 때 "나는 냐옹이다옹"을 출력합니다.
    void cat(String bark){System.out.println("고양이는"+bark+"라고 찾는다옹");} // cat이라는 이름의 메소드를 오버로딩한다. 문자열 매개변수가 있을 때 "고양이는 [매개변수]라고 찾는다옹"을 출력한다.
    void cat(int num){System.out.println("고양이는"+num+"마리 있다옹");} // cat이라는 이름의 메소드를 다시 오버로딩한다. 정수 매개변수가 있을 때 "고양이는 [매개변수]마리 있다옹"을 출력한다.
}

public class Main { // Main이라는 이름의 공개 클래스를 정의.
    public static void main(String[] args) { // main 메소드를 정의.
        Overloading Cat = new Overloading(); // Overloading 클래스의 인스턴스를 생성하고 Cat이라는 이름의 변수에 할당한다.
        Cat.cat(); // Cat 인스턴스의 cat 메소드를 호출. 매개변수가 없으므로 "나는 냐옹이다옹"을 출력한다.
        Cat.cat("냐옹"); // Cat 인스턴스의 cat 메소드를 문자열 매개변수 "냐옹"과 함께 호출. "고양이는냐옹라고 찾는다옹"을 출력한다.
        Cat.cat(3); // Cat 인스턴스의 cat 메소드를 정수 매개변수 3과 함께 호출. "고양이는3마리 있다옹"을 출력한다.
    }
}



class Phone{ // Phone이라는 이름의 클래스를 정의.
    void message(){System.out.println("일반 메시지 입니다.");} // message라는 메소드를 정의.
}
class SmartPhone extends Phone{ // SmartPhone이라는 이름의 클래스를 정의하고 Phone 클래스를 상속받는다.
    void message(){System.out.println("오버라이딩 된 메시지 입니다");} // Phone 클래스의 message 메소드를 오버라이드. 이 메소드는 "오버라이딩 된 메시지 입니다"를 출력한다.
}

public class Main { // Main이라는 이름의 공개 클래스를 정의.
    public static void main(String[] args) { // main 메소드를 정의.
        Phone phone = new Phone(); // Phone 클래스의 인스턴스를 생성하고 phone이라는 이름의 변수에 할당합니다.
        SmartPhone smartPhone = new SmartPhone(); // SmartPhone 클래스의 인스턴스를 생성하고 smartPhone이라는 이름의 변수에 할당한다.
        phone.message(); // phone 인스턴스의 message 메소드를 호출. "일반 메시지 입니다."를 출력한다.
        smartPhone.message(); // smartPhone 인스턴스의 message 메소드를 호출. SmartPhone 클래스에서 message 메소드가 오버라이드되었으므로 "오버라이딩 된 메시지 입니다"를 출력한다.
    }
}



interface Animal{ // Animal이라는 이름의 인터페이스를 정의.
    public static final String name = "동물"; // name이라는 상수를 선언하고 "동물"로 초기화.
    public abstract void move(); // move라는 추상 메소드를 선언.
    public abstract void bark(); // bark라는 추상 메소드를 선언.
}
class Dog implements Animal{ // Dog라는 이름의 클래스를 정의하고 Animal 인터페이스를 구현한다.
    public void move(){ // Animal 인터페이스의 move 메소드를 구현한다.
        System.out.println("타다다닥"); // 개가 움직일 때 나는 소리를 출력한다.
    }
    public void bark(){ // Animal 인터페이스의 bark 메소드를 구현.
        System.out.println("왈왈"); // 개가 짖을 때 나는 소리를 출력한다.
    }
}

class Horse implements Animal{ // Horse라는 이름의 클래스를 정의하고 Animal 인터페이스를 구현한다.
    public void move(){ // Animal 인터페이스의 move 메소드를 구현.
        System.out.println("다그닥다그닥"); // 말이 움직일 때 나는 소리를 출력한다.
    }
    public void bark(){ // Animal 인터페이스의 bark 메소드를 구현.
        System.out.println("히이이잉"); // 말이 울 때 나는 소리를 출력한다.
    }
}
public class Main { // Main이라는 이름의 공개 클래스를 정의.
    public static void main(String[] args) { // main 메소드를 정의.
        Dog dog = new Dog(); // Dog 클래스의 인스턴스를 생성하고 dog라는 이름의 변수에 할당한다.
        Horse horse = new Horse(); // Horse 클래스의 인스턴스를 생성하고 horse라는 이름의 변수에 할당한다.
        dog.move(); // dog 인스턴스의 move 메소드를 호출. "타다다닥"을 출력한다.
        dog.bark(); // dog 인스턴스의 bark 메소드를 호출. "왈왈"을 출력한다.
        horse.move(); // horse 인스턴스의 move 메소드를 호출. "다그닥다그닥"을 출력한다.
        horse.bark(); // horse 인스턴스의 bark 메소드를 호출. "히이이잉"을 출력한다.
    }
}

 */
