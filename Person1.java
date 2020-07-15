/**
 * 变量的分类：成员变量、局部变量
 * 成员变量：在方法体外，类体内声明的变量，有默认值
 * 局部变量：在方法体内部声明的变量，无默认值，每次必须显示初始化，声明时不指定权限修饰符
 * 
 * 成员变量：实例变量(不用static修饰)、类变量(用static修饰)
 * 局部变量：形参(在方法签名中定义的变量)、方法局部变量(在方法内定义)、代码块局部变量(在代码块内定义)
 */
public class Person1 {

    // 成员变量
    // 修饰符可以用来修饰变量，可以指明变量是公有的还是私有的，私有变量不能通过 对象.属性 的方式调用
    public String name = "zhangsan"; // 通过public(公有的)修饰符修饰，这样的实例变量可以在类的外部使用，也可以在本类的方法中使用
    private int age; // 通过private(私有的)修饰符修饰，可以在本类的方法中使用，不能在类的外部使用

    // 实例变量：指类实例化成对象后才能使用的变量(不用static修饰)
    String address;

    // 类变量：直接通过 类名.属性 的方式就可以调用，不需要类实例化成对象(用static修饰)
    public static String gender = "男";

    // 局部变量
    public void play(String ball){ //形参
        int b; // 方法局部变量(在方法内定义)
        System.out.println("打的球是" + ball);
        System.out.println(age); // 私有变量age只能在本类的方法中使用
    }

    {
        // 这就是代码块
        int i = 0; // 代码块局部变量(在代码块内定义)
    }

    // 方法只有在被调用后才会被执行
    public int getArea(int x, int y){
        play("篮球"); // 方法中可以调用方法
        // 同一个类中，所有方法可以直接互相调用，不用new去实例化一个对象
        // 在main方法中，方法有static修饰符的可以直接调用，否则必须实例化
        // public void xxx(){} 方法中不能再定义方法
        return x * y;
    }
}