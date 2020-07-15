package day08;
/**
 * 懒汉式的单例模式：有人调用getInstance()才实例化一个Single类型的对象，该对象是静态的，暂时懒汉式单例模式有线程安全问题，到多线程时可修复
 * @author ycx
 */
public class Single1 {
    // 先私有化构造方法，让外边不能直接new对象
    private Single1(){

    }

    private static Single1 s1 = null;

    public static Single1 getInstance(){

        if(s1 == null){
            s1 = new Single1();
        }

        return s1;
    }
}