package day09;
/**
 * 内部类
 * @author ycx
 */
public class Test3 {
    int i;
    public int z;
    private int k;

    // 内部类
    class A{
        // 内部类可以有自己的属性
        int i;

        public void setTest3Fields(){
            // 设置外部类的属性
            Test3.this.i = 1;
            Test3.this.z = 2;
            Test3.this.k = 3;
        }

        public void set(){
            // 设置内部类的属性
            this.i = 10;
        }
    }

    public void setInfo(){
        // 调用内部类的方法
        // 外部类要使用自己内部类的方法，得先new内部类的对象
        new A().setTest3Fields();
    }

    public void showInfo(){
        System.out.println(this.i);
        System.out.println(this.z);
        System.out.println(this.k);
    }

}