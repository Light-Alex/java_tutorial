package day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化与反序列化
 * 注意：对象的序列化与反序列化使用的类要严格一致：包名，类名，类属性，类方法等等都要一致，否则就会抛出异常
 * @author ycx
 * 
 */
public class Test5 {
    public static void main(String[] args) {
        // 测试对象的序列化方法
        try {
            Test5.testSerialize();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 测试对象的反序列化方法
        try {
            Test5.testDeserialize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 对象的序列化
     */
    public static void testSerialize() throws Exception{
        // 定义对象的输出流，把对象序列化之后的流输出到指定的文件中
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("day13/tt10.txt"));

        Person p = new Person();
        p.name = "zhangsan";
        p.age = 11;

        out.writeObject(p);
        out.flush(); // 不等缓冲区塞满，直接把缓冲区中残留的数据输出到硬盘

        // 关闭流
        out.close();
    }

    /**
     * 对象的反序列化
     */
    public static void testDeserialize() throws Exception{
        // 创建 对象输入流对象，从指定的文件中将对象序列化后的流读取出来
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("day13/tt10.txt"));

        Object obj = in.readObject();

        Person p = (Person) obj;

        System.out.println(p.name);
        System.out.println(p.age);

        // 关闭流
        in.close();
    }
}