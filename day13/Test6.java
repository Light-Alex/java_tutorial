package day13;

import java.io.RandomAccessFile;

/**
 * 文件的随机读写 程序可以直接跳到文件的任意地方来读、写文件
 * 
 * @author ycx
 * 
 */
public class Test6 {
    public static void main(String[] args) {
        // 测试 随机读文件 testRandomAccessFileRead() 函数
        try {
            Test6.testRandomAccessFileRead();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 测试 随机写文件 testRandomAccessFileWrite() 函数
        try {
            Test6.testRandomAccessFileWrite();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 随机读文件
     */
    public static void testRandomAccessFileRead() throws Exception{
        // RandomAccessFile的构造方法有两个参数，参数1是读写文件的路径，参数2是指定 RandomAccessFile 的访问模式
        // 访问模式：
        // r：以只读方式打开(常用)
        // rw：打开以便读取和写入(常用)
        // rwd：打开以便读取和写入；同步文件内容的更新
        // rws：打开以便读取和写入；同步文件内容和元数据的更新

        RandomAccessFile ra = new RandomAccessFile("day13/tt11.txt", "r");

        // ra.seek(0); // 设置读取文件内容的起始点, 单位是字节(bytes)
        ra.seek(5); // 设置读取文件内容的起始点，从而达到从文件任意位置读取的效果

        byte[] b = new byte[1024];

        int len = 0;

        while((len = ra.read(b)) != -1){
            System.out.println(new String(b, 0, len));
        }

        ra.close();
    }

    /**
     * 随机写文件
     */
    public static void testRandomAccessFileWrite() throws Exception{
        RandomAccessFile ra = new RandomAccessFile("day13/tt11.txt", "rw");

        // ra.seek(0); // 设置写的起始点，0代表开头写
        // 注意：如果是在文件开头或者中间的某个位置开始写的话，就会用写的内容覆盖掉等长的原内容
        ra.seek(ra.length()); // 设置写的起始点，ra.length() 返回文件的长度，所以 ra.seek(ra.length()) 代表从文件的结尾开始写，也就是文件的追加

        ra.write("你好！".getBytes());
        ra.close();
    }
}