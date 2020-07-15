/**
 * 子类会继承父类的构造方法
 * 子类中所有的构造器默认都会访问父类中空参数的构造器
 */
package day07;

public class Cylinder extends Circle{

    // // 调用父类的无参构造器
    // public Cylinder(){
    //     this.length = 1;
    // }

    // 当父类只有有参构造器可以使用的时候，子类必须显式的构建一个构造器来调用父类的有参构造器，并且调用父类的构造方法需要写在第一行
    // public Cylinder(double radius) {
    //     super(radius);
    // }

    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        double area = this.findArea();
        return area * length;
    }

    public static void main(String[] args) {
        Cylinder cy = new Cylinder(); // 会调用父类中的空参数构造器 radius = 3
        System.out.println("radius:" + cy.getRadius());
        System.out.println("length:" + cy.getLength());
        System.out.println(cy.findVolume());

        // Cylinder cy = new Cylinder(1); 
    }
}