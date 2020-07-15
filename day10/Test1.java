package day10;

import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws Exception{ // 可以在main方法声明中继续抛出异常，main方法抛出的异常直接抛到虚拟机上去了，就不能通过写代码进行捕获处理了

        // // 测试 抛出(throws) 捕获(try catch) 异常
        // B b = new B();
        // try { // 在这里尝试捕获类B中test()方法抛出的异常
        //     b.test();
        // } catch (Exception e) {
        //     e.printStackTrace(); // 捕获到异常，对异常进行处理
        // }

        // // 测试子类重写父类的方法(父类的方法中含异常)
        // new C().test();
        
        // 测试人工抛出的异常
        B b = new B();
        try {
            b.test1(-100); // java.lang.Exception: 年龄在0和150之间
            // b.test2(-100); // day10.MyException: 年龄在0和150之间
        } catch (Exception e){
            e.printStackTrace(); // java.lang.Exception: 年龄在0和150之间
        }
    }
}

class B {
    int i;
    public void test() throws Exception { // 可以使用throws在方法声明中抛出异常，异常类型可以是方法中产生的异常类型，也可以是它的父类(Exception，对象的多态，向上转型)，然后在调用方去捕获处理异常
        B b = null;
        System.out.println(b.i);
    }

    int age;

    public void test1(int age) throws Exception { // throws在方法声明
        if(age >= 0 && age <= 150) {
            this.age = age;
            System.out.println("年龄是：" + this.age);
        }else{
            throw new Exception("年龄在0和150之间"); // 人工抛出异常，throw在方法体
        }
    }

    public void test2(int age) throws MyException { // throws在方法声明
        if(age >= 0 && age <= 150) {
            this.age = age;
            System.out.println("年龄是：" + this.age);
        }else{
            throw new MyException("年龄在0和150之间"); // 使用自定义的异常类MyException
        }
    }
}

class C extends B {
    @Override
    public void test() throws IOException { // 子类方法抛出的异常的范围不能比父类大
        System.out.println("yes");
    }
}

// 自定义异常类
class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}