package day12;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        // 注意：反斜杠\是文件中路径的分隔符，但是在java编程中一个反斜杠\的意思是转义符，在java中\\或者是正斜杠/才是文件的分隔符
        File f = new File("E:\\java_workspace\\java_tutorial\\day12\\tt.txt"); // 这个时候对象f就是tt.txt文件, 传入参数是tt.txt文件的绝对路径
        // File f1 = new File("E:/java_workspace/java_tutorial/tt.txt"); // 文件分隔符，正斜杠/
        // File f2 = new File("D:" + File.separator + "java_workspace" + File.separator
        // + "java_tutorial" + File.separator + "tt.txt"); //
        // 也可以使用File.separator作为文件的分隔符
        // File f3 = new File("E:\\java_workspace", "java_tutorial\\tt.txt"); //
        // 这个时候对象f2也是tt.txt文件, 传入参数是tt.txt文件的父路径和子路径

        File f4 = new File("E:\\java_workspace\\java_tutorial"); // 获取目录的文件对象

        // 获取当前文件的文件名
        System.out.println(f.getName()); // tt.txt
        System.out.println(f4.getName()); // java_tutorial

        // 获取文件路径
        File f5 = new File("Test.java");
        System.out.println(f5.getPath()); // Test.java，获取文件的路径，就是new file时写的路径
        System.out.println(f5.getAbsolutePath()); // E:\java_workspace\java_tutorial\Test.java，获取当前文件的绝对路径

        System.out.println(f5); // Test.java
        System.out.println(f5.getAbsoluteFile()); // E:\java_workspace\java_tutorial\Test.java, 获取当前文件通过绝对路径构建的file对象

        System.out.println(f5.getParent()); // null, 获取当前文件或目录的父级路径

        // 给文件或目录重命名
        // f.renameTo(new File("E:\\java_workspace\\java_tutorial\\tt1.txt"));

        System.out.println(f.exists()); // true, 判断文件或目录是否存在
        System.out.println(f.canRead()); // true，判断文件是否可读
        System.out.println(f.canWrite()); // true，判断文件是否可写

        System.out.println(f.isFile()); // true，判断当前的file对象是不是一个文件
        System.out.println(f.isDirectory()); // false，判断当前的file对象是不是一个目录

        System.out.println(f.lastModified()); // 1592880663161, 获取文件的最后修改时间，返回的是一个毫秒数(ms)，从1970年1月1日到现在所花的时间
        System.out.println(f.length()); // 0, 返回文件的长度，单位是字节(bytes)
        System.out.println(new Date(f.lastModified())); // Tue Jun 23 10:51:03 CST 2020, 将最后修改时间改成当前时间

        File f6 = new File("day12/tt2.txt");
        System.out.println(f6.exists()); // false, 判断文件是否存在
        if (!f6.exists()) {
            try {
                f6.createNewFile(); // 创建新文件
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // f6.delete(); // 删除文件

        File f7 = new File("day12/cc");
        f7.mkdir(); // 创建单层目录，如果使用这一方法来创建多层目录，就一层一层的执行mkdir()

        File f8 = new File("day12/a/b/c");
        f8.mkdirs(); // 创建多层目录

        File f9 = new File("day12");
        String[] fl = f9.list(); // 获取当前目录下的文件名称(String类型)，包括文件和目录
        System.out.println(fl); // [Ljava.lang.String;@7852e922，打印fl字符串数组的首地址
        for(String s : fl){
            System.out.println(s);
            // a
            // cc
            // Test.java
            // tt.txt
            // tt2.txt
        }

        String[] ff = {"1", "123"};
        System.out.println(ff); // [Ljava.lang.String;@4e25154f，打印ff字符串数组的首地址

        File[] fs = f9.listFiles(); // 获取当前目录下的文件对象(File类型)，包括文件和目录
        for(File fss : fs){
            System.out.println(fss);
            // day12\a
            // day12\cc
            // day12\Test.java
            // day12\tt.txt
            // day12\tt2.txt
        }

        // 遍历day12目录下的所有文件，使用递归实现
        System.out.println("----------------");
        new Test().traversalFiles(f9);
        // 结果：
        // E:\java_workspace\java_tutorial\day12是一个目录
        // E:\java_workspace\java_tutorial\day12\a是一个目录
        // E:\java_workspace\java_tutorial\day12\a\b是一个目录
        // E:\java_workspace\java_tutorial\day12\a\b\c是一个目录
        // E:\java_workspace\java_tutorial\day12\cc是一个目录
        // E:\java_workspace\java_tutorial\day12\Test.java是一个文件
        // E:\java_workspace\java_tutorial\day12\tt.txt是一个文件
        // E:\java_workspace\java_tutorial\day12\tt2.txt是一个文件


    }

    /**
     * 递归遍历文件
     * @param file
     */
    public void traversalFiles(File file) {
        if(file.isFile()){
            System.out.println(file.getAbsolutePath() + "是一个文件");
        }else{
            System.out.println(file.getAbsolutePath() + "是一个目录");

            File[] files = file.listFiles();  // 获取当前目录下的子目录和文件的file对象
            if(files != null && files.length > 0){
                for(File f : files){
                    traversalFiles(f); // 递归调用自身的方法
                }
            }
            
        }
    }
}