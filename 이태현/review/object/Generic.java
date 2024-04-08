package review.object;
class Box<T> {
    private T data;
    public void set(T data) {
        this.data = data;
    }
    public T get() {
        return data;
    }
}
public class Generic {
    public static void main(String[] args) {
        Box<String> b = new Box<String>();
        Box<Integer> b2 = new Box<Integer>();

        b.set("Hello World! ");
        b2.set(10);

        System.out.println(b.get());
        System.out.println(b2.get());
    }
}
