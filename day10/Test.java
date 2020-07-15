package day10;
/**
 * 数组越界异常 java.lang.ArrayIndexOutOfBoundsException
 * 空指针异常 java.lang.NullPointerException
 * 错误运算异常 java.lang.ArithmeticException: / by zero
 * @author ycx
 * 
 */
public class Test {
    public static void main(String[] args) {
        // // 数组越界异常 java.lang.ArrayIndexOutOfBoundsException
        // String[] strs = new String[]{"a", "b", "c"}; 

        // for(int i = 0; i < 4; i++){ // 0, 1, 2, 3, strs没有第4个元素，即str[3]是不存在的
        //     // java.lang.ArrayIndexOutOfBoundsException: 3 数组越界，数组长度为3
        //     System.out.println(strs[i]);
        // }

        // // 空指针异常
        // // A a = new A();
        // A a = null; // 在这块，引用变量a没有指向任何对象，指向是null，什么都没有，自然就没有i的值
        // // java.lang.NullPointerException 空指针异常
        // System.out.println(a.i);

        // // 错误运算异常
        // int i = 0;
        // // java.lang.ArithmeticException: / by zero
        // try { // 用try{}来括住一段有可能出现异常的代码段
        //     System.out.println(3 / i); // 由于异常，程序中断，可使用异常处理机制防止程序的终止
        // }catch(Exception e){ // 当不知道捕获的是什么类型的异常时，可以直接使用所有异常的父类Exception 对象的多态，向上转型
        //     e.printStackTrace(); // 打印异常的信息
        //     System.out.println(e.getMessage()); // 打印异常类型中的详细信息
        // }finally{ // 这个finally可写可不写，是捕获异常体系中最终一段会执行的部分, 不管出没出现异常，最终都会运行该部分的代码，io操作和JDBC会经常用到
        //     System.out.println(4);
        // }
        // System.out.println("ok");
        
        // 可写多个catch捕获多个异常
        String[] strs = new String[]{"a", "b"};
        A a = null;
        // 在捕获异常的代码中(try{}里的代码)，如果前面的代码有异常，就不会执行后面的代码了
        try{
            System.out.println(strs[2]);
            System.out.println(a.i);
        }catch(ArrayIndexOutOfBoundsException e1){
            System.out.println(e1.getMessage());  // 2
        }catch(NullPointerException e2){
            System.out.println(e2.getMessage()); // null
        }
    }
}

class A {
    int i;
}