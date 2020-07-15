package day08;

public class Chinese {

    int a;

    public Chinese(){
        Chinese.count ++;
    }

    public static int count; // 计数，统计实例化了多少个Chinese类型的对象

    public static void showCount(){
        System.out.println("总共new了" + Chinese.count + "个对象");
    }
}