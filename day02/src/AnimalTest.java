class Dog implements Animal {
    public void move(){
        System.out.println("어흥");
    }
    public void bark(){
        System.out.println("멍멍");
    }
}
class Horse implements Animal {
    public void move(){
        System.out.println("후에에에엥ㅇ");
    }
    public void bark() {
        System.out.println("멍멍");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Horse horse = new Horse();
        dog.move();
        dog.bark();
        horse.move();
        horse.bark();

    }
}
