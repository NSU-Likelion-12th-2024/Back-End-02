//과제(1)
import java.util.Scanner;

public class hom1{
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


//과제(2)
//import java.util.Scanner;
//
//public class hom1 {
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        String[] questions = {
//                "다음 중 프로그래밍 언어가 아닌 것은?",
//                "다음 중 프로그래밍 언어가 아닌 것은?",
//                "다음 중 프로그래밍 언어가 아닌 것은?",
//                "다음 중 프로그래밍 언어가 아닌 것은?"
//        };
//        String[] choices = {"1. 자바", "2. 파이썬", "3. C언어", "4. 멋쟁이사자처럼"};
//        int[] answers = {1, 2, 3, 4};
//
//        for (int i = 0; i < questions.length; i++) {
//            System.out.println("Q. " + questions[i]);
//            for (String choice : choices) {
//                System.out.println(choice);
//            }
//            int answer = Scanner.nextInt();
//
//            System.out.println("정답: " + choices[answers[i] - 1]);
//            if (answer == answers[i]) {
//                System.out.println("정답");
//            } else {
//                System.out.println("오답");
//            }
//        }
//    }
//}

