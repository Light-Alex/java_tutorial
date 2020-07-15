package day07;

public class Person {

    public Person(){
        this.name = "person";
        // System.out.println("person");
    }

    int age = -1;
    String name;
    int sex;
    public static String country;

    public void showInfo(){
        System.out.println("以下是Person类的showInfo方法的重写");
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.sex);
    }

    public void ss(){
        this.age = 1;
    }

    public int getSS(){
        return this.age;
    }

    public void test(){
        System.out.println("这是person的test方法");
    }

    public static void test1(){
        System.out.println("这是Person类的静态方法");
    }
}