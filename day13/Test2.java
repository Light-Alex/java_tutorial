package day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/**
 * 转换流
 * 可以把字节流转换成字符流
 * 当字节流中的数据都是字符的时候，使用转换流转为字符流处理效率更高
 * @author ycx
 */
public class Test2 {
    public static void main(String[] args) {
        // 测试转换输入流
        try {
            Test2.testInputStreamReader();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 测试转换输出流
        try {
            Test2.testOutputStreamWriter();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 转换字节输入流为字符输入流 InputStreamReader
     * InputStreamReader
     * @throws Exception
     */
    public static void testInputStreamReader() throws Exception {
        FileInputStream fs = new FileInputStream("day13/tt5.txt");

        // 把文件字节输入流转换为字符输入流
        InputStreamReader in = new InputStreamReader(fs, "UTF-8"); // 参数1是字节流，参数2是字符集编码
        // InputStreamReader in = new InputStreamReader(fs, "GBK"); // 注意，在转换字符流的时候，设置的字符集编码要与读取的文件的字符集编码一致，不然就会出现乱码

        char[] c = new char[100];  // 定义一个字符数组接收读取到的数据

        int len = 0; // 每次读取到的字符数

        while((len = in.read(c)) != -1){
            System.out.println(new String(c, 0, len));  // 将字符数组转化为字符串并打印，参数1是需要转化的字符数组，参数2是转化的起始位置，参数3是转化的字符数
        }

        // 关闭流
        in.close();
        fs.close();
    }

    /**
     * 转换字节输出流为字符输出流
     * OutputStreamWriter
     * @throws Exception
     */
    public static void testOutputStreamWriter() throws Exception {

        // 定义一个字节输出流对象，传入输出文件路径
        FileOutputStream out = new FileOutputStream("day13/tt6.txt");

        // 将字节输出流转换成字符输出流，传入字节输出流对象的引用，指定编码格式为"UTF-8"
        OutputStreamWriter os = new OutputStreamWriter(out, "UTF-8");

        os.write("你好！hello!123");

        os.flush();

        out.close();
    }
}