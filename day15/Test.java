package day15;

public class Test {
    public static void main(String[] args) {
        Thread t0 = new TestThread(); // 继承Thread类的线程
        t0.start(); // 启动线程, 开始运行run()方法中的代码

        Thread t1 = new TestThread(); // 继承Thread类的线程
        t1.start(); // 启动线程, 开始运行run()方法中的代码

        // Thread t3 = new Thread(new TestRunnable(), "t-1");
        // t3.start();
        // Thread t4 = new Thread(new TestRunnable(), "t-2");
        // t4.start();

        // 多个线程可以共享同一个接口实现类的对象，非常适合多个相同线程来处理同一份资源(一般使用实现接口方式来实现多线程)
        Runnable run = new TestRunnable();
        Thread t3 = new Thread(run, "t-1");
        t3.start();
        Thread t4 = new Thread(run, "t-2");
        t4.start();

        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        /**
         * 多次运行这个main方法之后
         * 发现main方法中打印的4行与开启线程运行run()方法中的打印语句是混合起来的
         * 而且main方法中的打印与run方法中打印语句顺序是不固定的
         * 为什么？
         * main执行t0.start()方法开启多线程之后，就相当于在main方法之外开启一个支流
         * 这个时候t0.start()之后的main方法的其他代码的运行就与run方法运行无关了
         * 以当前代码为例：
         * t0.start()之后的main方法的其他代码与run方法的代码并行运行
         * 就像两条河流一样，各走各的
         * 那么控制台输出的结果就是两条并行程序的运行结果总和，这个结果需要拆开成两部分看
         * 就可以看到，各自是保持自己输出顺序的
         * 这个就是多线程的异步，这个异步是相对于t0.start()的主程序来说的
         * 简单来说，开启了线程之后run()方法中运行的代码和主程序中t0.start()之后的程序是并行执行的，没有先后关系，这个叫异步
         */
    }
}