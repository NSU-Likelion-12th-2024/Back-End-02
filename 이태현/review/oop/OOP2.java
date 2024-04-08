package review.oop;
class Tv{
    String color;
    boolean power;
    int channel;

    Tv(){}
    Tv(String color, boolean power, int channel) {
        this.color = color;
        this.power = power;
        this.channel = channel;
    }
    void Power(){power = !power;}
    void ChannelUp(){channel++;}
    void ChannelDown(){channel--;}
}
public class OOP2 {
    public static void main(String[] args) {
        Tv LgTv = new Tv();
        Tv SamsungTv = new Tv();
        Tv AppleTv = new Tv();

        SamsungTv.Power();
    }
}
