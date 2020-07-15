package day09;
/**
 * 宝马车的产品接口
 * @author ycx
 */
public interface BWM {
    // 产品的信息介绍
    void showInfo(); // public abstract void showInfo();
}
/**
 * 构建具体车的类
 * @author ycx
 * 
 */
class BWM3 implements BWM {

    @Override
    public void showInfo() {
        System.out.println("这个是宝马3系车");
    }

}

class BWM5 implements BWM {

    @Override
    public void showInfo() {
        System.out.println("这个是宝马5系车");
    }

}

class BWM7 implements BWM {

    @Override
    public void showInfo() {
        System.out.println("这个是宝马7系车");
    }

}