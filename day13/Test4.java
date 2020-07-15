package day13;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 数据流，专门用来做基本数据类型的读写的
 */
public class Test4 {
    public static void main(String[] args) {
        // 测试数据输出流
        try {
            Test4.testDataOutputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 测试数据输入流
        try {
            Test4.testDataInputStream(); // 100
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 数据输出流
     * 注意：用数据输出流写到文件中的基本数据类型的数据是乱码，不能直接辨认出来，需要数据输入流来读取
     * DataOutputStream
     */
    public static void testDataOutputStream() throws Exception{
        DataOutputStream out = new DataOutputStream(new FileOutputStream("day13/tt9.txt"));

        // 将一个boolean类型的数据写入tt8.txt文件中
        // out.writeBoolean(true);
        // out.writeDouble(1.35);
        out.writeInt(100);

        out.flush();

        // 关闭流
        out.close();
    }

    /**
     * 数据输入流
     * 注意：用数据输出流写到文件中的基本数据类型的数据是乱码，不能直接辨认出来，需要数据输入流来读取
     * 用数据输入流读取数据输出流写到文件中的数据时，要保证使用和当时写的数据类型一致的类型来读取，也就是如果写的时候是writeDouble，读的时候就得是readDouble，否则读出来的数据没有意义
     * DataInputStream
     */
    public static void testDataInputStream() throws Exception{
        DataInputStream in = new DataInputStream(new FileInputStream("day13/tt9.txt"));

        System.out.println(in.readInt());

        // 关闭流
        in.close();
    }
}