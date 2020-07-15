package day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) {
        // 测试缓冲字节输入流
        try {
            Test.testBufferedInputStream();
            // 换行符占两个字节，中文占两个字节，英文数字占一个字节
            // 123aasdf12
            // aadsda
            // sd
            // adzz
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 测试缓冲字节输出流
        try {
            Test.testBufferedOutputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 测试文件拷贝函数
        try {
            Test.copyFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 缓冲字节输入流
     * BufferedInputStream
     * @throws Exception
     */
    public static void testBufferedInputStream() throws Exception {
        // 定义一个文件字节输入流对象
        FileInputStream in = new FileInputStream("day13/tt.txt");

        // 定义一个缓冲字节输入流对象，传入文件字节输入流对象的引用in
        BufferedInputStream br = new BufferedInputStream(in);

        byte[] b = new byte[10]; // 定义一个字节数组来接收读取到的数据

        int len = 0;  // 每次读取到的字节数

        while((len = br.read(b)) != -1){
            System.out.println(new String(b, 0, len));
        }

        // 关闭流时，一般本着先打开的后关闭，后打开的先关闭的原则
        br.close();
        in.close();
    }

    /**
     * 缓冲字节输出流
     * BufferedOutputStream
     * @throws Exception
     */
    public static void testBufferedOutputStream() throws Exception {
        // 定义一个字节输出流对象
        FileOutputStream out = new FileOutputStream("day13/tt1.txt");

        // 把字节输出流对象的引用传到缓冲字节输出流构造方法中
        BufferedOutputStream bo = new BufferedOutputStream(out);

        String s = "hello world!"; // 输出的内容

        bo.write(s.getBytes()); // 将数据输出到缓冲区中，缓冲区存满后将数据整块输出到硬盘中

        bo.flush(); // 不等缓冲区存满，直接将缓冲区中残留的数据输出到硬盘中

        // 关闭流时，一般本着先打开的后关闭，后打开的先关闭的原则
        bo.close();
        out.close();
    }

    /**
     * 缓冲流实现文件的拷贝
     * 
     * @throws Exception
     */
    public static void copyFile() throws Exception {
        // 缓冲字节输入流
        BufferedInputStream br = new BufferedInputStream(new FileInputStream("day13/tt1.txt"));

        // 缓冲字节输出流
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("day13/tt2.txt"));

        byte[] b = new byte[1024];  // 定义一个字节数组来接收每次读取到的数据

        int len = 0; // 每次读取到的字节数

        while((len = br.read(b)) != -1){
            bo.write(b, 0, len); // 将数据输出到缓冲区中，缓冲区存满后将数据整块输出到硬盘中
        }

        bo.flush(); // 不等缓冲区存满，直接将缓冲区中残留的数据输出到硬盘中

        // 关闭流，一般本着先开后关，后开先关的原则
        bo.close();
        br.close();
    }
}