// for문 예제
//public class loop //loop클래스 정의
//{
//    public static void main(String[] args) //프로그램의 시작점인 main 메서드 정의
//    {
//        for (int i = 1; i <= 9; i++) //바깥문 반복문은 1부터 9까지의 숫자를 반복(구구단 의미)
//        {
//            for (int j = 1; j <= 9; j++) // 안쪽 반복문은 1부터 9까지의 숫자 반복(각 단에서 곱해지는 수 의미)
//            {
//                System.out.printf("%d  * %d = %02d ", j, i, j * i);//print 메서드 사용, %02d는 두 자리로 표시되고 빈 자리는 0으로 채워진 정수를 나타냄
//            }
//            System.out.println(); // 한 단의 곱셈이 끝나면 줄바꿈하여 다음 단을 출력
//        }
//    }
//}

// while문 예제
//public class loop{
//    public static void main(String[] args) //프로그램이 시작되면 메서드가 실행됨
//    {
//        int dan = 1; // 변수 dan을 선언하고 1로 초기화한다. (구구단의 단을 나타냄)
//        while (dan<10) //dan이 10보다 작은동안 반복문을 시작
//             {
//            int index = 1; // 변수 index를 선언하고 1로 초기화한다.(각 단에서의 곱을 나타냄)
//            while(index<10) {// index가 10보다 작은동안 반복문을 시작
//                System.out.printf("%d * %d = %02d  ", index, dan, index * dan);//printf함수를 사용하여 곱셈 출력
//                index++; // index변수를 1씩 증가시킨다.
//            }
//            System.out.println();// 각 단이 끝날때마다 줄바꿈하기
//            dan++; //dan변수를 1씩 증가시킨다.
//        }
//    }
//}

//do-while문 예제
//import java.util.Random; // Random 클래스를 사용하기 위해 해당 패키지 import
//import java.util.Scanner; // Scanner 클래스를 사용하기 위해 해당 패키지 import
//
//public class loop { // loop 클래스 선언
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //Scanner객체 생성(사용자로부터 입력을 받기 위해 사용)
//        Random random = new Random(); // Random객체 생성(난수를 생성하기 위해 사용)
//        int randomNumber = random.nextInt(10); //Random객체의 nextInt 메서드 사용하여0부터 9까지 임의의 숫자 생성
//        int input = 0; //사용자의 입력을 저장할 변수 input을 초기화
//        int count = 0; //사용자가 몇 번째 시도에서 정답을 맞췄는지를 저장할 변수 count를 초기화
//        do{ //do-while루프 시작(이 루프는 사용자가 정답을 맞출 때까지 반복)
//            System.out.printf("0 ~ 9까지의 숫자를 입력하세요: "); //사용자에게 입력요청
//            input = sc.nextInt(); //사용자의 입력 받아서 input변수에 저장
//            count++; ///p시도 횟수 1증가시키기
//            if(input!=randomNumber) { //사용자 입력이 정답과 다르면 아래 코드 실행
//                System.out.println("땡 ! 틀렸습니다.");
//            }
//        }while(input!=randomNumber); //사용자의 입력이 정답과 다르면 루프 반복
//        System.out.printf("%d번만에 맞추셨습니다! 정답: %d", count, randomNumber);//정답 맞춘 횟수와 정답 출력
//        // 사용자가 입력한 숫자가 정답과 다르면 계속해서 입력을 받고,정답을 맞출 때까지 반복한다.최종적으로 정답을 맞춘 횟수와 정답이 출력됨
//    }
//}

//if문 예제
//import java.util.Scanner; // Scanner 클래스 사용하기 위해 import문 추가
//
//public class loop {
//    public static void main(String[] args) { //프로그램 시작점인 main메서드 시작
//        Scanner sc = new Scanner(System.in); // Scanner 객체를 생성하여 사용자의 입력을 받을 준비
//        String id = "user"; //문자열 변수인 id에 "user"라는 문자열 할당
//        String password = "1234"; //문자열 변수인 "password"에 1234라는 문자열 할당
//
//        System.out.println("아이디를 입력해주세요: ");//사용자에게 아이디 입력하라는 메세지 출력
//        String inputId = sc.next(); //사용자의 입력을 받아서 inputId 변수에 저장
//        System.out.println("비밀번호를 입력해주세요: "); //사용자에게 비밀번호 입력하라는 메세지 출력
//        String inputPassword = sc.next(); //사용자의 입력을 받아서 inputPassword 저장
//
//        if(inputId.equals(id) && inputPassword.equals(password)) {//입력한 아이디와 비밀번호가 일치한지 확인
//            System.out.println("로그인에 성공했습니다!");
//        }
//    }
//}

