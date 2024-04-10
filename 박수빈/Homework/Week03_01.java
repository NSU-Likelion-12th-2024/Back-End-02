package Homework;
import java.util.ArrayList;
import java.util.List;
public class Week03_01 {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            // 리스트에 값 추가
            numbers.add(5);
            numbers.add(6);
            numbers.add(7);
            numbers.add(8);
            numbers.add(9);

            System.out.println("리스트의 홀수 값:");
            // 리스트를 반복하면서 각 요소가 홀수인지 확인하고 홀수인 경우에만 출력
            for (int number : numbers) {
                if (number % 2 != 0) {
                    System.out.print(number + " ");
                }
            }
        }

}
