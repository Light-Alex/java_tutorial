package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("b");   
        list.add("cd");   
        list.add("ca");   
        list.add("a");   
        list.add("1");   
        System.out.println(list);  // [b, cd, ca, a, 1]

        Collections.reverse(list); // 反转List中元素的顺序
        System.out.println(list);  // [1, a, ca, cd, b]

        Collections.shuffle(list); // 对List集合元素进行随机排序
        System.out.println(list);  // [b, cd, 1, a, ca]

        Collections.sort(list);    // List集合字典升序排序
        System.out.println(list);  // [1, a, b, ca, cd]

        System.out.println(Collections.max(list)); // cd, 根据元素的自然顺序，返回给定集合中的最大元素
        System.out.println(Collections.min(list)); // 1, 根据元素的自然顺序，返回给定集合中的最小元素

        Collections.swap(list, 0, 4); // 将指定list集合中的i处元素和j处元素进行交换
        System.out.println(list);     // [cd, a, b, ca, 1]

        System.out.println(Collections.frequency(list, "a")); // 1, 返回指定集合中指定元素的出现次数

        Collections.replaceAll(list, "a", "aa"); // 使用新值替换List对象中的所有旧值
        System.out.println(list); // [cd, aa, b, ca, 1]

        Student s1 = new Student(14, "张三");
        Student s2 = new Student(12, "李四");
        Student s3 = new Student(13, "王五");
        Student s4 = new Student(11, "小六");

        List<Student> stus = new ArrayList<Student>();
        stus.add(s1);
        stus.add(s2);
        stus.add(s3);
        stus.add(s4);

        Student sMax = Collections.max(stus, new Student());
        System.out.println(sMax.name + ", " + sMax.age); // 张三, 14, 据Comparator指定的顺序，返回给定集合中的最大元素

        Student sMin = Collections.min(stus, new Student());
        System.out.println(sMin.name + ", " + sMin.age); // 小六, 11, 据Comparator指定的顺序，返回给定集合中的最小元素

        for(Student stu : stus){
            System.out.println("age: " + stu.age + ", " + "name: " + stu.name);
        }
        Collections.sort(stus, new Student());
        System.out.println("------------------");
        for(Student stu : stus){
            System.out.println("age: " + stu.age + ", " + "name: " + stu.name);
        }
    }   
}

class Student implements Comparator<Student> {

    int age;
    String name;

    public Student() {

    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compare(Student o1, Student o2) { //根据年龄升序排列对象

        if(o1.age > o2.age){
            return 1;
        }else if(o1.age < o2.age){
            return -1;
        }else{
            return 0;
        }
    }
    
}