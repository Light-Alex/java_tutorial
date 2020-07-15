package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        // 测试文件字符输入流
        Test2.testFileReader("day12/tt3.txt");

        // 测试文件字符输出流
        Test2.testFileWriter("hello world!", "day12/tt4.txt");

        // 测试文本文件拷贝函数
        Test2.copyFile("day12/tt5.txt", "day12/cc/tt5.txt");
    }

    /**
     * 文件字符输入流FileReader
     * 
     * @param sourcePath
     */
    public static void testFileReader(String sourcePath) {
        try {
            FileReader fr = new FileReader(sourcePath);

            char[] c = new char[10]; // 创建临时存数据的字符数组

            int len = 0; // 定义一个输入流的读取长度

            while ((len = fr.read(c)) != -1) {
                System.out.println(new String(c, 0, len));
            }

            fr.close(); // 关闭流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件字符输出流 FileWriter
     * @param text 输出的内容
     * @param targetPath 输出的文件
     */
    public static void testFileWriter(String text, String targetPath) {
        try {
            FileWriter fw = new FileWriter(targetPath);
            
            fw.write(text); // 把数据写到内存中
            fw.flush(); // 把内存中的数据刷到硬盘中
            fw.close(); // 关闭流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件字符流完成文件拷贝(只能拷贝文本文件)
     * @param sourcePath
     * @param targetPath
     */
    public static void copyFile(String sourcePath, String targetPath) {
        try {
            FileReader fr = new FileReader(sourcePath);
            FileWriter fw = new FileWriter(targetPath);

            char[] c = new char[100]; // 定义一个字符数组来接收读取到的数据

            int len = 0; // 每次读取到的字符数

            while((len = fr.read(c)) != -1){ // 读取数据
                fw.write(c, 0, len); // 写数据到内存
            }

            fw.flush(); // 把缓冲区中残留的数据传到硬盘中

            fw.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}