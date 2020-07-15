package day11;

public class Test4 {
    public static void main(String[] args) {
        // 测试枚举类，Season.Spring 就是获取一个Season类型的对象
        Season spring = Season.SPRING; // 列出的实例系统会自动添加public static final 修饰
        spring.showInfo();

        Season summer = Season.SUMMER; // 列出的实例系统会自动添加public static final 修饰
        summer.showInfo();

        Season spring1 = Season.SPRING;
        // 每次执行Season.SPRING 获得是相同的对象，说明枚举类中的每个枚举都是单例模式
        System.out.println(spring.equals(spring1)); // true
        spring1.test(); // 这是实现的ITest接口的test方法 --> 调用实现接口的方法
    }
}

enum Season implements ITest {
     // 定义了4个枚举对象, 调用了Season的有参私有构造方法 private Season(String name, String desc)
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "炎炎夏日"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "寒风凛冽");

    private final String name;
    private final String desc;

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public void showInfo() {
        System.out.println(this.name + ": " + this.desc);
    }

    @Override
    public void test() {
        System.out.println("这是实现的ITest接口的test方法");
    }
}

interface ITest {
    void test();
}