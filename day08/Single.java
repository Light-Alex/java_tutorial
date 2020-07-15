/**
 * 饿汉式的单例模式：不管有没有人调用getInstance()，都先实例化一个Single类型的对象，该对象是静态的
 * @author ycx
 */
package day08;

public class Single {
    // 私有的构造，构造方法私有化，调用这个类的人就不能直接使用new来创建对象
    private Single(){

    }

    // 私有的Single类型的类变量
    private static Single single = new Single();

    public static Single getInstance(){
        return single;
    }
}