package Homework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;
/*
public class practice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김코딩", "이자바", "김자바", "김코딩");
        names.stream()
                .distinct()
                .forEach(n-> System.out.println(n));
        System.out.println();
        names.stream()
                .filter(n->n.startsWith("김"))
                .forEach(System.out::println);
    }

}
 */

/*
class Board{
    private String title;
    private String content;
    private int hit;

    Board(String title, String content, int hit){
        this.title = title;
        this.content = content;
        this.hit = hit;
    }
    public String getTitleAndContent(){return this.title+":"+this.content;}
    public int getHit(){return this.hit;}

    List<Board> boards = new ArrayList<>(Arrays.asList(
            new Board("오늘의 날씨", "오늘은 맑습니다", 30),
            new Board("오늘의 노래", "뉴진스의 하입보이", 40),
            new Board("오늘의 게임", "리그오브레전드", 100),
            new Board("오늘의 운세", "금전운이 좋네요", 20)
    ));
    List<String> top3 =
            boards.stream()
                    .sorted(Comparator.comparing(Board::getHit).reversed())
                    .limit(3)
                    .map(Board::getTitleAndContent)
                    .collect(Collectors.toList());


    System.out.println(top3);
}
 */

/*
public class practice {
    public static void main(String[] args){
        try {
            int x = 10;
            System.out.printf("10 / %d\n", x, 10/x);

            String str = "try catch";
            int length = str.length();
            System.out.println("length =  " + length);

            int[] arr = new int[5];
            arr[5] = 11111;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: "+ e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("NullPointerException: "+ e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: "+ e.getMessage());
        } finally {
            System.out.println("finally: 예외 처리여부와 관계없이 최종적으로 실행되는 문장입니다");
        }
    }
}
 */

public class practice extends Exception{
    private final int ERR_CODE;

    public practice(String msg, int errCode){
        super(msg);
        this.ERR_CODE = errCode;
    }
    public int getErrCode(){
        return this.ERR_CODE;
    }
}

