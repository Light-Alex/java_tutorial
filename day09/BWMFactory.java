package day09;
/**
 * 汽车生产工厂接口
 * @author ycx
 * 
 */
public interface BWMFactory {
    // 定义一个返回值类型为BWM的抽象方法
    BWM productBWM(); // public abstract BWM productBWM();
}
/**
 * 实现具体车型的生产工厂
 * @author ycx
 * 
 */
class BWM3Factory implements BWMFactory {

    @Override
    public BWM productBWM() {
        System.out.println("生产宝马3系车");
        return new BWM3();
    }
    
}

class BWM5Factory implements BWMFactory {

    @Override
    public BWM productBWM() {
        System.out.println("生产宝马5系车");
        return new BWM5();
    }
    
}

class BWM7Factory implements BWMFactory {

    @Override
    public BWM productBWM() {
        System.out.println("生产宝马7系车");
        return new BWM7();
    }
    
}