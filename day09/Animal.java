package day09;
/**
 * 定义一个抽象类
 * @author ycx
 */
public abstract class Animal {

    int a;
    
    public abstract void test(); // 只要类中有一个抽象方法，类就必须时一个抽象类

    public abstract void move();
}

class Dog extends Animal {

    @Override
    public void test() {
        this.a = 2;
        System.out.println(super.a); // 2
        System.out.println(this.a);  // 2
    }

    @Override
    public void move() {
        System.out.println("狗的移动方式是跑");
    }

}

class Fish extends Animal {

    @Override
    public void test() {

    }

    @Override
    public void move() {
        System.out.println("鱼的移动方式是游");
    }
    
}

abstract class Bird extends Animal { // 抽象类可以继承抽象类

    public abstract void test(); // 只要类中有一个抽象方法，类就必须时一个抽象类

    @Override
    public void move() {
        
    }
}
