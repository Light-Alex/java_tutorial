package day15;

public class Test2 {
    public static void main(String[] args) {
        // 定义账户对象
        Account a = new Account();
        // Account a1 = new Account();

        // 多线程对象
        User u_weixin = new User(a, 2000);
        User u_zhifubao = new User(a, 2000);
        // User u_zhifubao = new User(a1, 2000);

        Thread weixin = new Thread(u_weixin, "微信");
        Thread zhifubao = new Thread(u_zhifubao, "支付宝");

        weixin.start();
        zhifubao.start();
    }
}

class Account {
    public static int money = 3000; // 静态变量，所有操作共享这个变量

    /**
     * 提款，判断账户钱够不够 多线程调用这个方法，就有问题，线程共享资源时，一个线程在执行这个方法没有完毕时，另一个线程又开始执行这个方法
     * 解决办法：先让一个线程整体执行完这个方法，另一个线程再执行 通过synchronized同步锁来完成 可以直接在方法上加上synchronized关键字
     * 注意： 1、在普通方法上加同步锁synchronized
     * 锁的是整个对象，不是某一个方法，不同的对象就是不同的锁，普通方法加synchronized，线程使用不同的此方法的对象，还是有共享资源的问题
     * 2、静态的方法加synchoronized，对于所有的对象都是使用同一个锁
     * 
     * @param m
     */
    public synchronized void drawing(int m) {
        String name = Thread.currentThread().getName();

        if (money < m) {
            System.out.println(name + "操作，账户金额不足：" + money);
        } else {
            System.out.println(name + "操作，账户原有金额：" + money);
            System.out.println(name + "操作，账户取款金额：" + m);

            System.out.println(name + "操作，取款操作：原金额" + money + "-" + "取款金额" + m);
            money = money - m;
            System.out.println(name + "操作，取款后的余额：" + money);
        }

    }

    /**
     * 对代码块加入同步锁
     * 
     * @param m
     */
    public synchronized void drawing1(int m) {

        // 用this锁代码块代表当前的对象, 如果在其他方法中也有synchronized(this)的代码块，使用的也是同一个同步锁
        synchronized (this) { // 表示当前对象的代码块被加了 synchronized 同步锁
            String name = Thread.currentThread().getName();

            // 如果是微信操作，先不执行，等支付宝操作完，微信再继续操作

            if (money < m) {
                System.out.println(name + "操作，账户金额不足：" + money);
            } else {
                System.out.println(name + "操作，账户原有金额：" + money);
                System.out.println(name + "操作，账户取款金额：" + m);

                System.out.println(name + "操作，取款操作：原金额" + money + "-" + "取款金额" + m);
                money = money - m;
                System.out.println(name + "操作，取款后的余额：" + money);
            }

        }

    }

    /**
     * synchronized修饰代码块，想要根据不同的对象有不同的锁 synchronized(a)，这个小括号中传入不同的对象就是不同的锁
     * 
     * @param m
     * @param a
     */
    public synchronized void drawing2(int m, Account a) {

        // 不同的对象有不同的同步锁
        synchronized (a) { // 表示当前对象的代码块被加了 synchronized 同步锁
            String name = Thread.currentThread().getName();

            if (name.equals("微信")) {
                try {
                    a.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if(money < m){
                System.out.println(name +  "操作，账户金额不足：" + money);
            }else{
                System.out.println(name +  "操作，账户原有金额：" + money);
                System.out.println(name +  "操作，账户取款金额：" + m);
                
                System.out.println(name +  "操作，取款操作：原金额" + money + "-" + "取款金额" + m);
                money = money - m;
                System.out.println(name +  "操作，取款后的余额：" + money);
            }

            if(name.equals("支付宝")) {
                // a.notify(); // 唤醒当前优先级最高的线程，进入就绪状态
                a.notifyAll(); // 唤醒当前所有的线程，进入就绪状态
            }
        }

    }
}

class User implements Runnable{
    Account account;
    int money;

    public User(Account account, int money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        // this.account.drawing(this.money);
        // this.account.drawing1(this.money);

        // if(Thread.currentThread().getName().equals("weixin")){
        //     this.account.drawing(this.money);
        // }else{
        //     this.account.drawing1(this.money);
        // }

        this.account.drawing2(this.money, this.account);
    }
    
}