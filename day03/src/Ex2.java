import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("이씨","어부");
        map.put("처ㅣ씨","광부");

        map.put("이씨","초부");
        map.put("최씨","비부");
        map.put("김씨","키부");
        map.put("삐씨","미부");


        for (String Key : map.keySet()){
            System.out.println(Key+" : "+map.get(Key));
        }


    }
}
