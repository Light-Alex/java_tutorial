package day09;

public class TestPerson extends Person {
    
    public TestPerson(){
        System.out.println("TestPerson: 构造方法");
    }

    String name;
    int age = 0;
    

    {   
        System.out.println("TestPerson: block");
    }

    static {
        System.out.println("TestPerson : static block");
    }

    public static void showAge(){
        System.out.println("TestPerson: showAge");
    }

    public static void main(String[] args) {
        // TestPerson.showAge();
        // 1
        // ===执行的是静态代码块===
        // TestPerson : static block
        // TestPerson: showAge
        // 非静态的代码块需要new 对象才会执行

        // TestPerson t = new TestPerson();
        // 1
        // ===执行的是静态代码块===
        // TestPerson : static block
        // 执行的是非静态的代码块1
        // 执行的是非静态的代码块2
        // 执行的是非静态的代码块3
        // 执行的是构造方法
        // TestPerson: block
        // TestPerson: 构造方法
    }
}
