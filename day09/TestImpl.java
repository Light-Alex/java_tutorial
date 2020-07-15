package day09;
/**
 * 实现接口
 * 子类继承父类，只能继承一个父类
 * 类可以实现多个接口，多个接口用, 分隔
 */
public class TestImpl implements TestIn, TestIn1{

    @Override
    public void test1() {
        // 重写TestIn1接口中的test1()方法
    }

    @Override
    public void test() {
        // 重写TestIn接口中的test()方法
    }
    
}