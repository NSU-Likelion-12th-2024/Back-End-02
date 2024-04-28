package homework.iceCream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileManager {
    public void cashbills(IceCream[] menuList, int total, int money) {
        try {
            FileOutputStream fos = new FileOutputStream("bills.txt");
            PrintStream ps = new PrintStream(fos);
            ps.println("☆★☆★☆★주문 영수증☆★☆★☆★");
            ps.println("주문 리스트");
            for (int i = 0; i < 4; i++) {
                if (menuList[i].num > 0) {
                    ps.println(menuList[i].menuName + menuList[i].num + "개\t" + menuList[i].price + "원");
                }
            }
            ps.println("☆★☆★☆★☆★☆★☆★");
            ps.println("총 금액 : " + total + "원");
            ps.println("지불하신 금액 : " + money + "원");
            ps.println("잔돈 : " + (money - total) + "원");
            ps.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
