package day10;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test4 {
    public static void main(String[] args) {
        // // 定义一个TreeSet，对象的多态，向上转型
        // Set<Integer> set = new TreeSet<Integer>();
        
        // // TreeSet自然排序
        // set.add(5);
        // set.add(2);
        // set.add(4);
        // set.add(3);
        // System.out.println(set); // [2, 3, 4, 5]
        // set.remove(5); // [2, 3, 4]
        // set.contains(3); // true
        // set.clear(); //清空集合

        // set.add(5);
        // set.add(2);
        // set.add(4);
        // set.add(3);
        // //使用迭代器遍历集合
        // Iterator<Integer> it = set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // // 使用for each 迭代集合(推荐)
        // for(Integer i : set){
        //     System.out.println(i);
        // }

        // 在TreeSet中放入自定义类实例化的对象：定制排序
        Person p1 = new Person("张三", 23);
        Person p2 = new Person("李四", 20);
        Person p3 = new Person("王五", 16);
        Person p4 = new Person("Lucy", 29);
        
        // 为什么要传入new Person(): TreeSet有两个主要的构造方法，无参的使用的是自然排序(Comparable)，有参的传入的参数类型为Comparator类型，比较时按照Comparator实例化对象的比较方法进行比较，这里的Person实现了Comparator接口，所以是Comparator的子类，Comparator<? super E> comparator = new Person() 体现了对象的多态，即向上转型
        Set<Person> set = new TreeSet<Person>(new Person());
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        for(Person p : set) {
            System.out.println(p.name + "    " + p.age);
        }
    }
    
}

class Person implements Comparator<Person> { // 把person对象存到TreeSet中并且按照年龄排序
    int age;
    String name;

    public Person() {

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compare(Person o1, Person o2) { // 年龄正序排列
        if(o1.age > o2.age){
            return 1;
        }else if(o1.age < o2.age) {
            return -1;
        }else {
            return 0;
        }
    }

}