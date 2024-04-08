package review.oop;

class Dog implements Animal_Interface{
    @Override
    public void move() {
        System.out.println("타다다닥");
    }
    @Override
    public void bark() {
        System.out.println("왈왈");
    }
}
class Horse implements Animal_Interface{
    @Override
    public void move() {
        System.out.println("다그닥다그닥");
    }

    @Override
    public void bark() {
        System.out.println("히이이잉");
    }
}
public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Horse horse = new Horse();
        dog.move();
        dog.bark();
        horse.move();
        horse.bark();
    }
}
