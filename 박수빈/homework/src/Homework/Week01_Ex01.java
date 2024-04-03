package Homework;

import java.util.Random;
import java.util.Scanner;

public class Week01_Ex01 {
    public static void main(String[] args) {
        /*
        System.out.println("구구단을 실행할 숫자를 입력하세요:     ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(int j = 1; j<= 9; j++) {
                System.out.printf("%d * %d = %02d   ", i, j, i*j);
                System.out.println();
            }

         */

        String Ex = "Q. 다음 중 프로그래밍 언어가 아닌 것은?\n" + "1. 자바\n" + "2. 파이썬\n" + "3. C언어\n" + "4. 멋쟁이사자처럼\n";
        Scanner sc = new Scanner(System.in);
        int my = 0;
        int answer = 4;
        String result = "";
        do{
            System.out.println(Ex);
            my = sc.nextInt();
            result = my == answer ? "정답" : my >= 1 && my < 4 ? "오답" : "다시";
            System.out.println(result);
        }while (my != answer);

    }
}

// =============================================================================================
//백엔드 2조 주석처리 과제
/*
        for(int i = 1; i<=9; i++) {     //정수형 변수 i를 1로 초기화, i는 9보다 작거나 같으며 값이 1씩 증가
            for (int j = 1; j<=9; j++) {        //정수형 변수 j를 1로 초기화, j는 9보다 작거나 같으며 값이 1씩 증가
                System.out.printf("%d * %d = %02d   ", j, i, j*i);      //1씩 증가하는 i와 j와 i * j의 값을 출력
            }
            System.out.println();   //결과 출력
        }
        */

        /*
        int dan = 1;        //정수형 변수 dan을 생성 후 1로 초기화
        while(dan<10) {     //dan이 10보다 작다는 조건식이 참일 때 밑의 문장들 실행
            int index = 1;  //정수형 index 생성 후 1로 초기화
            while(index<10) {       //index가 10보다 작다는 조건식이 참일 때 밑의 문장들 실행
                System.out.printf("%d * %d = %02d   ", index, dan, index*dan);  //1씩 증가하는 dan과 index, dan과 index를 곱한 값
                index++;    //index 1증가
            }
            System.out.println();   //결과 출력
            dan++;  //dan 1증가
        }
        */

        /*
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        int input = 0;      //정수형 변수 input 생성 후 0으로 초기화
        int count = 0;      //정수형 변수 count  생성 후 0으로 초기화
        do {
            System.out.printf("0 ~ 9까지의 숫자를 입력하세요:  ");     //"0 ~ 9까지의 숫자를 입력하세요:  "출력 실행
            input = sc.nextInt();       // 정수값 입력받기
            count++;    //count 1증가
            if (input != randomNumber) {        //input과 randomNumber가 다를 때 "땡 틀렸습니다" 출력 실행
                System.out.println("땡 틀렸습니다");
            }
        }while(input != randomNumber);      //input값이 randomNumber값과 다를 때 라는 조건식 작성
        System.out.printf("%d번만에 맞추셨습니다 정답: %d", count, randomNumber);     //몇번만에 맞췄는지 count의 값 출력, 정답인 randomNumber값 출력 실행
        */

        /*
        int score = 76;     //정수형 변수 score 생성 후 76 값 대입
        if(score/10==10 || score/10==9) {       //score를 10으로 나눈 값이 10 이거나(or) 9일 때 "나의 성적: (A)"라고 출력 실행
            System.out.printf("나의 성적: %d(A)", score);
        } else if (score/10==8) {       //score를 10으로 나눈 값이 8일 때(참) "나의 성적: (B)"라고 출력 실행
            System.out.printf("나의 성적: %d(B)", score);
        } else if (score/10==7) {       //score를 10으로 나눈 값이 7일 때(참) "나의 성적: (C)"라고 출력 실행
            System.out.printf("나의 성적: %d(C)", score);
        } else if (score/10==6) {       //score를 10으로 나눈 값이 6일 때(참) "나의 성적: (D)"라고 출력 실행
            System.out.printf("나의 성적: %d(D)", score);
        } else {                        //나머지 값들이라면 "나의 성적: (F)"라고 출력 실행
            System.out.printf("나의 성적: %d(F)", score);
        }
        */

        /*
        int score = 76;     //정수형 변수 score 생성 후 76 값 대입
        switch (score/10) {     //score를 10으로 나눈 값을 조건식으로 작성
            case 10, 9:     //조건식의 값이 10, 9일 때 "나의 성적: (A)"출력 실행
                System.out.printf("나의 성적: %d(A)", score);
                break;
            case 8:         //조건식의 값이 8일 때 "나의 성적: (B)"출력 실행
                System.out.printf("나의 성적: %d(B)", score);
                break;
            case 7:         //조건식의 값이 7일 때 "나의 성적: (C)"출력 실행
                System.out.printf("나의 성적: %d(C)", score);
                break;
            case 6:         //조건식의 값이 6일 때 "나의 성적: (D)"출력 실행
                System.out.printf("나의 성적: %d(D)", score);
                break;
            case 5, 4, 3, 2, 1, 0:      //조건식의 값이 5,4,3,2,1,0일 때 "나의 성적: (F)"출력 실행
                System.out.printf("나의 성적: %d(F)", score);
                break;
            default:        //나머지 값들은 "올바르지 않은 점수"라고 출력 실행
                System.out.printf("%d는 올바르지 않은 점수 입니다", score);
        }
        */
