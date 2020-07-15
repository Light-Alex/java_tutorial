/**
 * Person
 * @author ycx
 */
// 定义类: 修饰符 类名
public class Person {

    // /**
    //  * 构造方法
    //  */
    // // 默认的构造方法
    // // 默认的构造方法前面有没有访问的修饰符跟定义的类有关，类是public的，默认的构造方法就是public修饰的，默认的类是缺省的，默认的构造方法就是缺省(不带修饰符)的
    // // new Person() 会调用public Person(){}构造方法
    public Person(){}

    // // 显式的定义构造方法(不带参数)
    // // 如果显式的定义了构造方法，就会使用显式定义的构造方法，不会使用默认的构造方法
    // public Person(){
    //     name = "zhangsan";
    // }

    // 显式的定义构造方法(带参数)
    // 如果显式的定义了构造方法，就会使用显式定义的构造方法，不会使用默认的构造方法
    public Person(String n){
        name = n;
    }

    // 构造方法的重载(overload)
    public Person(int a, String n){
        age = a;
        name = n;
    }

    /**
     * Java中this的作用：
     * 1、当形参与成员变量重名时，如果在方法内部需要使用成员变量，必须添加this来表明该变量是当前类的成员变量与形参进行区分
     * 2、在任意方法内，如果使用当前类的成员变量或成员方法可以在其前面添加this，增强程序的阅读性
     * 3、this可以作为一个类中，构造器相互调用的特殊格式
     * 
     * 注意：
     * 1、this()必须放在构造器的首行
     * 2、使用this调用本类中的其他构造器，不能出现构造器自己调用自己的情况
     */

    public String occupation; //职业

    public Person(int age){
        this.age = age;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public void setOccupation1(String occupation){
        this.setOccupation(occupation);
    }

    public void showInfo(){
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
        System.out.println("职业：" + this.occupation);
    }

    public Person(int age, String name, String occupation){
        this(12, "小明"); //等同于调用public Person(int a, String n)
        // this(); 使用this()必须放在构造器的首行
        this.occupation = occupation;
        /*
        new Person(1, "wangwu", "student").showInfo() 结果:
        姓名：小明
        年龄：12
        职业：student
         */
    }

    // 属性，成员变量，类的成员变量可以先声明，不用初始化，类成员变量有默认值
    // 类型属性：修饰符 属性类型 属性名 初始化值
    String name; // 姓名，String的默认值是null

    // public int age; // 年龄，int的默认值是0，这种情况(public修饰的变量)会把类的属性暴露出来，让调用者随意使用，会有问题

    // 我们需要对这种不能让调用者随意使用的属性做封装和隐藏
    private int age;

    // 行为，方法，也叫函数
    /**
     * 打印姓名
     */
    // 类的方法：修饰符 返回值类型 方法名 形参
    public void showName(){ //驼峰命名法
        System.out.println("姓名: " + name);
    }

    /**
     * 打印年龄
     */
    public void printAge(){
        System.out.println("年龄是：" + age);
    }

    /**
     * 通过方法设置年龄(可以加入条件判断，而不是让调用者随意修改类的属性)
     * @param a
     */
    public void setAge(int a){
        if(a <= 150 && a >= 0){
            age = a;
        }else{
            System.out.println("输入的年龄：" + a + "不在0到150之间");
        }
    }

    /**
     * 获取年龄
     * @return
     */
    public int getAge(){ // 方法定义的数据类型需与返回值类型一致
        return age;
    }

    /**
     * 输出打什么球
     * @param ball
     */
    public void play(String ball){
        System.out.println("打的球是" + ball);
    }


}