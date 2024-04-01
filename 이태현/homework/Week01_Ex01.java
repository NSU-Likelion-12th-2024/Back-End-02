package homework;

import java.util.Scanner;

public class Week01_Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 : ");
        int input = sc.nextInt();
        System.out.println();
        System.out.println("===== " + input + "단 =====");
        System.out.println();
        for(int i = 1; i <= 9; i++) {
            for(int j = input; j <= input; j++) {
                System.out.printf("%d * %d = %d   ", j, i, j*i);
            }
            System.out.println();
        }
    }
}
