package homework;

import java.util.ArrayList;
import java.util.List;

public class Week03_Ex01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 5; i<10; i++) {
            numbers.add(i);
        }
        System.out.println("입력한 리스트의 홀수 값 : ");
        for(Integer num : numbers) {
            if(num%2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
