//public class Person {
//    public static void main(String[] args) {
//        Pse person = new Pse("Jusung", 23);
//        System.out.println(person);
//    }
//}
//
//class Pse{
//    private String name;
//    private int age;
//
//    public Pse(String name, int age){
//        this.name = name;
//        this.age = age;
//
//    }
//    @Override
//    public String toString(){
//        return "Person(name='" + name + "', age=" + age + "}";
//
//    }
//}

//public class Person{
//    public static void main(String[] args) {
//        String[] mbti = {"INTP", "ENFP", "ISTJ"};
//        System.out.println(mbti.length);
//
//        for(int i = 0; i<mbti.length; i++){
//            System.out.println(mbti[i]);
//        }
//    }
//}

//class Book{
//    String title;
//    int price;
//    public Book (){}
//    public void showPrice() {
//        System.out.println(title + "의 가격은" + price + "원 입니다");
//
//    }
//}
//public class Person{
//    public static void main(String[]args){
//        Book[] b = new Book[3];
//        for(int i=0; i<b.length;i++){
//            b[i] = new Book();
//
//        }
//        b[0].title = "국어책";
//        b[0].price = 3000;
//
//        b[1].title = "영어책";
//        b[1].price = 4000;
//
//        b[2].title = "수학책";
//        b[2].price = 5000;
//
//        for (int i=0; i<b.length; i++) {
//            b[i].showPrice();
//        }
//    }
//}

import java.util.HashMap;
import java.util.Map;

public class Person{
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("김씨","어부");
        map.put("이씨","광부");
        map.put("최씨","농부");
        map.put("김씨","무직");

        for(String key : map.keySet()){
            System.out.println(key+": "+map.get(key));
        }
    }
}