package day09;
/**
 * 模板方法设计模式(TemplateMethod)
 * @author ycx
 */
public abstract class Template {
    public abstract void code();

    public final void getTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();

        System.out.println("code方法执行的时间" + (end - start));
    }
}

class TestTmp extends Template {

    @Override
    public void code() {
        int k = 0;
        for(int i = 0; i < 5000; i++){
            k++;
        }
        System.out.println(k);
    }
    
}