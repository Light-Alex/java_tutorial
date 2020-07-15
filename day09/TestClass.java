package day09;
/**
 * 测试类
 * @author ycx
 */
public class TestClass {
    public static void main(String[] args) {
        // // 测试Dog类，Dog类继承了抽象类Animal
        // // new Dog().move();
        // new Dog().test();

        // // 测试模板方法设计模式(TemplateMethod)中的类TestTmp
        // new TestTmp().getTime();

        // // 测试描述“会唱歌的厨子是一个老师”的类Teacher
        // Teacher t = new Teacher();
        // t.setInfo();
        // t.showInfo();
        // t.fry();
        // t.singing();

        // // 接口也能向上转型，只能使用接口中定义的方法(方法是子类重写(覆盖)的父类的方法)和属性
        // Cooking c = new Teacher();
        // c.fry(); // null老师拿手的厨艺是炒菜
        // Singing s = new Teacher();
        // s.singing(); // null老师擅长美声唱法

        // // 测试工厂方法模式
        // BWM b3 = new BWM3Factory().productBWM(); // 生产宝马3系车
        // b3.showInfo(); // 这个是宝马3系车

        // BWM b5 = new BWM5Factory().productBWM();
        // b5.showInfo();

        // BWM b7 = new BWM7Factory().productBWM();
        // b7.showInfo();
    }
}