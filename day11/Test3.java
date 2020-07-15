package day11;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        // // 测试通配符<?>
        Dd d = new Dd();
        // List<String> l1 = new ArrayList<String>();
        // d.test(l1);

        // List<Integer> l2 = new ArrayList<Integer>();
        // d.test(l2);

        // 测试有限制的通配符<? extends C1>
        List<C1> lc = new ArrayList<C1>();
        d.test1(lc);

        List<D1> ld = new ArrayList<D1>();
        d.test1(ld);

        // List<B1> lb = new ArrayList<B1>();
        // d.test1(lb); // 编译错误，list的元素数据类型只能是C1及其子类 <? extends C1>

        d.test2(lc);
        List<A1> la = new ArrayList<A1>();
        d.test2(la);

        // d.test2(ld); // 编译错误，list的元素数据类型只能是C1及其父类 <? super C1>

        List<IAImpl> lia = new ArrayList<IAImpl>();
        d.test3(lia);

        // d.test3(A1); // 编译错误，list的元素数据类型只能是接口IA的实现类 <? extends IA>
    }
}

class Dd {
    public void test(List<?> list){ // list集合中元素的数据类型不确定, 可使用通配符?

    }

    public void test1(List<? extends C1> list) { //list参数的元素数据类型是C1及其子类

    }

    public void test2(List<? super C1> list) { //list参数的元素数据类型是C1及其父类

    }

    public void test3(List<? extends IA> list) { //list参数的元素数据类型是IA的实现类

    }
}

class A1{}

class B3 extends A1 {}

class C1 extends B3 {}

class D1 extends C1 {}

interface IA {}

class IAImpl implements IA {}