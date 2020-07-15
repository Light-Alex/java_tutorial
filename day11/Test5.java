package day11;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        new TestB().test1();

        // @SuppressWarnings: 抑制编译器警告
        @SuppressWarnings({"rawtypes", "unused"})
        List list = new ArrayList();
    }
}

class TestA {
    public void test() {
        
    }
}

class TestB extends TestA {

    @TestAnn(id=100, desc="姓名")
    String name;

    // @Override: 限定重写父类方法，该注解只能用于方法
    @Override
    public void test() {
        // TODO Auto-generated method stub
        super.test();
    }

    // @Deprecated: 用于表示某个程序元素(类，方法等)已过时
    @Deprecated
    public void test1() {

    }
}

@Target(ElementType.FIELD) // 这个注解类是给其他类的属性做注解
@Retention(RetentionPolicy.RUNTIME) // 定义注解的声明周期 RUNTIME表示整个程序运行周期
@Documented // 把注解放入Doc文档中
@interface TestAnn {
    public int id() default 0; // 默认值为0
    public String desc() default ""; // 默认值为""
}