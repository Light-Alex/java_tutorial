package day08;
/**
 * 测试main方法：
 * 1、先执行javac TestMain.java命令(因为含中文，故要使用-encoding UTF-8) 编译TestMain.java源文件，编译后会生成TestMain.class字节码文件
 * 2、通过java TestMain 123 21 a as 运行该字节码文件，123 21 a as 实参会传入args形参中，相当于String[] args = {"123", "21", "a", "as"}
 * 
 * @author ycx
 */
public class TestMain {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}