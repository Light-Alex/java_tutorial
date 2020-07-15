package day10;

import java.util.Map;
import java.util.TreeMap;

public class Test7 {
    public static void main(String[] args) {
        // TreeMap的自然排序是字典排序
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(4, "a");
        map.put(3, "a");
        map.put(2, "a");
        map.put(1, "a");
        System.out.println(map); // {1=a, 2=a, 3=a, 4=a}

        Map<String, String> map1 = new TreeMap<String, String>();
        map1.put("b", "a");
        map1.put("c", "a");
        map1.put("d", "a");
        map1.put("a", "a");
        map1.put("ab", "a");
        map1.put("1", "a");
        map1.put("10", "a");
        System.out.println(map1); // {1=a, 10=a, a=a, ab=a, b=a, c=a, d=a}
    }
}