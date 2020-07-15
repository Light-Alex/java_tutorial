package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 标准输入和输出流 System.in System.out
 * 
 * @author ycx
 */
public class Test3 {
    public static void main(String[] args) {
        // // 测试标准输入流
        // try {
        // Test3.testSystemIn();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // // 测试writeToTxt()方法
        // try {
        // Test3.writeToTxt();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // 测试testUser()方法
        try {
            Test3.testUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 标准的输入流
     * 
     * @throws Exception
     */
    public static void testSystemIn() throws Exception {
        // 创建一个转换流，将标准字节输入流转化为字符输入流，System.in 的返回值类型 是InputStream(字节输入流)
        InputStreamReader is = new InputStreamReader(System.in);

        // 把字符输入流放入缓冲流中
        BufferedReader br = new BufferedReader(is);

        String str = ""; // 定义一个临时接收数据的字符串

        while ((str = br.readLine()) != null) { // 一行一行的读取数据，将读取到的数据 赋值给 字符串str
            System.out.println(str);
        }

        // 关闭流
        br.close();
        is.close();
    }

    /**
     * 把控制台输入的内容写到指定的TXT文件中，当接收到字符串over，就结束程序的运行
     */
    public static void writeToTxt() throws Exception {
        // 创建一个转换流，将标准字节输入流(键盘输入)转化为字符输入流，System.in 的返回值类型 是InputStream(字节输入流)
        InputStreamReader is = new InputStreamReader(System.in, "gbk");

        // 将字符输入流放入缓冲流中
        BufferedReader br = new BufferedReader(is);

        // 创建一个缓冲字符输出流，用于将键盘输入的数据输出到指定的文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("day13/tt7.txt"));

        String line = "";

        while ((line = br.readLine()) != null) {
            if (line.equals("over")) {
                break;
            }
            // 读取到的每一行数据都写到指定的txt文件中
            bw.write(line);
        }

        // 不等缓冲区存满，直接将缓冲区中的数据写到硬盘中
        bw.flush();

        // 关闭流
        bw.close();
        br.close();
        is.close();
    }

    /**
     * 在一个TXT文件中，写一组用户名和密码，通过控制台输入用户名和密码，与TXT文件中的用户名和密码做对比，如果一样就打印登录成功，如果不一致就打印用户名密码错误
     * 
     * @author ycx
     * @throws Exception
     */
    public static void testUser() throws Exception {
        // 创建一个缓冲字符输入流读取tt8.txt文件中的数据
        BufferedReader br1 = new BufferedReader(new FileReader("day13/tt8.txt"));

        // 创建一个缓冲字符输入流读取标准输入 System.in 中的数据，System.in的返回值类型是InputStream(字节输入流) new InputStreamReader() 将字节输入流转换为字符输入流
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String s1 = ""; // 存储每次读取到的tt8.txt中的数据
        String s2 = ""; // 存储每次读取到的标准输入中的数据

        boolean flag = true; // 标识符，标识用户名和密码是否一致，默认为一致

        while((s1 = br1.readLine()) != null && (s2 = br2.readLine()) != null) {
            if(!s1.equals(s2)) {
                flag = false;
            }
        }

        if(flag){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
}