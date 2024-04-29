package Homework;

import javax.xml.namespace.QName;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IceCreamMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IceCreamMain cm = new IceCreamMain();
        int ch;
        int total = 0;
        cm.menuInit();
        while(true) {
            System.out.println("☆★☆★ 무인 아이스크림 판매점 ☆★☆★");
            System.out.print("현재까지 주문한 메뉴: ");
            for(int i = 0; i < 4; i++){
                if(cm.menuList[i].num>0){
                    System.out.print(cm.menuList[i].menuName+"("+cm.menuList[i].num+") ");
                }
            }
            System.out.println("\n현재까지 주문한 금액:"+total+"원");
            System.out.println("1.주문하기");
            System.out.println("2.취소하기");
            System.out.println("3.결제하기");
            System.out.println("4.끝내기");
            System.out.print("입력:");
            ch = sc.nextInt();
            if(ch == 1) {
                total = cm.order(total);
            }
            else if (ch == 2) {
                total = cm.cancel(total);
            }
            else if (ch == 3) {
                total = cm.pay(total);
                String str = cm.readbills();
                System.out.println(str);
            }
            else if(ch == 4) {
                break;
            }
            else {
                System.out.println("잘못입력하셨습니다");
            }
        }
    }
}

public void cashbills(IceCream[] menuList, int total, int money) {
    try {
        FileOutputStream fos = new FileOutputStream(name:"bills.twt");
        PrintStream ps = new PrintStream(fos);
        ps.println("★☆★☆★☆주문 영수증★☆★☆★☆");
        ps.println("주문 리스트");
        for (int i = 0; i < 4; i++) {
            if (menuList[i].num > 0) {
                ps.println(menuList[i].menuName + menuList[i].num + "개\t" + menuList[i].price + "원");
            }
        }
        ps.println("★☆★☆★☆★☆★☆★☆★☆");
        ps.println("총 금액:" + total + "원");
        ps.println("지불하신 금액:" + money + "원");
        ps.println("잔돈:" + (money - total) + "원");
        ps.close();
        fos.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

}
