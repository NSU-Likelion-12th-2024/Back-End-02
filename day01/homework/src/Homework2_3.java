public class Homework2_3 {

        public static void main(String[] args) {

            Integer[] numbers = {5, 6, 7, 8, 9}; // 배열 초기화

            System.out.print("입력한 리스트의 홀수 값: ");
            for (int num : numbers) { // 리스트의 각 요소에 대해 반복
                if (num % 2 != 0) { // 현재 요소가 홀수인지 확인
                    System.out.print(num + " "); // 홀수이면 해당 값을 출력
                }
            }
        }
    }
