import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> fruits = new java.util.ArrayList<>();

        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("오렌지");


        System.out.println("리스트 크기" + fruits.size());


        String frvit = fruits.get(1);
        System.out.println("인덱스 1 과일 " + frvit);

        boolean catainsBannana = fruits.contains("바나나");
        System.out.println("바나나 가 리스트 에 포함 되는가"+ catainsBannana);

        fruits.remove("오렌지");
        System.out.println("오렌지가 제거"+ fruits);

        fruits.clear();
        System.out.println("모든 요소 제거 "+fruits);

    }

}
