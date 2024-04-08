package review.object;

import java.util.HashMap;
import java.util.Map;

public class MapEx02 {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();

        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        int bobAge1 = ageMap.get("Bob");
        System.out.println("Bob의 나이 : " + bobAge1);

        boolean containsBob = ageMap.containsKey("Bob");
        System.out.println("Bob의 키가 맵에 포함되어 있는가? " + containsBob);

        ageMap.remove("Charlie");
        System.out.println("Charlie 요소 제거 후 : " + ageMap);

        ageMap.replace("Bob", 26);

        int bobAge2 = ageMap.get("Bob");
        System.out.println("Bob의 변경된 나이 : " + bobAge2);
    }
}
