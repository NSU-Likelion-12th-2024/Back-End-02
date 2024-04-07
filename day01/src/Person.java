class Book{
    String title;
    int price;
    public Book (){}
    public void showPrice() {
        System.out.println(title + "의 가격은" + price + "원 입니다");

    }
}
public class Person{
    public static void main(String[]args){
        Book[] b = new Book[3];
        for(int i=0; i<b.length;i++){
            b[i] = new Book();

        }
        b[0].title = "국어책";
        b[0].price = 3000;

        b[1].title = "영어책";
        b[1].price = 4000;

        b[2].title = "수학책";
        b[2].price = 5000;

        for (int i=0; i<b.length; i++) {
            b[i].showPrice();
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Person{
    public static void main(String[] args){

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("리스트의 크기:" + fruits.size());

        String fruit = fruits.get(1);
        System.out.println("인덱스 1의 과일:" + fruit);

        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Banana가 리스트에 포함되어 있는가?" + containsBanana);

        fruits.remove("Orange");
        System.out.println("Orange 요소 제거 후:"+fruits);

        fruits.clear();
        System.out.println("모든 요소 제거 후 :"+fruits);
    }
}

import java.util.LinkedList;

public class Person{
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        linkedList.addFirst("Grapes");
        linkedList.addLast("Strawberry");
        linkedList.remove("Banana");
        System.out.println("Linked LIst;" + linkedList);
        System.out.println("First Element:" + linkedList.getFirst());
        System.out.println("Last Element:"+linkedList.getLast());
        System.out.println("Is Empty?" + linkedList.isEmpty());

        linkedList.clear();

        System.out.println("Is Empty after clear?" + linkedList.isEmpty());
    }
}



