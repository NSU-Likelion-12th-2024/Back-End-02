class Phone {
    String color;
    String model;

    Phone() {
    }

    void ring() {
    }

    ;

    void message() {
    }

    ;
}
class SmartPhone extends Phone {
        boolean wifi;

        void internet() {};

    }

    public class PhoneTest {
        public static void main(String[] args) {
            SmartPhone Iphone14 = new SmartPhone();
            Iphone14.internet();
            Iphone14.ring();
        }
    }
