package homework;

import java.util.Scanner;

public class Week01_Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정답
        int correctAnswer = 4;
        // 사용자 입력값
        int userAnswer;
        // 사용자 입력값(숫자 검사용)
        String userInput;

        // 정답이 나올 때까지 반복
        boolean isCorrect = false;

        while (!isCorrect) {
            // 사용자 입력 받기
            do {
                System.out.println("Q.다음 중 프로그래밍 언어가 아닌 것은?");
                System.out.println("1. 자바");
                System.out.println("2. 파이썬");
                System.out.println("3. c언어");
                System.out.println("4. 멋쟁이사자처럼");
                System.out.print("답을 입력하세요: ");
                userInput = sc.nextLine();

                // 입력값이 숫자인지 확인
                if(userInput.matches("\\d+")) {
                    userAnswer = Integer.parseInt(userInput);
                    break;
                } else {
                    System.out.println("다시.");
                }
            } while (true);

            // 정답 체크와 출력
            isCorrect = (userAnswer == correctAnswer);
            if (isCorrect) {
                System.out.println("정답.");
            } else {
                System.out.println("오답.");
            }
        }
    }
}
