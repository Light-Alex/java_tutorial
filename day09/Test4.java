package day09;

/**
 * 现在类A想同时获得类B和类C的方法，并且重写 ---- 可以使用内部类来变相的实现内部类的多重继承，可以同时继承多个类
 * @author ycx
 */
public class Test4 {
    public static void main(String[] args) {
        // 测试类A
        A a = new A();
        a.testB();
        a.testC();

        // // 访问内部类的方式
        // // 方式一：通过外部类的实例，得到内部类的实例
        // A a1 = new A(); // 外部类
        // A.InnerB b1 = a1.new InnerB(); // 内部类不能被private修饰符修饰(即不能是私有的)
        // b1.testB();

        // // 方式二：通过外部类的getInnerB方法得到内部类实例
        // A a2 = new A(); // 外部类
        // A.InnerB b2 = a2.getInnerB(); // 内部类不能被private修饰符修饰(即不能是私有的)
        // b2.testB();
    }
}

class A {
    public void testB() {
        new InnerB().testB();
    }

    public void testC() {
        new InnerC().testC();
    }

    private class InnerB extends B {
        @Override
        public void testB() {
            System.out.println("这是重写之后的testB方法");
        }
    }

    private class InnerC extends C {
        @Override
        public void testC() {
            System.out.println("这是重写之后的testC方法");
        }
    }

    // 返回内部类对象 new InnerB()
    public InnerB getInnerB(){
        return new InnerB();
    }
}

class B {
    public void testB(){

    }
}

class C {
    public void testC(){
        
    }
}