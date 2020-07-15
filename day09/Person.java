package day09;
/**
 * 测试代码块
 */
public class Person {
    protected String name;
    static int age;
    // static TestPerson tp = new TestPerson();

    public Person() {
        this.name = "张三";
        System.out.println("执行的是构造方法");
    }

    // 非静态的代码块
    {
        System.out.println("执行的是非静态的代码块1");
    }

    {
        System.out.println("执行的是非静态的代码块2");
    }

    {
        System.out.println("执行的是非静态的代码块3");
    }

    // 静态代码块
    static {
        // 这里只能使用static(静态)修饰的属性和方法
        age = 1;
        showAge();
        System.out.println("===执行的是静态代码块===");
        // 对静态对象的属性进行初始化
        // tp.name = "";
        // tp.age = 1;
    }

    public static void showAge() {
        System.out.println(age);
    }

    public void test(){
        System.out.println("Person的test方法");
    }
}