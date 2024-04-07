//과제(1)
import java.util.Scanner;

public class SwitchEx{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자:");
        int num = sc.nextInt();

        for(int i =1; i<=9; i++) {
            System.out.printf("%d * %d = %2d", num, i, num * i);
            System.out.println();
        }
    }
}



