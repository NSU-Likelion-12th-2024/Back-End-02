import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {

        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 숫자 입력 받음
        System.out.print("숫자 : ");
        int input = sc.nextInt();
        System.out.println();

        // 입력 받은 숫자에 해당하는 구구단 제목 출력
        System.out.println("===== " + input + "단 =====");
        System.out.println();

        // 구구단 계산 및 출력
        for(int i = 1; i <= 9; i++) {
            // 입력 받은 숫자와 i를 곱하여 구구단을 계산하고 출력
            for(int j = input; j <= input; j++) {
                System.out.printf("%d * %d = %d   ", j, i, j*i);
            }
            System.out.println(); // 한 줄 띄기
        }
    }
}
