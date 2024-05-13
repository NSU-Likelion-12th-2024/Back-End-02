package Homework;

import java.io.*;
import java.util.Scanner;

public class IceCreamManager {
    IceCream menuList[] = new IceCream[4];
    FileManager fileManager = new FileManager();
    public void menuInit() {
        for(int i=0; i<4; i++) {
            menuList[i] = new IceCream();
        }
        menuList[0].menuName="누가바";
        menuList[0].price=600;
        menuList[0].num=0;
        menuList[1].menuName="죠스바";
        menuList[1].price=600;
        menuList[1].num=0;
        menuList[2].menuName="메로나";
        menuList[2].price=1200;
        menuList[2].num=0;
        menuList[3].menuName="스크류바";
        menuList[3].price=1000;
        menuList[3].num=0;
    }
    public int order(int num) {
        Scanner sc = new Scanner(System.in);
        int ch;
        int total = 0;
        System.out.println("----------Menu Pan----------");
        for(int i=0; i<4; i++) {
            System.out.println((i+1) + " " + menuList[i].menuName + "       " + menuList[i].price);
        }
        System.out.println("-----------------------------");
        System.out.print("입력: ");
        ch=sc.nextInt();
        int index = ch - 1;
        System.out.println(menuList[index].menuName + "주문!");
        System.out.println("가격은 " + menuList[index].price + "원 입니다!");

        menuList[index].num++;


        for(int i=0; i<4; i++) {
            total += menuList[i].num * menuList[i].price;
        }
        return total;
    }

    public int cancel(int num) {
        Scanner sc = new Scanner(System.in);
        int ch;
        int total = 0;
        System.out.print("현재 주문하신 아이스크림 : ");
        for(int i=0; i<4; i++) {
            if(menuList[i].num>0) {
                System.out.print(menuList[i].menuName+ "(" + menuList[i].num+ ")" + " ");
            }
        }
        System.out.println();

        System.out.println("----------Menu Pan----------");
        for(int i=0; i<4; i++) {
            System.out.println((i+1) + " " + menuList[i].menuName + "       " + menuList[i].price);
        }
        System.out.println("-----------------------------");

        System.out.print("\n취소하실 아이스크림을 골라주세요 : ");
        ch=sc.nextInt();
        int index = ch - 1;
        System.out.println(menuList[index].menuName + "취소!");

        menuList[index].num--;

        for(int i=0; i<4; i++) {
            total += menuList[i].num * menuList[i].price;
        }
        return total;
    }

    public int pay(int total) {
        Scanner sc = new Scanner(System.in);
        int payMoney;
        System.out.println("총 금액 : " + total + "원");
        System.out.print("지불할 금액 : ");
        payMoney = sc.nextInt();
        if(total>payMoney){
            System.out.println("결제실패! 잔돈부족");
            return total;
        }else {
            System.out.println("잔돈 : " + (payMoney - total));
            fileManager.cashbills(menuList, total, payMoney);
        }
        return payMoney-total;
    }

    public String readBills() {
        String filePath = "bills.txt";
        String fileContent = "";

        File file = new File(filePath);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");
                }
                fileContent = sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(" ");
        }

        return fileContent;
    }
}