//else문 예제
//import java.util.Scanner; // scanner 클래스를 사용하기 위해 import문 사용
//
//public class loop{ // loop 클래서 정의
//    public static void main(String[] args) { //main 메서드 정의
//        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
//        String id = "user"; //문자열 변수인 id에 "user"라는 문자열 할당
//        String password = "1234"; //문자열 변수인 "password"에 "1234"라는 문자열 할당
//
//        System.out.println("아이디를 입력해주세요: "); //사용자에게 아이디 입력하라는 메세지 출력
//        String inputId = sc.next(); //사용자의 입력을 받아서 inputId 변수에 저장
//        System.out.println("비밀번호를 입력해주세요: "); //사용자에게 비밀번호 입력하라는 메세지 출력
//        String inputPassword = sc.next();//사용자의 입력을 받아서 inputPassword에 저장
//
//        if(inputId.equals(id)&&inputPassword.equals(password)) { //입력한 아이디와 비밀번호가 정해진 아이디와 비밀번호와 일치한지 확인
//            System.out.println("로그인에 성공하였습니다!"); //입력된 아이디와 비밀번호가 정확히 일치하면 메세지 출력
//        }else {//입력된 아이디나 비밀번호가 일치하지 않는 경우
//            System.out.println("로그인에 실패하였습니다!");//"로그인에 실패하였습니다!"메세지 출력
//            System.out.println("아이디나 비밀번호를 확인해주세요."); //안내 메세지 출력
//        }
//
//
//    }
//}

//else if문 예제
//public class loop { // loop 클래스 선언
//
//    public static void main(String[] args) { // main 메서드 선언
//
//        int score = 76; // 성적을 저장하는 변수를 선언하고, 76으로 초기화합니다.
//
//        if (score / 10 == 10 || score / 10 == 9) { // 성적을 10으로 나눈 몫이 10이거나 9인 경우
//            System.out.printf("나의 성적: %d(A)", score); // A 학점을 출력합니다.
//        } else if (score / 10 == 8) { // 성적을 10으로 나눈 몫이 8인 경우
//            System.out.printf("나의 성적: %d(B)", score); // B 학점을 출력합니다.
//        } else if (score / 10 == 7) { // 성적을 10으로 나눈 몫이 7인 경우
//            System.out.printf("나의 성적: %d(C)", score); // C 학점을 출력합니다.
//        } else if (score / 10 == 6) { // 성적을 10으로 나눈 몫이 6인 경우
//            System.out.printf("나의 성적: %d(D)", score); // D 학점을 출력합니다.
//        } else { // 위 조건들에 해당하지 않는 경우
//            System.out.printf("나의 성적: %d(F)", score); // F 학점을 출력합니다.
//        }
//    }
//}

// switch문 예제
//public class loop { // loop 클래스 선언
//    public static void main(String[] args) { // main 메서드 시작
//        int score = 76; // 성적을 나타내는 변수 score를 76으로 초기화
//
//        switch (score / 10) { // score를 10으로 나눈 몫을 swith 조건식으로 사용
//            case 10, 9: // 몫이 10또는 9인 경우
//                System.out.printf("나의 성적: %d(A)", score); // A학점 출력
//                break; // swith문 종류
//            case 8: // 몫이 8인 경우
//                System.out.printf("나의 성적: %d(B)", score); // B학점 출력
//                break; // swith문 종류
//            case 7: // 몫이 7인 경우
//                System.out.printf("나의 성적: %d(C)", score); // C학점 출력
//                break; // swith문 종류
//            case 6: // 몫이 6인 경우
//                System.out.printf("나의 성적: %d(D)", score); // D학점 출력
//                break; // swith문 종류
//            case 5, 4, 3, 2, 1, 0: // 몫이 5이하인 경우
//                System.out.printf("나의 성적: %d(F)", score); // F학점 출력
//                break; //swith문 종류
//            default: // 어떤 case에도 해당하지 않는 경우
//                System.out.printf("%d는 올바르지 않은 점수 입니다.", score);
//        }
//    }
//}

import java.util.Scanner;

public class loop {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] questions = {
                "다음 중 프로그래밍 언어가 아닌 것은?",
                "다음 중 프로그래밍 언어가 아닌 것은?",
                "다음 중 프로그래밍 언어가 아닌 것은?",
                "다음 중 프로그래밍 언어가 아닌 것은?"
        };
        String[] choices = {"1. 자바", "2. 파이썬", "3. C언어", "4. 멋쟁이사자처럼"};
        int[] answers = {1, 2, 3, 4};

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q. " + questions[i]);
            for (String choice : choices) {
                System.out.println(choice);
            }
            int answer = Scanner.nextInt();

            System.out.println("정답: " + choices[answers[i] - 1]);
            if (answer == answers[i]) {
                System.out.println("정답");
            } else {
                System.out.println("오답");
            }
        }
    }
}
