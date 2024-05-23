
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Truong", 23);
        hashMap.put("Tinh", 24);
        hashMap.put("Ngoc", 27);
        hashMap.put("Quyen", 25);
        System.out.println(hashMap);
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Truong", 23);
        linkedHashMap.put("Tinh", 24);
        linkedHashMap.put("Ngoc", 27);
        linkedHashMap.put("quyen", 25);
        System.out.println("\nThe age for " + "Truong is " + linkedHashMap.get("Truong"));
    }
}