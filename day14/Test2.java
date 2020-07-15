package day14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test2 {
    public static void main(String[] args) {
        ITestDemo test = new TestDemoImpl();
        /**
         * 注意：如果一个对象想要通过被 Proxy.newProxyInstance 方式被代理
         * 那么这个对象的类一定要有相应的接口
         * 就像本例的中 ITestDemo接口 和 实现类TestDemoImpl
         */
        test.test1();
        test.test2();
        System.out.println("==========================");

        /**
         * 需求：
         * 在执行test1()和test2()方法时，需要加入一些东西
         * 在执行方法前打印 test1 或 test2 开始执行
         * 在执行方法后打印 test1 或 test2 执行完毕
         * 打印的方法名要和当时调用方法保持一致
         */

        InvocationHandler handler = new ProxyDemo(test);
        /**
         * Proxy.newProxyInstance(ClassLoader, interfaces, h)
         * 参数1是代理对象的类加载器
         * 参数2是被代理的对象的接口
         * 参数3是代理对象
         * 
         * 返回值就是成功被代理后的对象, 返回值是Object类型，需要根据当时的情况去转换类型
         */
        ITestDemo t = (ITestDemo) Proxy.newProxyInstance(handler.getClass().getClassLoader(), test.getClass().getInterfaces(), handler);

        t.test1();
        System.out.println("----------------------");
        t.test2();
    }
}