package Homework;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class practice {
    public static void main(String[] args) {
        String[] strings = new String[]{"박수빈", "만나서", "반가워요"};
        Stream<String> stream = Stream.of(strings);
        Stream<String> stream1 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> stream2 = Arrays.stream(strings);
    }

}
