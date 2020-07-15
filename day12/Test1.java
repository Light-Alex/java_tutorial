package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test1 {
    public static void main(String[] args) {
        // 测试文件字节输入流
        Test1.testFileInputStream();

        // 测试文件字节输出流
        Test1.testFileOutputStream();

        // 测试拷贝函数copyFile(String sourcePath, String targetPath)
        Test1.copyFile("day12/tt3.txt", "day12/cc/tt3.txt");
        Test1.copyFile("day12/Captcha.jpg", "day12/cc/Captcha.jpg");
    }

    /**
     * 文件字节输入流(本体是内存，从文件到内存，所以叫输入) FileInputStream
     */
    public static void testFileInputStream() {
        try {
            // 定义一个文件字节输入流获取文件中的内容
            FileInputStream in = new FileInputStream("day12/tt2.txt");
            
            byte[] b = new byte[10]; // 设置一个byte数组接收读取的文件中的内容, 只能获取到10字节的数据

            int len = 0; // 设置一个读取数据的长度

            // read()方法有一个返回值，返回值是读取的数据的长度，如果读取到最后一个数据，还会向后读一个，这个时候返回值是-1, 也就意味着当in.read()的返回值是-1的时候整个文件就读取完毕了
            // in.read(b);  // 将tt2.txt文件中读取到内容存储到b字节数组中

            while((len = in.read(b)) != -1){
                System.out.println(new String(b, 0, len)); // 参数1是缓冲数据的字节数组，参数2是从数组中哪个位置开始转化字符串，参数3是总共转化多少个字节
                // aaazzzss11
                // 13421
            }

            // System.out.println(new String(b));

            in.close(); // 注意：流在使用完后一定要关闭

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件字节输出流(本体是内存，从内存到文件，所以叫输出) FileOutputStream
     */
    public static void testFileOutputStream() {
        try {
            FileOutputStream out = new FileOutputStream("day12/tt3.txt");
            String str = "asdasfafasgdsgda123124a";

            // 把数据写到内存
            out.write(str.getBytes()); // str.getBytes()将字符串转化为字节数组

            // 数据先传入缓冲区，塞满后一块传入硬盘，重复多次，若最后一组数据没有塞满缓冲区，则会残留，此时close就会丢失数据，所以要flush手动传输一次数据，清空缓冲区
            // 即flush就是把缓冲区中残留的数据传到硬盘中
            out.flush();

            out.close(); // 注意：流在使用完后一定要关闭

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 拷贝文件到指定位置
     * @param sourcePath 源文件路径
     * @param targetPath 目标文件路径
     */
    public static void copyFile(String sourcePath, String targetPath) {
        try {
            FileInputStream in = new FileInputStream(sourcePath);  // 读取源文件
            
            FileOutputStream out = new FileOutputStream(targetPath); // 保存到哪里

            int len = 0; // 获取的字节长度

            byte[] b = new byte[100];  // 定义一个byte数组来接收读取的文件内容

            while((len = in.read(b)) != -1){
                out.write(b, 0, len); // 将byte数组中的数据传入缓冲区，参数1是缓冲数组(即字节数组b)，参数2是数组读取的起始位置，参数3是读取数组的长度
            }

            // 数据先传入缓冲区，塞满后一块传入硬盘，重复多次，若最后一组数据没有塞满缓冲区，则会残留，此时close就会丢失数据，所以要flush手动传输一次数据，清空缓冲区
            // 即flush就是把缓冲区中残留的数据传到硬盘中
            out.flush();

            out.close();
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}