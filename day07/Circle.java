package day07;

public class Circle {

    // 无参构造器
    public Circle(){
        this.radius = 3;
    }
    
    // 当存在显示的构造方法时，类就没有默认的无参构造方法了，而是使用显式的构造方法
    public Circle(double radius){
        this.radius = radius;
    }

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double findArea(){
        return 3.14 * this.radius * this.radius;
    }
}