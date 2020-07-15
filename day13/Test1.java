package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        // 测试缓冲字符输入流
        try {
            Test1.testBufferedReader();
            // 123aasdf12aadsda
            // sdadzz
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 测试缓冲字符输出流
        try {
            Test1.testBufferedWriter();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 测试缓冲字符流实现的拷贝函数
        try {
            Test1.copyFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 缓冲字符输入流 BufferedReader
     * 
     * @throws Exception
     */
    public static void testBufferedReader() throws Exception {
        // 定义一个文件字符输入流对象
        FileReader fr = new FileReader("day13/tt.txt");

        // 将文件字符输入流对象的引用传入缓冲字符输入流的构造方法中
        BufferedReader br = new BufferedReader(fr);

        char[] c = new char[100]; // 定义一个字符数组来接收每次读取到的数据

        int len = 0; // 每次读取到的字符数

        while ((len = br.read(c)) != -1) { // 读取到文件最后一个字符下一位，返回值就是-1
            System.out.println(new String(c, 0, len));
        }

        // 关闭流
        br.close();
        fr.close();
    }

    /**
     * 缓冲字符输出流 BufferedWriter
     * 
     * @throws Exception
     */
    public static void testBufferedWriter() throws Exception {

        // 定义一个文件字符输出流对象
        FileWriter fw = new FileWriter("day13/tt3.txt");
        // 定义一个缓冲字符输出流对象，将文件字符输出流对象的引用传入该对象的构造方法中
        BufferedWriter bw = new BufferedWriter(fw);

        // 输出的内容
        String s = "hello World!!!";

        // 将数据输出到缓冲区中，缓冲区装满后再写入到硬盘中
        bw.write(s);

        // 不能缓冲区装满，直接将缓冲区中的数据写入到硬盘中 --> 可将缓冲区中残留的数据写到硬盘中，避免数据丢失
        bw.flush();

        // 关闭流
        bw.close();
        fw.close();
    }

    /**
     * 缓冲字符流拷贝文件
     * @throws Exception
     */
    public static void copyFile() throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("day13/tt3.txt")); // 读取文件路径

        BufferedWriter bw = new BufferedWriter(new FileWriter("day13/tt4.txt")); // 输出文件路径

        char c[] = new char[100];

        int len = 0;

        while((len = br.read(c)) != -1){
            bw.write(c, 0, len);
        }

        bw.flush();

        // 关闭流
        bw.close();
        br.close();
    }
}