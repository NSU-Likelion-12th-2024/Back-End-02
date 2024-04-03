import javax.swing.*;
import java.util.Scanner;

public class Q_1 {
/*           * Q.다음 중 프로그래밍 언어가 아닌 것은?
            * 1. 자바
       * 2. 파이썬
       * 3. C언어
       * 4. 멋쟁이사자처럼
       *
               * 삼항 연산자와 대화상자를 사용해서 퀴즈 프로그램 만들기
       * 잘못 입력하였을 때에는 '?'를 출력한다.
            * 정답이면 "정답" 출력
       * 오답이면 "오답" 출력
       **/
public static void main(String[] args) {
    // Scanner 객체 생성
    Scanner scanner = new Scanner(System.in);

    // 문제와 선택지, 정답 설정
    String qMsg = "Q.다음 중 프로그래밍 언어가 아닌 것은?";
    String choiceMsg = "1. 자바\n" +
            "2. 파이썬\n" +
            "3. C언어\n" +
            "4. 멋쟁이사자처럼";
    int answer = 4;
    String result;

    boolean isTrue = false;

    // 정답이 나올 때까지 반복
    do {
        // 문제 출력
        System.out.println(qMsg + "\n" + choiceMsg);

        // 사용자 입력이 정수가 아닐 경우 반복하여 올바른 입력을 기다림
        while (!scanner.hasNextInt()) {
            System.out.println("올바른 숫자를 입력하세요.");
            scanner.next(); // 잘못된 입력을 버립니다.
        }

        // 정수 입력 받음
        int choice = scanner.nextInt();

        // 입력값이 정답인지 확인
        isTrue = choice == answer;

        // 결과 출력
        //삼항연산자 선언
        result = isTrue ? "정답" : (choice >= 1 && choice <= 4 ? "오답" : "?");
        System.out.println(result);
    } while (!isTrue); // 정답이 나올 때까지 반복
}
}
