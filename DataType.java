/**
 * 数据类型类，测试成员变量默认初始值
 * @author ycx
 * 
 */
public class DataType {
    public byte a1;
    public short a2;
    public int a3;
    public long a4;
    public float a5;
    public double a6;
    public char a7;
    public boolean a8;
    public String a9;
    
    /**
     * 显示各个数据类型变量的值
     */
    public void showInfo(){
        System.out.println("byte：" + a1);
        System.out.println("short：" + a2);
        System.out.println("int：" + a3);
        System.out.println("long：" + a4);
        System.out.println("float：" + a5);
        System.out.println("double：" + a6);
        System.out.println("char：" + a7);
        System.out.println("boolean：" + a8);
        System.out.println("String：" + a9);
    }
}