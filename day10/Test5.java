package day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("b"); //第一个，索引下标0
        list.add("d"); //第二个，索引下标1
        list.add("c"); //第三个，索引下标2
        list.add("a"); //第四个，索引下标3
        list.add("d"); // [b, d, c, a, d], 允许使用重复元素
        System.out.println(list); // [b, d, c, a, d]
        System.out.println(list.get(2)); // c, 通过索引访问指定位置的集合元素

        list.add(1, "f"); //在指定索引下标的位置插入数据
        System.out.println(list); // [b, f, d, c, a, d]

        List<String> l = new ArrayList<String>();
        l.add("123");
        l.add("456");
        list.addAll(2, l);
        System.out.println(list); // [b, f, 123, 456, d, c, a, d]，在指定索引下标的位置插入集合，不指定泛型的话，插入类型可以不同

        System.out.println(list.indexOf("d")); // 4，获取指定元素在集合中第一次出现的索引下标
        System.out.println(list.lastIndexOf("d")); // 7，获取指定元素在集合中最后一次出现的索引下标

        list.remove(2); // 根据索引下标移除元素
        System.out.println(list); // [b, f, 456, d, c, a, d]

        list.set(1, "ff"); // 根据指定的索引下标修改元素
        System.out.println(list); // [b, ff, 456, d, c, a, d]

        List<String> subList = list.subList(2, 4); // 根据索引下标的的起始位置截取一段元素形成一个新的集合，截取的区间为:[开始索引, 结束索引)
        System.out.println(subList);  // [456, d]

        System.out.println(list.size()); // 7, 集合的长度

        // 方式一：遍历集合 -- for each方式(推荐)
        for(String s : list){
            System.out.println(s);
        }

        // 方式二：遍历集合 -- 迭代器方式(推荐)
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}