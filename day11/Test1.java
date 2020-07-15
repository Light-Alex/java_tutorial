package day11;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        // // 不使用泛型，list集合中可以添加不同类型的对象
        // List list = new ArrayList();
        // list.add(111);
        // list.add("sss");
        // list.add(true);
        // list.add('A');

        // // 使用泛型，集合中只能添加泛型类型的对象
        // List<String> l = new ArrayList<String>();
        // l.add("xx");
        // // l.add(1); // 编译错误，编译期发现

        // 测试泛型类A
        A<String> a1 = new A<String>(); // 在new A对象时指定泛型的类型是String
        a1.setKey("xxxx");              // 对象使用public void setKey(T key)方法时，该方法的形参类型就是String类型
        String s = a1.getKey();         // public T getKey()方法，返回值的类型就是 new 对象 时确定的泛型类型String

        A<Integer> a2 = new A<Integer>(); // 在new A对象时指定泛型的类型是Integer类型
        a2.setKey(12);
        Integer i = a2.getKey();

        A a3 = new A();           // 等价于 A<Object> a3 = new A<Object>() ，对象实例化时不指定泛型，则泛型默认为：Object类型
        a3.setKey(new Object());
        Object obj = a3.getKey();

        // 同样的类，但是new对象时，指定的泛型类型不同，则这些引用不能相互赋值
        // a1 = a2; // 编译错误
    }
}
/**
 * 定义一个泛型类A
 * 此处的泛型T可以取任意的名字，例如A, B, V，但是一般取T，意为type
 * @author ycx
 * @param <T>
 */
class A<T> {
    private T key;

    public void setKey(T key){
        this.key = key;
    }

    public T getKey(){
        return this.key;
    }
}