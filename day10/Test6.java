package day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Test6 {
    public static void main(String[] args) {
        // 定义一个泛型为<String, Integer>的HashMap(可理解为字典)实例化对象
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("b", 1); // 添加数据
        map.put("c", 2);
        map.put("e", 2);
        map.put(null, 3);
        System.out.println(map); // {null=3, b=1, c=2, e=2}

        System.out.println(map.get("b")); // 1, 根据key取值

        map.remove("c"); //根据key移除键值对
        System.out.println(map); // {null=3, b=1, e=2}

        System.out.println(map.size()); // 3, map集合的长度

        System.out.println(map.containsKey("a")); // false, 判断当前的map集合是否包含指定的key
        
        System.out.println(map.containsValue(10)); // false, 判断当前的map集合是否包含指定的value

        // map.clear(); // 清空集合

        // 遍历map集合
        Set<String> keys = map.keySet(); // 获取map集合的key集合
        Collection<Integer> c = map.values(); // 获取map集合的所有value值
        System.out.println(c); // [3, 1, 2]
        // 遍历map集合，通过map.keySet();
        for(String key : keys) {
            System.out.println("key: " + key + ", value: " + map.get(key));
        }
        // key: null, value: 3
        // key: b, value: 1
        // key: e, value: 2

        // 通过map.entrySet();
        Set<Entry<String, Integer>> entrys = map.entrySet();
        for(Entry<String, Integer> en : entrys) {
            System.out.println("key: " + en.getKey() + ", value: " + en.getValue());
        }

        
    }
}