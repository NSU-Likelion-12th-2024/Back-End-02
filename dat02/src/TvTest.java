class Tv{
    String color;
    boolean power;
    int channel;

    //클래스 생성자
    Tv() {}
        Tv(String color, boolean power, int channel){

            this.color = color;
            this.power = power;
            this.channel = channel;
        }


    void Power(){
        power = !power;
    }
    void channelup() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
}
public class TvTest {
    public static void main(String[] args) {

        Tv LgTv = new Tv();
        Tv SamsungTv = new Tv();
        Tv AppleTv = new Tv();

        SamsungTv.Power();

    }
}
