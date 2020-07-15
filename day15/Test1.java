package day15;

public class Test1 {
    public static void main(String[] args) {
        TestRun run0 = new TestRun();
        TestRun run1 = new TestRun();

        Thread t0 = new Thread(run0);
        Thread t1 = new Thread(run1);

        t0.setName("线程t-0"); // 设置线程的名称
        t1.setName("线程t-1"); // 设置线程的名称

        // t0.setPriority(1); // 设置线程的优先级
        // t1.setPriority(10); // 设置线程的优先级

        t0.start();
        t1.start();

        System.out.println(t0.getName()); // 如果在创建线程的时候没有指定名称，系统会给出默认的名称，通过getName()获取线程的名称(Thread-0、Thread-1...)
        System.out.println(t1.getName());

        System.out.println("t0的优先级：" + t0.getPriority()); // 5, 获取线程的优先级

        System.out.println("t1.isAlive: " + t1.isAlive()); // 判断当前的线程是否存活
        t1.stop(); // 强制线程生命期结束，强制停止此线程

        System.out.println("--------------1");
        System.out.println("--------------2");
        try {
            t0.join();
            /**
             * 专业的说法 就是阻塞当前的main方法，先不执行System.out.println("--------------3");代码
             * 先执行join进来的线程的代码
             * join的线程执行完毕之后继续执行之前main方法阻塞的代码System.out.println("--------------3");
             */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("--------------3");
        System.out.println("t1.isAlive: " + t1.isAlive());
    }
}

class TestRun implements Runnable {

    int count = 0;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":Runnable多线程运行的代码");
        for (int i = 0; i < 5; i++) {

            // try {
            //     Thread.sleep(1000); // 当前线程睡眠1000毫秒
            //     // 相当于当前的这个循环每隔1000毫秒执行一次循环
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // } 

            // if(i % 2 == 0){
            //     Thread.yield(); // 线程让步
            // }
            
            count++;
            System.out.println(Thread.currentThread().getName() + ":这是Runnable多线程的逻辑代码" + count);
        }
    }
    
}