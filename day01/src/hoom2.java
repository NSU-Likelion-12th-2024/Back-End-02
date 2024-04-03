//
//import java.util.Scanner;
//public class hoom2{
//public static void main(String[] args) {
//
//    Scanner sc = new Scanner(System.in);
//    String[] questions = {
//            "다음 중 프로그래밍 언어가 아닌 것은?",
//            "다음 중 프로그래밍 언어가 아닌 것은?",
//            "다음 중 프로그래밍 언어가 아닌 것은?",
//            "다음 중 프로그래밍 언어가 아닌 것은?"
//    };
//    String[] choices = {"1. 자바", "2. 파이썬", "3. C언어", "4. 멋쟁이사자처럼"};
//    int[] answers = {1, 2, 3, 4};
//
//    for (int i = 0; i < questions.length; i++) {
//        System.out.println("Q. " + questions[i]);
//        for (String choice : choices) {
//            System.out.println(choice);
//        }
//        int answers = Scanner.nextInt();
//
//        System.out.println("정답: " + choices[answers[i] - 1]);
//        if (answers == answers[i]) {
//            System.out.println("정답");
//        } else {
//            System.out.println("오답");
//        }
//    }
//}