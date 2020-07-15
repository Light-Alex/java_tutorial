package day11;

public class Test2 {
    public static void main(String[] args) {
        // // 测试泛型接口的实现类B1
        // B1<Object> b1 = new B1<Object>();
        // B1<String> b2 = new B1<String>();

        // // 测试泛型接口的实现类B2
        // B2 b3 = new B2();
        // // B2<Integer> b3 = new B2<Integer>(); // 编译错误，已经指定了泛型的类，在 new 对象时 再定义泛型会编译错误

        // 测试泛型方法
        Cc<Object> c = new Cc<Object>();
        c.test("xxx"); 
        // 泛型方法，在调用之前没有固定的数据类型
        // 在调用时，传入的参数是什么类型，就会把泛型改成什么类型
        // 也就是说，泛型方法会在调用时，根据传入实参类型确定泛型的数据类型
        Integer i = c.Test1(2);    // 传入参数是Integer类型，泛型就固定成Integer类型，返回值就是Integer类型
        Boolean b = c.Test1(true); // 传入参数是Boolean类型，泛型就固定成Boolean类型，返回值就是Boolean类型
        c.test2("a", "b"); // a b
    }
}

interface TB<T> {
    T test(T t);
}

/**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需要将泛型的声明也一起加到类中
 * @author ycx
 * @param <T>
 */
class B1<T> implements TB<T> {

    @Override
    public T test(T t) {
        return t;
    }

}

/**
 * 如果实现接口时，指定了接口泛型的具体类型 String
 * 这个类实现接口所有方法的位置都要将 类型T 替换成具体的数据类型String
 * @author ycx
 */
class B2 implements TB<String> {

    @Override
    public String test(String t) {
        return t;
    }
    
}

class Cc<E> {

    private E e;
    // public static E b; // 编译错误, 不能定义泛型类型的静态变量

    /**
     * 静态方法的泛型方法
     * @param <T>
     * @param t
     */
    public static <T> void test3(T t){
        // System.out.println(this.e); // 静态方法不能访问非静态的变量
        System.out.println(t);
    }

    /**
     * 无返回值的泛型方法
     * @param <T>
     * @param s
     */
    public <T> void test(T s) {
        // 在类上定义的泛型，可以在普通方法中使用
        System.out.println(this.e);
        T t = s;
    }

    /**
     * 有返回值的泛型方法
     * @param <T>
     * @param s
     * @return
     */
    public <T> T Test1(T s) {
        return s;
    }

    /**
     * 形参为可变参数的泛型方法
     * @param <T>
     * @param strs
     */
    public <T> void test2(T... strs) {
        for(T s : strs) {
            System.out.println(s);
        }
    }
}