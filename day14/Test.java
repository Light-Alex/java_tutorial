package day14;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Class clazz = p.getClass(); // clazz对象中包含了对象p所属的Person类的所有信息

        Class c0 = Person.class; // 通过 类名.class 创建指定类的class实例

        Class c1 = new Person().getClass(); // 通过一个类的实例对象的getClass()方法，获取对应实例对象的类的Class实例

        try {
            // 通过Class的静态方法forName(String className)来获取一个类的class实例
            // forName(String className)方法中的参数是要获取的Class实例的类的全路径(包名.类名)
            Class c2 = Class.forName("day14.Person"); // 这个是获取Class实例的常用方式
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}