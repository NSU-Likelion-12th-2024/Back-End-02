import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {

        Map<String,Integer> ageMap = new HashMap<>();
        ageMap.put("라아라라라",30);
        ageMap.put("dffff",25);
        ageMap.put("차이나",35);

        int bobAge1 = ageMap.get("dffff");
        System.out.println(bobAge1);

        boolean contains = ageMap.containsKey("라아라라라");

    }
}
