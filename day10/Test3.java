package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        // 定义一个HashSet，对象的多态，向上转型
        Set set = new HashSet(); // 等价于Set<Object> set = new Set<Object>();

        // // 添加一个元素
        // set.add(1);
        // set.add("a");
        // System.out.println(set); // [1, a]

        // // 移除一个元素
        // set.remove(1);
        // System.out.println(set); // [a]

        // // 判断集合中是否包含某元素
        // System.out.println(set.contains(1)); // false

        // // 清空集合
        // set.clear();
        // System.out.println(set); // []

        // 遍历集合
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        set.add("d");  // [a, b, c, d]，Set集合存的对象(引用)是不重复的
        set.add(null); // [null, a, b, c, d]，set集合可以存null，HashSet不能保证元素的排列顺序

        set.add(1);
        set.add(true); // set集合里可以存不同类型的对象

        System.out.println(set); // [a, b, c, d]
        // 方式一：使用迭代器遍历集合
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //方式二：for each迭代集合(推荐)
        for(Object obj : set){ // 把set集合中的每一个对象取出来，赋值给obj(对象的多态，向上转型)，直到遍历完set的所有值
            System.out.println(obj);
        }

        // 获取集合中的元素个数
        System.out.println(set.size());

        // 如果想要让集合只能存同样类型的对象，怎么做：使用泛型
        Set<String> set1 = new HashSet<String>(); // 比如指定String类型为集合的泛型，那么这个集合就不能存String类型之外的类型了
        set1.add("abc");
        // set1.add(1); // 1不是字符串类型，故编译错误
    }
}