package day14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("day14.Student"); // 通过 包名.类名 的字符串，调用Class.forName()方法获取指定类的Class实例

            Class superClass = clazz.getSuperclass(); // 获取父类
            System.out.println("父类：" + superClass.getName()); // day14.Person
            // 父类：day14.Person

            Class[] interfaces = clazz.getInterfaces(); // 获取当前类实现的所有接口
            for (Class c : interfaces) {
                System.out.println("接口：" + c.getName());
            }
            // 接口：day14.Move
            // 接口：day14.Study

            Constructor[] cons = clazz.getConstructors(); // 获取类公有的构造方法

            for (Constructor c : cons) {
                // System.out.println("构造方法名称：" + c.getName()); // 取得方法名称
                // getModifiers()取得方法的修饰符，返回数1代表public，返回数2代表private
                System.out.println("构造方法：" + c.getName() + "的修饰符是：" + c.getModifiers()); // 取得方法名称和方法的修饰符名称

                Class[] paramClazz = c.getParameterTypes(); // 获取构造方法的参数类型，有几个参数，数组元素就有几个

                for (Class pc : paramClazz) {
                    System.out.println("构造方法：" + c.getName() + "的参数类型是：" + pc.getName());
                }
            }
            // 构造方法：day14.Student的修饰符是：1
            // 构造方法：day14.Student的参数类型是：java.lang.String
            // 构造方法：day14.Student的修饰符是：1

            System.out.println("---------------");

            Constructor[] cons1 = clazz.getDeclaredConstructors(); // 获取类的所有构造方法，包括公有的和私有的

            for (Constructor c : cons1) {
                // getModifiers()取得方法的修饰符，返回数1代表public，返回数2代表private
                System.out.println("构造方法：" + c.getName() + "的修饰符是：" + c.getModifiers()); // 取得方法名称和方法的修饰符名称

                Class[] paramClazz = c.getParameterTypes(); // 获取构造方法的参数类型，有几个参数，数组元素就有几个

                for (Class pc : paramClazz) {
                    System.out.println("构造方法：" + c.getName() + "的参数类型是：" + pc.getName());
                }
            }
            // 构造方法：day14.Student的修饰符是：2
            // 构造方法：day14.Student的参数类型是：java.lang.String
            // 构造方法：day14.Student的参数类型是：int
            // 构造方法：day14.Student的修饰符是：1
            // 构造方法：day14.Student的参数类型是：java.lang.String
            // 构造方法：day14.Student的修饰符是：1

            // 如何用反射的构造方法来创建对象
            try {
                Object obj = clazz.newInstance();  // 调用 Student类的无参公有构造方法
                Student stu = (Student) obj;
                // System.out.println(stu.school);

                Constructor c = clazz.getConstructor(String.class); // 指定获取有一个参数，并且为String类型的公有的构造方法
                Student stu1 = (Student) c.newInstance("第一中学"); // 通过newInstance实例化对象，相当于调用 public Student(String school) 方法
                System.out.println(stu1.school);

                // 通过反射机制可以强制的调用私有的构造方法
                Constructor c1 = clazz.getDeclaredConstructor(String.class, int.class); // 指定获取有两个参数(String, int)的构造方法, private Student(String name, int age)
                // Student stu2 = (Student) c1.newInstance("zhangsan", 12); // java.lang.IllegalAccessException: Class day14.Test1 can not access a member of class day14.Student with modifiers "private"
                c1.setAccessible(true); // 解除私有的封装，下面就可以对这个私有的方法强制调用
                Student stu3 = (Student) c1.newInstance("zhangsan", 12); // 调用的是 private Student(String name, int age)

            } catch (Exception e) {
                e.printStackTrace();
            }

            // Method[] ms = clazz.getMethods(); // 通过反射机制获取类的所有的公有方法
            Method[] ms = clazz.getDeclaredMethods(); // 通过反射机制获取类的所有方法，包括公有方法和私有方法
            for(Method m : ms){
                System.out.println("方法名：" + m.getName());
                System.out.println("返回值类型：" + m.getReturnType());
                System.out.println("修饰符：" + m.getModifiers());

                Class[] pcs = m.getParameterTypes(); // 获取方法的参数类型，是一个数组，方法有几个参数，数组就有几个元素
                if(pcs != null && pcs.length > 0){
                    for(Class pc : pcs){
                        System.out.println("参数类型:" + pc.getName());
                    }
                }
                System.out.println("================================");

            }

            // Field[] fs = clazz.getFields(); // 获取类的公有属性
            Field[] fs = clazz.getDeclaredFields(); // 获取类的所有属性，包括公有和私有属性

            for(Field f : fs){
                System.out.println("修饰符: " + f.getModifiers());
                System.out.println("属性的类型: " + f.getType());
                System.out.println("属性的名称: " + f.getName());
            }

            Package p = clazz.getPackage();
            System.out.println(p.getName());

            /**
             * 注意：下面无论是反射调用setInfo还是test方法都是调用的obj对象的方法，obj对象实际上就是student对象
             */
            Constructor con = clazz.getConstructor(); // 获取无参构造
            Object obj = con.newInstance(); // 调用无参的构造方法创建对象
            Method m = clazz.getMethod("setInfo", String.class, String.class); // 得到名称叫setInfo，参数是String, String的方法
            m.invoke(obj, "zhangsan", "第一中学"); // 参数1是需要实例化的对象，后面的参数是调用当前方法的实际参数

            // 如果想要调用一个私有方法、
            Method m1 = clazz.getDeclaredMethod("test", String.class); // 获取方法名为test，参数为1个String类型的方法
            m1.setAccessible(true); // 解除私有的封装，下面可以强制的调用私有的方法
            m1.invoke(obj, "李四"); // java.lang.IllegalAccessException: Class day14.Test1 can not access a member of class day14.Student with modifiers "private"

            // 调用一个重载方法
            Method m2 = clazz.getMethod("setInfo", int.class); // setInfo的重载方法
            m2.invoke(obj, 1);

            // 有返回值的方法
            Method m3 = clazz.getMethod("getSchool"); // 这是获取方法名为getSchool并且没有参数的方法
            String school = (String) m3.invoke(obj); // 调用有返回值，但是没有参数的方法
            System.out.println(school);

            // 反射创建一个对象
            Constructor con2 = clazz.getConstructor();
            Student stu = (Student) con2.newInstance();

            Field f = clazz.getField("school"); // 获取名称为school的属性
            f.set(stu, "第三中学"); // 对stu对象的school属性设置值，"第三中学"
            String school2 = (String) f.get(stu); // 获取stu对象的school属性的值
            System.out.println(school2);

            // 如果是私有的属性
            Field f1 = clazz.getDeclaredField("privateField");
            f1.setAccessible(true); // 解除私有的封装，下面就可以强制的调用这个属性
            f1.set(stu, "测试私有属性");
            System.out.println(f1.get(stu));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}