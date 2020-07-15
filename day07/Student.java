/**
 * 继承
 * 子类的共性代码都继承自父类，每个子类只需写自己的特有代码
 * 
 * @author ycx
 */
package day07;

public class Student extends Person{

    public Student(){
        this.name = "student";
        // System.out.println("student");
    }

    // this.age = 1;
    String school;
    int age; // 定义本类的age，不会覆盖父类的age, 通过this.age访问本类的age, 通过super.age方法父类的age

    // public void showInfo(){
    //     System.out.println(this.age);
    //     System.out.println(this.name);
    //     System.out.println(this.sex);
    //     System.out.println(this.school);
    // }

    // 快捷键 ctrl + /
    @Override // 提示这是重写父类的方法
    public void showInfo() {
        // super.showInfo(); // 调用父类的方法
        System.out.println("以下是student类对Person类的showInfo方法的重写");
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.sex);
    }

    public void getSchool(){
        System.out.println("这是student的getSchool方法");
    }

    public static void main(String[] args) {
        // Student stu = new Student();
        // System.out.println("------");
        // System.out.println(stu.name);
        // stu.showInfo();  // 以下是student类对Person类的showInfo方法的重写

        // Person p = new Person();
        // System.out.println("------");
        // System.out.println(p.name);
        // p.showInfo(); // 以下是Person类的showInfo方法的重写
        
        // Person p2 = new Student();
        // Person p1 = new Person();
        // Person p3 = new Person();
        // System.out.println(p2); // day07.Student@6bf2d08e
        // System.out.println(p1); // day07.Person@5eb5c224
        // System.out.println(p3); // day07.Person@53e25b76
        // p1 = p2;
        // System.out.println("---------------");
        // System.out.println(p1); // day07.Student@6bf2d08e
        // System.out.println(p2); // day07.Student@6bf2d08e
        // System.out.println(p2.equals(p1)); // true
        // System.out.println("------");
        // System.out.println(p2.name);
        // System.out.println(p2.age); // 0
        // p2.showInfo(); // 以下是student类对Person类的showInfo方法的重写
        // System.out.println(p2 instanceof Person);

        Student stu = new Student();
        System.out.println("子类的age:" + stu.age);
        System.out.println("父类的age:" + stu.getSS());
        System.out.println("---------------");
        stu.ss();
        System.out.println("子类的age:" + stu.age);
        System.out.println("父类的age:" + stu.getSS());

        // Student stu1 = (Student) new Person();  //从父类到子类的类型转换必须通过造型(强制类型转换)实现
    }
}