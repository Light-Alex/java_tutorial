import day07.Student;
import day08.Chinese;
import day08.Order;
import day08.Single;
import day08.Single1;
import day09.Test3;

public class TestClass {

    public static void main(String[] args) {
        // /**
        // * 测试Person类
        // */
        // // 实例化Person类，即创建Person对象
        // Person person = new Person(); //
        // 声明一个Person类型的变量，变量名为person，实例化Person类并且给person赋值
        // // new Person()就是实例化Person类
        // person.name = "张三"; // 给person对象的name属性赋值
        // person.showName(); // 对象方法的调用

        // int i = person.getAge();
        // System.out.println(i);

        // person.age = 11; // 给person对象的age属性赋值
        // int a = person.getAge();
        // System.out.println(a);

        // person.play("篮球");

        // /**
        // * 在main方法中，方法有static修饰符修饰的可以直接调用，否则必须实例化
        // */
        // int area = getArea(12, 14);
        // System.out.println(area);

        // /**
        // * 测试DataType类，查看各种类型的成员变量的默认初始化值
        // */
        // // 当一个对象被创建时，会对其中各种类型的成员变量自动进行初始化赋值
        // /*
        // byte：0
        // short：0
        // int：0
        // long：0L
        // float：0.0F
        // double：0.0D
        // char：'\u0000'(表示为空)
        // boolean：false
        // String：null(引用数据类型)
        // */
        // DataType dataType = new DataType();
        // dataType.showInfo();

        // /**
        // * 匿名对象：不定义对象的句柄，直接调用这个对象的方法，这样的对象叫匿名对象
        // * 适用情况：
        // * 1、一个对象只需要进行一次方法调用
        // * 2、将匿名对象作为实参传递给一个方法调用
        // */
        // new DataType().showInfo();

        /**
         * 类的访问机制： 1、在同一个类中的访问机制：类中的方法可以直接访问类中的成员变量。(例外：static方法只能访问static的成员变量)
         * 2、在不同类中的访问机制：先创建要访问类的对象，再用对象访问类中定义的成员变量(例外：类变量(用static修饰的变量) 可以直接通过 类名.属性名
         * 访问，不用将类实例化为对象)。
         * 
         */

        // /**
        // * 测试 个数可变参数 的方法
        // */
        // TestClass test = new TestClass();
        // // 用数组的方式传递可变个数的参数
        // String ss[] = new String[]{"zhansan", "11"};
        // test.printInfo(ss);
        // String ss1[] = new String[]{"lisi", "12", "beijing"};
        // test.printInfo(ss1);
        // // 定义一个空数组
        // String ss2[] = new String[0];
        // test.printInfo(ss2);

        // // 用...的方式传递可变个数的参数
        // String ss3[] = new String[]{"wangwu", "13", "wuhan"};
        // test.printInfo1(ss2);
        // test.printInfo1("zhongguo");
        // // 不传递参数
        // test.printInfo1();

        /**
         * JVM内存模型 JVM内存：栈static、堆heap、方法区method 栈static：存放基础数据类型、对象的“引用”(对象的地址)
         * 堆heap：所有的对象(包括自己定义的对象和字符串对象) 方法区method：所有的class和static变量
         * 
         * ep: int i = 1 i存放在栈中 i AG84100 1 (变量名 变量在栈中的地址 值) Person p(引用) = new Person()
         * p AG84300 BE95000 (变量名 变量在栈中的地址 对象在堆中的地址) BE95000 new Person()对象 (对象在堆中的地址
         * 对象)
         * 
         * 总结： 基础数据类型，值保存在栈中 引用数据类型，值保存在堆中，栈中存放的是对象在堆中的地址
         */

        // /**
        // * 方法的参数传递-值传递(基本数据类型)
        // *
        // * 结果:
        // * swap 方法里，i的值是6
        // * main方法里，变量a的值是0
        // *
        // * 栈内存：
        // * a AD8500 0 (变量名 变量在栈中的地址 值)
        // * i AD8600 6 (变量名 变量在栈中的地址 值)
        // *
        // * 过程:
        // * 1、先执行int a = 0，在栈中开辟一块内存，地址为AD8500，存的值为0
        // * 2、调用swap方法，执行int i部分，在栈中开辟一块内存，地址为AD8600，值就是从a那里复制过来的值，为0，执行swap方法体里的代码，i =
        // 6，把i中的值再改成6，最后i在栈中的值就是6
        // *
        // * 总结：
        // * 基本数据类型在参数传递过程中，就是把实参的值复制到形参上
        // */
        // int a = 0;
        // swap(a);
        // System.out.println("main方法里，变量a的值是" + a); // 0

        // /**
        // * 方法的参数传递-值传递(引用数据类型)
        // *
        // * 结果：
        // * 在调用swap方法前，ds.a的值是：0
        // * 在swap方法中，ds1.a的值是：6
        // * 在调用swap方法后，ds.a的值是：6
        // *
        // * 栈内存： 堆内存
        // * ds AD9500 BE2500 -> BE2500 new DataSwap()对象
        // * ds1 AD9600 BE2500 /
        // *
        // * 过程：
        // * 1、DataSwap ds = new DataSwap()，把new DataSwap()对象存到了堆内存中，地址为BE2500
        // * 2、ds引用存在栈内存中，地址为AD9500，值是new DataSwap()对象在堆内存中的地址BE2500
        // * 3、调用swap方法，将ds1引用保存在栈内存中，地址为AD9600，值来源于实参ds，也就是ds引用在栈内存中存放的值，即new
        // DataSwap()对象在堆内存中的地址BE2500
        // * 4、到第3步的时候，实际上，引用ds、ds1都指向同一个对象new DataSwap()，即堆内存中地址为BE2500的对象
        // *
        // * 引用(ds、ds1)：存的是对象在堆内存中的地址
        // *
        // * 注意：Java中只有值传递
        // * 总结：这个例子中，ds和ds1实际上操作的是同一个对象，故对象的属性会发生变化
        // */
        // DataSwap ds = new DataSwap();
        // System.out.println("在调用swap方法前，ds.a的值是：" + ds.a); //0
        // swap(ds);
        // System.out.println("在调用swap方法后，ds.a的值是：" + ds.a); //6

        /**
         * 方法的参数传递： 1、如果方法的形参是基础数据类型，那么实参(实际的参数)向形参传递参数时，就是直接传递值，把实参的值复制给形参。
         * 2、如果方法的形参是引用数据类型，那么实参向形参传递参数时，也是把值给形参，这个值是实参在栈内存中的值，也就是对象在堆内存中的地址。
         * 
         * 总结： 基本数据类型保存在栈内存中，引用数据类型在栈内存中保存的是对象的地址，方法的参数传递，传递的是值(即变量在栈内存中的值)
         */

        // /**
        // * 信息的“封装”和隐藏
        // * 概念：Java中通过将数据声明为私有的(private)，再提供公共的(public)方法:
        // getXxx()和setXxx()实现对该属性的操作，以实现以下目的：
        // * 1、隐藏一个类中不需要对外提供的实现细节
        // * 2、使用者只能通过事先制定好的方法来访问数据，可以方便地加入控制逻辑，限制对属性的不合理操作
        // * 3、便于修改，增强代码的可维护性
        // */
        // Person person = new Person();
        // // person.age = -100; // 这样的情况，程序是对的，能执行，但是不符合正常逻辑(正常逻辑，类的属性需要做封装和隐藏)
        // // 通过方法修改类变量(private修饰的变量)
        // person.setAge(12);
        // person.printAge();
        // int age = person.getAge();
        // System.out.println(age);

        /**
         * 四种访问权限修饰符 概念：Java权限修饰符public、protected、private置于类的成员定义之前，用来限定对象对该类成员的访问权限。
         * 修饰符 类内部 同一个包 子类 除了前面情况之外的任何地方 private Yes (缺省) Yes Yes protected Yes Yes Yes
         * public Yes Yes Yes Yes
         * 
         * 对于class的权限修饰符只可以用public和default(缺省，没有权限修饰符)，一个java文件中只可以写一个public修饰符修饰的类(ep:
         * public class test)，但可以写多个缺省的类(ep: class test1) 1、public类可以在任何地方被访问
         * 2、default类只可以被同一个包内部的类访问
         */

        /**
         * 构造器(构造方法)
         * 
         * 概念: 构造器一般用来创建对象的同时初始化对象，根据参数的不同，构造器可以分为如下两类: 1、隐式无参构造器(系统默认提供)
         * 2、显示定义一个或多个构造器(无参、有参)
         * 
         * 注意： 1、Java语言中，每个类都至少有一个构造器 2、默认构造器的修饰符与所属类的修饰符一致 3、一旦显式定义了构造器，则系统不再提供默认构造器
         * 4、一个类可以创建多个重载的构造器 5、父类的构造器不可被子类继承
         * 
         * new 对象 实际上就是调用类的构造方法
         */

        // // 不带参数
        // // Person person = new Person(); // new Person() 会调用Person类的构造方法
        // // person.showName(); //姓名: zhangsan
        // // 带参数
        // Person person = new Person("zhangsan"); // new Person("zhangsan")
        // 会调用Person类的构造方法
        // person.showName(); //姓名: zhangsan

        // // 构造器的重载
        // // 目的：为了方便调用方可以灵活的创建出不同需要的对象，重载的多个构造方法实际上相当于提供了多个初始化new对象的模板
        // new Person();
        // new Person("zhangsan");
        // new Person(1, "wangwu");
        // new Person(1, "wangwu", "student").showInfo();

        // /**
        // * JavaBean
        // * 概念：JavaBean是一种Java语言写成的可重用组件
        // *
        // * 所谓JavaBean，是指符合如下标准的Java类：
        // * 1、类是公共的(public)
        // * 2、有一个无参的公共构造器
        // * 3、有属性，属性一般是私有的(private)，且有对应的get、set方法
        // *
        // * 用途：
        // *
        // 用户可以使用JavaBean将功能、处理、值、数据库访问和其他任何可以使用java代码创造的对象进行打包，并且其他的开发者可以通过内部的JSP页面、Servlet、其他JavaBean、applet程序或者应用来使用这些对象。
        // * 用户可以认为JavaBean提供了一种随时随地的复制和粘贴的功能，而不用关心任何改变
        // */
        // Person2 person2 = new Person2();

        // person2.setName("张三");
        // person2.setSex(0);
        // person2.setAge(20);

        // System.out.println(person2.getName());
        // System.out.println(person2.getSex());
        // System.out.println(person2.getAge());

        // /**
        // * 继承(extends)
        // *
        // * 为什么要继承：
        // * 多个类中存在相同属性和行为时，将这些内容抽取到单独的一个类中，那么多个类就无需再定义这些属性和方法，只需继承那个类即可
        // *
        // * 此处的多个类称为子类，单独的这个类成为父类(基类或超类)。
        // *
        // * 类继承的语法规则：
        // * class Subclass extends Superclass{}
        // *
        // * 作用：
        // * 1、提高代码复用性
        // * 2、让类与类之间产生了关系，提供了多态的前提
        // * 3、不要仅为了获取其他类中的某个功能去继承，继承是要有逻辑关系的，不要随意继承（狗不能继承人的类，狗可以继承动物的类）
        // *
        // * 注意：
        // * 1、子类继承了父类，就继承了父类的方法和属性
        // * 2、在子类中，可以使用父类中定义的方法和属性，也可以创建新的数据和方法
        // * 3、再Java中、继承的关键字用的是“extends”，即子类不是父类的子集，而是对父类的“扩展”
        // * 4、Java只支持单继承，不允许多重继承，单继承(多层继承)：一个子类只能有一个父类，一个父类可以派生出多个子类，多重继承：一个子类可以有多个父类
        // * 5、子类会继承父类的构造方法，当使用new 子类()创建对象时，会调用父类的构造方法，同时也会调用子类自己的构造方法
        // *
        // * 总结：
        // * 把共性的东西抽取出来形成父类，子类在继承父类的基础上写自己特有的代码即可
        // */
        // // day07.Person person = new day07.Person();
        // // person.showInfo();
        // day07.Student student = new day07.Student();
        // student.showInfo();

        /**
         * 方法的重写(override) 概念：
         * 在子类中可以根据需要对从父类中继承来的方法进行改造，也称为方法的重置，覆盖。在程序执行时，子类的方法将覆盖父类的方法。
         * 
         * 要求： 1、重写方法必须和被重写的方法具有相同的方法名称、参数列表和返回值类型，即子类重写父类的方法，只是改写方法体的代码
         * 2、重写方法不能使用比被重写方法更严格的访问权限，ep: 如果父类的方法是public的，子类重写的时候就不能使用缺省以下的
         * 3、重写和被重写的方法须同时为static，或同时为非static的 4、子类方法抛出的异常不能大于父类被重写方法的异常
         * 
         * 
         * 总结： 1、方法的重载，一个类可以有多个同名的方法，方法的参数个数和类型不同即可 2、方法的重写，子类可以重写父类的方法，覆盖(override)父类方法
         */

        /**
         * 关键字super 在Java类中使用super来调用父类中的指定操作： 1、super可用于访问父类中定义的属性
         * 2、super可用于调用父类中定义的成员方法 3、super可用于在子类构造方法中调用父类的构造器
         * 
         * 注意： 1、当子父类出现同名成员时，可以使用super进行区分 2、super的追溯不仅限于直接父类，使用super，子类可以调用子类之上所有父类层级
         * 3、super和this的用法相像，this代表本类对象的引用，super代表父类的内存空间的标识
         * 
         * 调用父类构造器： 1、子类中所有的构造器默认都会访问父类中空参数的构造器
         * 2、当父类中没有空参数的构造器时，子类的构造器必须通过this(参数列表)或者super(参数列表)语句指定调用本类或者父类中相应的构造器，且必须放在构造器的第一行
         * 3、如果子类构造器中既未显式调用父类或本类的构造器，且父类中又没有无参的构造器，则编译出错
         */

        /**
         * this和super的区别
         * 
         * 区别点 this super
         * 
         * 访问属性 访问本类中的属性，如果本类 访问父类中的属性 没有此属性则从父类中继续查找
         * 
         * 调用方法 访问本类中的方法 直接访问父类中的方法
         * 
         * 调用构造器 调用本类构造器，必须放在构造器 调用父类构造器，必须放在 的首行 子类构造器的首行
         * 
         * 特殊 表示当前对象 无此概念
         * 
         * 注意： 在子类中，通过this或者super调用构造器，只能使用一个，因为都要占据首行
         */

        /**
         * 简单类的实例化过程 Person p = new Person():
         * 
         * 1、加载Person.class(方法区) 
         * 2、在栈中申请空间、声明变量p p AD2600 (栈内存) 
         * 3、在堆内存中开辟空间，分配地址(针对new Person()对象)。假设地址是BE2500 (堆内存) 
         * 4、并在对象空间中，对对象中的属性进行默认初始化。此时age=0, name=null, sex=0, 类成员变量显式初始化，此时age=1, name="zhangsan", sex=0 (堆内存) 
         * 5、构造函数方法进栈、进行初始化(栈内存) 
         * 6、初始化完毕后，将堆内存中的地址赋给引用变量p。构造方法出栈 p AD2600 BE2500 (栈内存)
         */

        /**
         * 子类对象的实例化过程 Student stu = new Student();
         * 
         * 1、先加载Person.class，再加载Student.class, 即先加载父类，后加载子类 (方法区) 
         * 2、在栈中申请空间，声明变量stu stu AD3600 (栈内存)
         * 3、在堆内存中开辟空间，分配地址(针对new Student()对象)。假设地址是BE3500 (堆内存)
         * 4、并在对象空间中，对对象中的属性(包括父类的属性)，进行默认初始化 (堆内存) 
         * 5、子类构造函数进栈, public Student(){ super(); } (栈内存) 
         * 6、显式初始化父类的属性, age=1, name="zhangsan", sex=0 (堆内存)
         * 7、父类构造方法进栈、执行完毕出栈 (栈内存) 
         * 8、显式初始化子类的属性 (堆内存)
         * 9、初始化完毕后，将堆内存中的地址赋给引用变量stu。子类构造方法出栈 stu AD3600 BE3500 (栈内存)
         */

        /**
         * 面向对象的特征之三：多态性
         * 
         * 多态性，是面向对象中最重要的概念，在java中有两种体现： 1、方法的重载(overload)和重写(override) 注意：
         * 重载(overload)：本类中的重名方法，多态体现在相同名称的方法实现不同的逻辑
         * 重写(override)：子类对父类方法的覆盖，多态体现在子类可以使用和父类相同的方法名，覆盖掉父类的逻辑，例如：父类的方法，想改变逻辑，但是有别的代码在调用父类的方法，可以考虑用子类继承父类，重写父类的方法
         * 
         * 2、对象的多态性 --> 可以直接应用在抽象类和接口上
         * 
         * (1)Java的引用变量有两个类型：编译时类型和运行时类型。编译时类型由声明该变量时使用的类型决定，运行时类型由实际赋给该变量的对象决定 ep:
         * Animal a = new Bird() Animal为编译时类型，Bird为运行时类型
         * 注意：若编译时类型和运行时类型不一致，就会出现多态(Polymorphism)，如上例中，编译时类型Animal和运行时类型Bird不一致，即对象的多态
         * 
         * (2)对象的多态 -- 在java中，子类的对象可以代替父类的对象使用 
         * 2.1、一个变量只能有一种确定的数据类型
         * 2.2、一个引用类型的变量可能指向(引用)多种不同类型的对象 
         * ep: Person p = new Person(); 
         * Person e = new Student(); //Person类型的变量e，指向Student类型的对象
         * 2.3、子类可以看做是特殊的父类，所以父类类型的引用可以指向子类的对象：向上转型(upcasting), 即子类的对象可以给父类的类型的引用变量引用
         * 
         * (3)一个引用类型变量如果声明为父类的类型，但实际引用的是子类的对象，那么该变量就不能再访问"子类中添加的属性和方法"
         * ep: Student m = new Student(); 
         * m.school = "pku"; //合法，Student类有school成员变量
         * Person e = new Student(); 
         * e.school = "pku"; //非法，Person类没有school成员变量
         * e.getSchool(); //非法，Person类没有getSchool()方法
         * 注意：属性是编译时确定的，编译时e为Person类型，没有school成员变量，因而编译错误，同样编译时父类Person中没有子类Student新添加的getSchool()方法，故编译报错
         * 
         * (4)虚拟方法调用 
         * 4.1、正常方法调用 
         * Person p = new Person(); 
         * p.getInfo(); // 调用的是Person类的getInfo()方法 
         * Student s = new Student(); 
         * s.getInfo // 调用的是Student类的getInfo()方法 
         * 4.2 虚拟方法调用(多态情况下) 
         * Person e = new Student(); 
         * e.getInfo(); // 调用的是Student类的getInfo()方法，因为子类重写了父类的getInfo()方法，内存里已经没有父类的getInfo()了，取而代之的是子类的getInfo()方法
         * 4.3 编译时类型和运行时类型
         * 编译时e为Person类型，而方法调用是在运行时确定的，所以调用的是Student类的getInfo()方法。 -- 动态绑定
         * 
         * 方法调用是运行时确定，属性是编译时确定 Java的方法是运行在栈内存中，在运行方法时会动态进栈和出栈
         * 
         * 总结： 
         * 前提： 1、需要存在继承或者实现关系 
         * 2、需要覆盖操作，没有覆盖操作不能调用子类的方法
         * 
         * 成员方法： 
         * 1、编译时：要查看引用变量所属的类中是否有所调用的方法 
         * 2、运行时：调用实际对象所属类中的重写方法 --> 成员方法的多态性，也就是动态绑定，必须存在于方法的重写之上
         * 
         * 成员变量： 不具备多态性，只看引用变量所属的类
         * 
         * 子类继承父类 
         * 1、若子类重写了父类的方法，就意味着子类里定义的方法彻底覆盖了父类里的同名方法，系统将不可能把父类里的方法转移到子类中
         * 2、对于实例变量则不存在这样的现象，即使子类里定义了与父类完全相同的实例变量，这个实例变量依然不可能覆盖父类中定义的实例变量
         */

        /**
         * instanceof操作符 
         * x instanceof A：检验x是否为类A的对象，返回值为boolean型
         * 1、要求x所属的类与类A必须是子类和父类的关系，否则编译错误 
         * 2、如果x属于类A的子类B，x instanceof A 值为true
         * 
         * ep: Student s = new Student(); 
         * Person p = new Person(); 
         * Person e = new Student();
         * 
         * s instanceof Student: true 
         * s instanceof Person: true 
         * p instanceof Student: false 
         * p instanceof Person: true 
         * e instanceof Student: true 
         * e instanceof Person: true
         * 
         */

        /**
         * Object类 1、Object类是所有Java类的根父类，也叫基类 2、如果在类的声明中未使用extends关键字指明其父类，则默认父类为Object类
         * 
         * public class Person{} 等价于 public class Person extends Object{} ep:
         * 若不知道传入一个什么类型的类，可定义一个Object类型的形参 method(Object obj){...} // 可以接收任何类作为其参数
         * Person o = new Person(); method(o);
         * 
         * Object类中的主要方法： 方法名称 类型 描述 public Object() 构造 构造方法 public boolean
         * equals(Object obj) 普通 对象比较 public int hashCode() 普通 取得Hash码 public String
         * toString() 普通 对象打印时调用, 打印对象的内存地址
         * 
         * s.equals(p): true s.hashCode(): 17225372 s.toString(): day07.Student@6bf2d08e
         */

        /**
         * 子类声明了与父类完全一样的成员变量，也不会覆盖掉父类的成员变量。
         * 而是在子类实例化时，会同时定义两个成员变量，子类也可以同时访问到这两个成员变量(通过this.age访问子类的age属性，super.age访问父类的age属性)，但父类不能访问到子类的成员变量（父类不知道子类的存在）。
         * 而具体在方法中使用成员变量时，究竟使用的是父类还是子类的成员变量，则由方法所在的类决定；
         * 即，方法在父类中定义和执行，则使用父类的成员变量，方法在子类中定义（包括覆盖父类方法）和执行，则使用子类的成员变量。 即属性是绑定类的(Person
         * p)，而方法是绑定对象的(new Person())
         */

        // /**
        //  * 对象的类型转换(Casting) 1、基本数据类型的Casting (1)自动类型转化：小的数据类型可以自动转换成大的数据类型 例如：long g =
        //  * 20; double d = 12.0f (2)强制类型转换：可以把大的数据类型强制转换(casting)成小的数据类型 例如：float f =
        //  * (float)12.0; int a = (int)120L;
        //  * 
        //  * 2、Java对象的强制类型转换称为造型 
        //  * (1)从子类到父类的类型转换可以自动进行 例如：Person p = new Student(); (向上转型)
        //  * (2)从父类到子类的类型转换必须通过造型(强制类型转换)实现，向下转型的前提条件：父类引用需要先指向一个子类实例对象 (向下转型)
        //  * 例如：
        //  * Person p = new Student();
        //  * Student s = (Student) p;
        //  * (3)无继承关系的引用类型间的转换是非法的
        //  */

        // // String s = "hello";
        // // Object obj = s; // 从子类到父类的类型转换可以自动进行
        // // System.out.println(obj);

        // // Object obj = "hello";
        // // String s = (String) obj; // 从父类到子类的类型转换必须通过造型(强制类型转换)实现
        // // System.out.println(s);

        // TestClass t = new TestClass();
        // // t.method(new day07.Person()); // 匿名对象
        // t.method(new day07.Student());

        /**
         * == 操作符与equals方法
         * ==:
         * 1、基本类型比较值：只要两个变量的值相等，即为true
         * int a = 5;
         * a == 5: true
         * a == 6: false
         * 2、引用类型比较引用(是否指向同一个对象)：只有指向同一个对象时，==才返回true
         * Person p1 = new Person();
         * Person p2 = new Person();
         * p1 == p2: false
         * 
         * p2 = p1;
         * p1 == p2: true
         * 
         * Person p = new Student();
         * Student s = new Student();
         * 
         * p == s: false
         * 
         * p = s;
         * p == s: true
         * 
         * s = (Student) p;
         * p == s: true
         * 
         * 注意：
         * 用"=="进行比较时，符号两边的数据类型必须兼容(可自动类型转换的基本数据类型和引用数据类型除外)，否则编译出错
         * 
         * equals:
         * 所有类都继承了Object，也就获得了equals()方法，Object类中的equals()方法是比较对象的地址(引用)。还可以重写。
         * 1、只能比较引用数据类型，其作用与"=="相同，比较是否指向同一个对象
         * ep:
         * Person p1 = new Person();
         * Person p2 = new Person();
         * 
         * p1.equals(p2): false
         * 
         * p2 = p1;
         * p1.equals(p2): true
         * 
         * Person p1 = new Student();
         * Student p2 = new Student();
         * 
         * p1.equals(p2): false
         * 
         * p1 = p2;
         * p1.equals(p2): true
         * 
         * p2 = (Student) p1;
         * p1.equals(p2): true
         * 
         * 2、格式: obj1.equals(obj2)
         * 
         * 特例：当用equals()方法进行比较时，对类File、String、Date及包装类(Wrapper Class)来说，是比较类型及内容是否相同而不比较引用(对象的地址)是否相同；
         * 原因：这些类中重写了Object类的equals()方法
         * String s1 = new String("abc");
         * String s2 = new String("abc");
         * 
         * s1 == s2: false
         * s1.equals(s2): true
         * 
         * 注意：
         * 1、对于对象来说
         * 1.1、特殊的类，例如：String、File、Date，使用==比较的是引用(对象的地址)，equals比较的是内容
         * 1.2、除了特殊的类之外的其他普通的类的对象，==和equals比较的都是引用(对象的内存地址)
         * 1.3、如果不想用equals比较对象的内存地址，就需要重写equals方法，因为Object类中的equals()方法是比较引用(对象的地址)
         * 
         * String对象的创建：
         * 
         * 1、字面量创建String对象
         * String s1 = "abc"; // 字符串常量池中添加"abc"对象, 返回"abc"对象的地址(引用)给s1引用变量
         * String s2 = "abc"; // 通过equals()方法判断字符串常量池中已有值为abc的对象，不再向字符串常量池中创建新的"abc"对象，返回相同的"abc"对象地址(引用)给s2引用变量
         * s1 == s2: true // 因为s1和s2的值(引用，对象的地址，都指向同一个对象"abc")相同，所以==的结果为true
         * 注意：字符串常量池中存放唯一的字符串常量，故s1 == "abc": true
         * 
         * 2、new 创建String对象
         * String s3 = new String("def"); // 在字符串常量池中添加"def"对象，在堆中创建值为"def"的对象s3，返回指向堆中s3的引用
         * String s4 = new String("def"); // 字符串常量池中已有值为"def"的对象，不做处理，在堆中创建值为"def"的对象s4，返回堆中s4的引用
         * s3 == s4: false // 因为s3和s4指向两个不同的对象，字符串常量池中只有一个"def"对象
         * 
         * 3、String s5 = "x" + "y"; // 经过JVM优化，直接在常量池中添加"xy"对象，将引用("xy"对象的地址)返回给s5引用变量
         * 
         * 4、String s6 = new String("1") + new String("1") + new String("2"); // 通过StringBuilder实现，在常量池中添加"1"和"2"两个对象，在堆中创建值为"112"的对象，把引用("112"的对象的地址)给s6，不用在堆中创建值分别为1 1 2的三个对象
         * 
         * 栈                   堆
         *                  字符串常量池
         * s1  <----  "abc" "def" "xy" "1" "2"
         *         /               |
         * s2  <---                | 
         *                         |
         * s3  <----  "def"对象    |
         *                         |
         * s4  <----  "def"对象    |
         *                         |
         * s5  <--------------------     
         * 
         * s6  <----  "112"对象
         * 
         * 总结：
         * 1、通过字面量创建String对象的时候，只在常量池创建一个对象；而new的时候，字符串常量池有对象，堆中也要有对象，所以通过字面量创建字符串对象的方法要比new省内存
         * 2、==是比较对象的内存地址
         * 3、equals，对于String是比较内容(值)，equals比较什么需要看该类中equals()方法是怎么写的
         * 
         * Object类的equals()方法：
         * public boolean equals(Object obj) {
         *       return (this == obj);
         * }
         * 
         * String类的equals()方法:
         * public boolean equals(Object anObject) {
         *       if (this == anObject) {
         *           return true;
         *       }
         *       if (anObject instanceof String) {
         *           String anotherString = (String)anObject;
         *           int n = value.length;
         *           if (n == anotherString.value.length) {
         *               char v1[] = value;
         *               char v2[] = anotherString.value;
         *               int i = 0;
         *               while (n-- != 0) {
         *                   if (v1[i] != v2[i])
         *                       return false;
         *                   i++;
         *               }
         *               return true;
         *           }
         *       }
         *       return false;
         * }
         */

        // day07.Person p = new day07.Student();
        // day07.Student s = new day07.Student();
        // // s = (Student) p; // 父类引用需要先指向子类实例对象，才能进行强制类型转换(向下转型)
        // p = s;
        // if(p == s){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
        
        // day07.Person p1 = new day07.Student();
        // day07.Student p2 = new day07.Student();
        // // p1 = p2; // true
        // p2 = (Student) p1; // true
        // System.out.println(p1.equals(p2));

        // String s1 = new String("abc");
        // String s2 = new String("abc");
        // System.out.println(s1 == s2); // false
        // System.out.println(s1.equals(s2)); // true
        
        // /**
        //  * char类型
        //  * 
        //  * 初始化方式:
        //  * char a = 'A'; // 字符(英文、中文...)
        //  * char a = 65;  // 整数(十进制、八进制、十六进制...)
        //  */
        // char a = 65;
        // System.out.println(a);

        // /**
        //  * 重写父类Object类的equals()方法
        //  * 
        //  */
        // Order o1 = new Order(1, "a001");
        // Order o2 = new Order(1, "a001");
        // System.out.println(o1.equals(o2)); // true

        // Order o3 = new Order(1, "a001");
        // Order o4 = new Order(1, "a002");
        // System.out.println(o3.equals(o4)); // false
        
        /**
         * 包装类(Wrapper)
         * 1、针对八种基本定义相应的引用类型-包装类(封装类)
         * 2、有了类的特点，就可以调用类中的方法
         * 基本数据类型                 包装类
         * boolean                     Boolean
         * byte                        Byte
         * short                       Short
         * int                         Integer
         * long                        Long
         * char                        Character
         * float                       Float
         * double                      Double
         * 
         * 3、基本数据类型包装成包装类的实例 ---- 装箱
         * 3.1、通过包装类的构造器实现：
         * int i = 500; Integer t = new Interger(i);
         * 3.2、还可以通过字符串参数构造包装类对象：
         * Float f = new Float("4.56");
         * Long l = new Long("asdf"); //报错，NumberFormatExeption
         * 
         * 4、获得包装类对象中包装的基本数据类型变量 ---- 拆箱
         * 4.1、调用包装类的.xxxValue()方法
         * ep: boolean b = bObj.booleanValue();
         * 
         * 5、JDK1.5之后，支持自动装箱，自动拆箱。但类型必须匹配
         * 
         * 6、字符串转换成基本数据类型
         * 6.1、通过包装类的构造器实现(拆箱)：
         * int i = new Integer("12");
         * 6.2、通过包装类的parseXxx(String s)静态方法实现：
         * float f = Float.parseFloat("12.1");
         * 
         * 7、基本数据类型转换成字符串
         * 7.1、调用字符串重载方法valueOf()方法：
         * String fstr = String.valueOf(2.34f);
         * 7.2、更直接的方式：
         * String intStr = 5 + "";
         * 
         * 8、基本数据类型的包装类的主要作用：
         * 基本数据类型与字符串之间的转换
         * 
         * 9、toString()方法：
         * 父类Object的toString()方法就是输出当前对象的内存地址，如果想要输出类的其他信息，就要重写toString()方法
         * ep:
         * Person p = new Person();
         * p.toString(): day07.Person@ldb9742
         * p: day07.Person@ldb9742 // 打印m对象相当于执行打印m.toString()，在其他对象也是如此
         * 
         * 总结：
         * 装箱：包装类使得一个基本数据类型的数据变成了类，有了类的特点，就可以调用类的方法
         * 拆箱：将数字包装类中内容变为基本数据类型
         */
        
        // // 装箱：基本数据类型包装成包装类的实例
        // // Integer i = new Integer(111);  // 111
        // // Integer i = new Integer("123");   // 123
        // Integer i = new Integer("abc");   // 编译不报错，但是运行报错，java.lang.NumberFormatException
        // System.out.println(i);

        // // 拆箱：获得包装类对象中包装的基本数据类型变量
        // Integer i = new Integer(1);
        // System.out.println(i.intValue()); // 拆箱
        // Boolean b = new Boolean("false");
        // System.out.println(b.booleanValue()); // 拆箱

        // // 自动拆箱 装箱
        // Integer i = 123;  // 自动装箱
        // int i1 = i;       // 自动拆箱
        // System.out.println(i);   // 123
        // System.out.println(i1);  // 123

        // // 字符串转换成基本数据类型
        // int i = new Integer("1"); // 通过包装类的构造器实现，自动拆箱
        // System.out.println(i);
        // float f = Float.parseFloat("123"); // 通过包装类的parseXxx(String s)静态方法实现
        // System.out.println(f); // 123.0

        // // 基本数据类型转换成字符串
        // // 调用字符串(String类)重载方法valueOf()方法
        // String iStr = String.valueOf(1);
        // String fStr = String.valueOf(1.2f);
        // String bStr = String.valueOf(false);
        // System.out.println(iStr); // 1 
        // System.out.println(fStr); // 1.2
        // System.out.println(bStr); // false
        
        // // 使用字符串拼接的方式来转换
        // String cStr = 'a' + "";
        // String bStr2 = false + "";
        // System.out.println(cStr); // a
        // System.out.println(bStr2); // false

        /**
         * static关键字
         * 概念：static修饰的变量为类变量，static类内定义，类外初始化，且只初始化一次
         * 实例变量：只有实例化之后才能使用，属于实例化对象的一部分，不能被同一个类的不同对象所共享(没有static修饰)
         * 类变量：不用实例化，直接 类名.属性名 就可以使用，是类的一部分，被所有这个类的实例化对象所共享，也可以叫做静态变量(有static修饰)
         * 
         * 同样方法也可以用static修饰符修饰
         * 
         * 类属性、类方法的设计思想：
         * 1、类属性作为该类各个对象之间共享的变量。在设计类时，分析哪些类属性不因对象的不同而改变，将这些类设置为类属性。同样，有些方法不想因为对象的不同而频繁通过new对象的方式去调用方法，这样的方法就可以设置成类方法(通过static修饰符进行修饰)
         * 2、如果方法与调用者无关，则这样的方法通常被声明为类方法，由于不需要创建对象就可以调用类方法，从而简化了方法的调用
         * 
         * 类方法：
         * 适用于抽取到工具类做成一个方法
         * ep:
         * public class Utils{
         *    // 判断一个字符串是否是空字符串
         *    public static boolean isEmpty(String s){
         *          boolean flag = true;
         *          if(s != null && s.equals("") == false){
         *                  flag = false;
         *          }
         *          return flag;
         *    }  
         * }
         * 
         * main方法里使用该工具类的方法:
         * String s = "hello";
         * System.out.println(Utils.isEmpty(s));  // false
         * 
         * 使用范围：
         * 1、在Java类中，可用static修饰属性、方法、代码块、内部类
         * 2、被修饰后的成员具备以下特点：
         * (1)随着类的加载而加载，即类加载后，静态的方法或者属性就能用了，通过 类名.方法名() 或 类名.属性名
         * (2)优先于对象存在，即不用new实例化一个对象，就可以使用
         * (3)修饰的成员，被所有对象所共享
         * (4)访问权限允许时，可不创建对象，直接被类调用，通常用public权限修饰符 修饰 静态方法或静态属性
         * 
         * 注意：
         * 类变量，这种可以被同一个类所有实例化对象所共享的属性，使用起来要慎重，因为只要该类变量的值一变化，所有该类实例化对象的这一类变量的值都会发生变化
         * 
         * 类方法(class Method)，做工具类用的最多
         * 1、没有对象的实例时，可以用 类名.方法名() 的形式访问由static标记的类方法
         * 2、在static方法内部只能访问类的static属性，不能访问类的非static属性
         * 3、因为不需要实例就可以访问static方法，因此static方法内部不能有this，也不能有super，即静态方法只能访问类变量(静态变量)，和类方法(静态方法)
         * Java静态方法中不能使用this、super和直接调用非静态方法的原因：
         * 这个要从java的内存机制去分析，首先当你New 一个对象的时候，并不是先在堆中为对象开辟内存空间，而是先将类中的静态方法（带有static修饰的静态函数）的代码加载到一个叫做方法区的地方，然后再在堆内存中创建对象。所以说静态方法会随着类的加载而被加载。当你new一个对象时，该对象存在于对内存中，this关键字一般指该对象，但是如果没有new对象，而是通过类名调用该类的静态方法也可以。
         * 程序最终都是在内存中执行，变量只有在内存中占有一席之地时才会被访问，类的静态成员（静态变量和静态方法）属于类本身，在类加载的时候就会分配内存，可以通过类名直接去访问，非静态成员（非静态变量和非静态方法）属于类的对象，所以只有在类的对象创建（实例化）的时候才会分配内存，然后通过类的对象去访问。
         * 在一个类的静态成员中去访问非静态成员之所以会出错是因为在类的非静态成员不存在的时候静态成员就已经存在了，访问一个内存中不存在的东西当然会出错。
         * 
         * 4、重载的方法需要同时为static的或者同时为非static的
         */
        
        // day07.Person.country = "Chinese"; // 通过 类名.属性名 访问 Person类的静态属性(类变量)
        // day07.Person person = new day07.Person();
        // System.out.println(person.country);
        // System.out.println(day07.Person.country);

        // day07.Person.test1(); // 通过 类名.方法名() 访问 Person类的静态方法
        
        // // 判断一个字符串是否是空字符串
        // String s = "hello";
        // System.out.println(s.isEmpty()); // false
        // System.out.println(day08.Utils.isEmpty(s)); // false

        // // 想知道实例化了多少个Chinese类型的对象
        // Chinese c1 = new Chinese();
        // System.out.println(Chinese.count);
        // Chinese c2 = new Chinese();
        // System.out.println(Chinese.count);
        // Chinese c3 = new Chinese();
        // System.out.println(Chinese.count);
        // Chinese c4 = new Chinese();
        // System.out.println(Chinese.count);
        // Chinese c5 = new Chinese();
        // System.out.println(Chinese.count);
        // System.out.println("-------------");
        // Chinese.showCount();  // 总共new了5个对象，由此可以看出Chinese.count这个类属性(被static修饰符修饰)被所有实例化对象所共享

        /**
         * 设计模式：
         * 概念：
         * 设计模式是在大量的实践中总结和理论化之后优选的代码结构、编程风格、以及解决问题的思考方式。设计模式就像是经典的棋谱，不同的棋局，我们用不同的棋谱，免去我们自己再思考和摸索。
         * 
         * 单例设计模式(Singleton)：
         * 概念：
         * 所谓单例设计模式，就是采取一定的方法保证在整个软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法。如果我们要让类在一个虚拟机中只能产生一个对象，我们首先必须将类的构造方法的访问权限设置为private，这样，就不能用new操作符在类的外部产生类的对象了，但在类内部仍可以产生该类的对象。因为在类外部开始还无法得到类的对象，只能调用该类的某个静态方法以返回类内部创建的对象，静态方法只能访问类中的静态成员变量，所以，指向类内部产生的该类对象的引用变量也必须定义成静态的。
         * 
         * 概括：
         * 设计模式：就是在我们实际编程中，逐渐总结出的一些解决问题的套路
         * 单例设计模式：只有一个实例(实例化对象)，在整个软件系统运行过程中，这个类只被实例化一次，以后不论在哪都只调用这一个实例
         * 
         * 适用情况：
         * 1、实例化对象要消耗大量的时间和资源
         * 2、频频的new新的对象没有必要
         * 
         * 总结：
         * 单例模式：软件的运行有且仅有一个实例化对象(只会new一次)
         * 
         * 懒汉式和饿汉式的区别，就是什么时候new这个对象：
         * 懒汉式：是在第一次有人调用getInstance()方法时来new对象，以后再有人调用getInstance()方法直接就返回之前第一次new好的对象
         * 饿汉式：是在类加载之后，还没有人调用的时候，就先new好一个对象，以后不论谁来调用getInstance()方法，都是直接返回之前new好的那个对象
         */

        // // 饿汉式的单例模式
        // // Single s = new Single(); // 编译出错，因为构造方法被私有化了，不能直接通过new 类名()调用构造方法，实例化对象
        // // Single.single; // single类变量也被私有化了，不能直接访问
        // // 不管有没有人调用getInstance()，都先实例化一个Single类型的对象，该对象是静态的
        // Single s = Single.getInstance(); // 只能通过类方法获取类变量single(Single类实例化的对象)，因为single是类变量(有static修饰符修饰的)只初始化一次，，所以无论调用多少次Single.getInstance()方法，只会实例化一次Single类型的对象
        // Single s1 = Single.getInstance();
        // Single s2 = Single.getInstance();
        // Single s3= Single.getInstance(); // s、s1、s2、s3引用变量都指向一个Single类型的对象

        // // 懒汉式的单例模式
        // Single1 s = Single1.getInstance(); // 在调用Single1.getInstance()方法前，Single1.single = null，第一次调用Single1.getInstance()方法后会实例化一个静态的Single1类型的对象，之后定义的引用变量都指向这个对象
        // Single1 s1 = Single1.getInstance();
        // Single1 s2 = Single1.getInstance();
        // Single1 s3 = Single1.getInstance();

        // java.lang.Runtime类采用的是饿汉式单例设计模式

        /**
         * 理解main方法的语法:
         * public static void main(String[] args){}
         * 
         * 由于java虚拟机需要调用类的main()方法，所以该方法的访问权限必须是public，又因为java虚拟机在执行main()方法时不必创建对象，所以该方法必须是static的，该方法接收一个String类型的数组参数，该数组中保存执行 java命令(在终端输出) 时传递给所运行的类的参数。
         * 例如：
         * 1、先执行javac TestMain.java命令编译TestMain.java源文件，编译后会生成TestMain.class字节码文件
         * 2、通过java TestMain 123 21 a as 运行该字节码文件，123 21 a as 实参会传入args形参中，相当于String[] args = {"123", "21", "a", "as"}
         */
        
        /**
         * 内部类(Inner class)
         * 概念：
         * 在Java中，允许一个类的定义位于另一个类的内部，前者称为内部类，后者称为外部类
         * 
         * 注意：
         * 1、内部类一般用在定义它的类或语句块之内，在外部引用它时必须给出完整的名称，内部类的名称不能与包含它的类名相同
         * 2、内部类可以使用外部类的私有数据，因为它是外部类的成员，同一个类的成员之间可以相互访问。而外部类要访问内部类中的成员需要：内部类.成员(类变量) 或 内部类对象.成员
         * 
         * 内部类分类：成员内部类(static成员内部类和非static成员内部类)、局部内部类(不谈修饰符)、匿名内部类
         * 
         * 内部类的特性：
         * 1、内部类作为类的成员：
         * (1)可以声明为final的
         * (2)和外部类不同，内部类可声明为private或protected或缺省的
         * (3)内部类可以声明为static的，但此时就不能再使用外层的非static成员变量
         * 2、内部类作为类：
         * (1)可以声明为abstract类，因此可以被其他的内部类继承
         * 3、内部类的最大作用是实现"多重继承"
         * 注意：非static的内部类中的成员不能声明为static的，只有在外部类或static的内部类中才可声明static成员
         * 
         * main方法中访问某一个类的内部类：
         * 1、因为main方法是静态的方法，所以内部类是static修饰的话，可以直接通过 new 内部类 的方式实例化一个内部类
         * 2、可以通过外部类的实例，得到内部类的实例：
         * ep:
         * A a1 = new A(); // 外部类
           A.InnerB b1 = a1.new InnerB(); // 内部类不能被private修饰符修饰(即不能是私有的)
           b1.testB();
           3、通过外部类的getInnerB方法得到内部类实例
           ep:
           A a2 = new A(); // 外部类
           A.InnerB b2 = a2.getInnerB(); // 内部类不能被private修饰符修饰(即不能是私有的)
           b2.testB();
         * 
         * 例子：day09包中的Test3.java、Test4.java
         */
        
        // // 测试内部类
        // Test3 t3 = new Test3();
        // t3.setInfo();
        // t3.showInfo();
        


        /**
         * 类成员之四：初始化块
         * 1、初始化块(代码块)作用：对Java对象进行初始化
         * ep:
         * public class Person {
                String name;

                public Person(){
                    this.name = "张三";
                    System.out.println("执行的时构造方法");
                }

                // 非静态的代码块
                {
                    System.out.println("执行的是非静态的代码块1");
                }

                {
                    System.out.println("执行的是非静态的代码块2");
                }

                {
                    System.out.println("执行的是非静态的代码块3");
                }
            }
         * 2、程序执行顺序：
         * (1)声明成员变量的默认值
         * (2)显式初始化、多个初始化块依次被执行(先执行静态的代码块，再执行非静态的代码块，因为静态的代码块在类加载的时候就开始执行了)(同级别下按先后顺序执行)
         * (3)执行构造方法
         * 
         * 3、初始化块(代码块)只能被static修饰符修饰，称为静态代码块，当类被载入时，类属性的声明和静态代码块按先后顺序被执行，且只被执行1次
         * 注意：
         * 1、static代码块只能直接使用static类型的属性(类变量)和方法(类方法)
         * 2、在程序运行过程中，非静态代码块每次new对象都要重新执行，静态代码块只执行一次
         * 
         * 总结：
         * 非静态代码块：没有static修饰的代码块
         * 1、可以有输出语句
         * 2、可以对类的属性声明进行初始化操作
         * 3、可以调用静态和非静态的变量或方法
         * 4、若有多个非静态的代码块，那么按照从上到下的顺序依次执行
         * 5、每次创建对象的时候，都会执行一次，且先于构造器执行
         * 6、需要实例化对象才会执行非静态代码块
         * 
         * 静态代码块：用static修饰的代码块
         * 1、可以有输出语句
         * 2、可以对类的属性声明进行初始化操作
         * 3、不可以调用非静态的属性和方法
         * 4、若有多个静态代码块，按照从上到下的顺序依次执行
         * 5、静态代码块的执行要先于非静态代码块
         * 6、静态代码块只执行一次
         * 7、在实际开发中，static静态代码块用得多一些，通常用来初始化类的静态属性(static类型的属性，类变量)
         */

        // new day09.Person();
        // // 执行的是非静态的代码块1
        // // 执行的是非静态的代码块2
        // // 执行的是非静态的代码块3
        // // 执行的是构造方法

        // new day09.Person();
        // new day09.Person();
        // 1
        // ===执行的是静态代码块===
        // 执行的是非静态的代码块1
        // 执行的是非静态的代码块2
        // 执行的是非静态的代码块3
        // 执行的是构造方法
        // 执行的是非静态的代码块1
        // 执行的是非静态的代码块2
        // 执行的是非静态的代码块3
        // 执行的是构造方法

        // // 匿名内部类，构建了一个没有类名的Person的子类，也就是匿名的Person的子类，这是一个向上转型(多态)：父类(编译时类型) 子类(运行时类型)
        // // 注意：这种类没有类名，就不能通过显式的new的方式创建对象，如果还需要在构造器中初始化属性就没有办法了，这样的情况就要用代码块(初始化块)完成初始化工作
        // // 执行顺序: 父类的静态代码块 -> 子类的静态代码块 -> 父类的非静态代码块 -> 父类的构造方法 -> 子类的非静态代码块 -> 子类的构造方法
        // // 匿名内部类不能定义静态代码块或重写父类的静态方法，但能定义非静态代码块
        // day09.Person p = new day09.Person() {

        //     // 问题：现在想把父类Person的name改成李四，但是不想动Person的代码，可以使用代码块代替构造方法
        //     // 匿名内部类不能定义构造器。由于匿名内部类没有类名,所以无法定义构造器，但匿名内部类可以初始化块，通过初始块完成构造器需要完成的工作
        //     // 匿名内部类拥有和父类相似的构造器，相似指拥有相同的形参列表
        //     {
        //         super.name = "李四";
        //         System.out.println(super.name);
        //     }

        //     @Override
        //     public void test() {
        //         System.out.println("====");
        //     }

        // };

        // p.test();

        /**
         * 关键字: final
         * 
         * 概念：在Java中声明类、属性和方法时，可使用关键字final来修饰，表示"最终"
         * 1、final修饰的类不能被继承：提高安全性，提高程序的可读性(最终类)
         * 例如：String类、System类、StringBuffer类
         * ep:
         * public final class A{}
         * class B extends A{} // 错误，final修饰的类A不能被继承
         * 
         * 2、final修饰的方法不能被子类重写(最终方法)
         * 例如：Object类中的getClass()
         * ep: class A{
         *          public final void print(){
         *              System.out.println("A");
         *          }
         *     }
         * 
         * class B extends A{
         *      public void print(){  //错误，final修饰的方法不能被子类重写
         *          System.out.println("Hello")
         *      }
         * }
         * 
         * 3、final修饰的变量(成员变量或局部变量)即称为"常量"。名称大写，且只能被赋值一次
         * 注意：final修饰的成员变量必须在声明的同时或在每个构造方法中或在代码块中显式赋值，然后才能使用，例如：final double PI = 3.14
         * ep:
         * final String NAME = ""; // final修饰的变量是常量，常量必须显式赋值
         * final static String NAME_1 = "" // final static一起修饰的变量是全局常量
         * // 常量定义名称约定使用大写，如果名称由多个单词组成，则用_连接
         * // 常量只能被赋值一次，值不可再修改
         * 
         * 总结:
         * 1、final代表最终，可以修饰变量、方法、类
         * 2、修饰变量，即为常量，只能被赋值一次，不能改变
         * 3、修饰方法，子类不能重写该方法
         * 4、修饰类，该类不能被继承
         */

        /**
         * 抽象类(Abstract class)
         * 
         * 相关概念:
         * 1、用abstract关键字来修饰一个类时，这个类叫做抽象类
         * 2、用abstract来修饰一个方法时，该方法叫做抽象方法 抽象方法：只有方法的声明，没有方法的实现，以分号结束，例如：abstract int abstractMethod(int a);
         * 3、含有抽象方法的类必须被声明为抽象类
         * 4、抽象类不能被实例化。抽象类是用来作为父类被继承的，抽象类的子类必须重写父类的抽象方法，并提供方法体。若没有重写全部的抽象方法，仍为抽象类。
         * 5、不能用abstract修饰属性、私有方法、构造器、静态方法、final方法
         * ep: static修饰的方法会有具体的实现，而abstract肯定没有具体的实现，两个完全冲突的修饰关键词 怎么可能会放在一起使用呢！
         * 6、抽象类中可以有构造方法，只是不能直接创建抽象类的实例对象，即抽象类不能实例化, new Vihicle()是非法的
         * 例子：day09包中的Animal.java
         * 
         * 注意：
         * 1、属性是不能被覆盖或者重写的，如果子类中有和父类同名的属性时候，this.role和super.role才会有区别，否则this.role，super.role 访问的都是同一个属性，即父类的属性 -- this在本类中没有找到相应属性的话，会去父类中继续查找该属性
         * 
         */
        
        /**
         * 模板方法设计模式(TemplateMethod)
         * 概念：
         * 抽象类体现是一种模板模式的设计，抽象类作为多个子类的通用模板，子类在抽象类的基础上进行扩展、改造，但子类总体上会保留抽象类的行为方式
         * 
         * 解决的问题：
         * 1、当功能内部一部分实现是确定的，一部分实现是不确定的。这时可以把不确定的部分暴露出去，让子类去实现。
         * 2、编写一个抽象父类，父类提供多个子类的通用方法，并把一个或多个方法留给子类实现，就是一种模板模式
         * 
         * 例子: day09包中的Template.java
         */

        /**
         * 接口(interface)
         * 概念：
         * 1、有时必须从几个类中派生出一个子类，继承它们所有的属性和方法。但是，Java不支持多重继承。有了接口，就可以得到多重继承的效果。
         * 2、接口(interface)是抽象方法和常量值的定义的集合
         * 3、从本质上讲，接口是一种特殊的抽象类，这种抽象类中只包含常量和方法的定义，而没有变量和方法的实现
         * 4、class SubClass implements InterfaceA{}
         * 5、一个类可以实现多个接口，接口也可以继承其他接口
         * 
         * 特点：
         * 1、用interface定义
         * 2、接口中的所有成员变量都默认是由public static final修饰的(全局常量)
         * 3、接口中所有的方法都默认是由public abstract修饰的
         * 4、接口没有构造器
         * 5、接口采用多层继承机制
         * 
         * ep:
         * public interface Runner {
         *      int ID = 1;
         *      void start();
         *      public void run();
         *      void stop();
         * }
         * 等价于：
         * public interface Runner {
         *      public static final int ID = 1;
         *      public abstract void start();
         *      public abstract void run();
         *      public abstract void stop();
         * }
         * 
         * 注意：
         * 1、实现接口的类中必须提供接口中所有方法的具体实现内容，方可实例化。否则，仍为抽象类
         * 2、接口的主要用途就是被实现类实现。(面向接口编程)
         * 3、与继承关系类似，接口与实现类之间存在多态性(对象的多态) Cooking c = new Teacher(); // Cooking是Teacher类实现的接口，向上转型，Cooking可以调用Teacher类中重写的Cooking类中的抽象方法
         * 4、定义Java类的语法格式：先写extends，后写implements
         * 
         * 问题：
         * 抽象类增加新的抽象方法存在问题：父类(抽象类)增加新的抽象方法，它的子类..子类的子类都需要实现该方法，可能有些子类并不想实现该方法，所以存在问题
         * 
         * 解决方法：新建接口，在接口上扩展抽象方法，让需要的子类自行去实现该接口 ---- 接口可以多重实现
         * 
         * 该问题形象说明：
         * 人类是由猴子进化来的，假如要是穿越回到过去，改变了猴子(猴子多了一个眼睛)，对现在的人类会造成什么影响？
         * 从这个假设可以看出，父类需要稳定的抽象，如果父类老是在改，基于这个父类的子类，子类的子类...这些子类都会受到影响，有时我们又确实需要给父类增加一些方法，那么就不能直接在父类上下手，只能新建接口，在接口上扩展方法，其他需要的子类自行去实现这些接口
         * 
         * 问题一：
         * 用Java描述会唱歌的厨子是一个老师
         * 错误做法：
         * Person <-(继承) Singer <-(继承) Cook <-(继承) Teacher   ：污染了Cook类，Cook类中多了Singer类的属性和方法，这并不是Cook类想要的
         * 或Person <-(继承) Cook <-(继承) Singer <-(继承) Teacher ：污染了Singer类，Singer类中多了Cook类的属性和方法，这并不是Singer类想要的
         * 
         * 正确做法：
         * Person <-(继承) Teacher ->(实现) Cooking接口, Sing接口
         * 例子：day09包中的teacher.java
         * 
         * 总结：
         * 1、抽象类是对一类事物的高度抽象，其中既有属性也有方法(可以既有普通方法，又有抽象方法)
         * 2、接口是对方法的抽象，也就是对一系列动作的抽象(里面只有全局常量(public static final int a)、抽象方法(public abstract void show()))
         * 3、当需要对一类事物抽象的时候，应当使用抽象类，好形成一个父类
         * 4、当需要对一系列的动作抽象，就使用接口，需要使用这些动作的类去实现相应的接口即可
         * 
         */

        /**
         * 工厂方法模式(FactoryMethod)
         * 概念：FactoryMethod模式是设计模式中应用最为广泛的模式，在面向对象的编程中，对象的创建工作非常简单，对象的创建时机却很重要。FactoryMethod解决的就是这个问题，它通过面向对象的手法，将所要创建的具体对象的创建工作延迟到子类，从而提供一种扩展的策略，较好的解决了这种紧耦合的关系。
         * 例子:
         * 普通方法：
         * class BWM3{}
         * class BWM5{}
         * class BWM7{}
         * 
         * BWM3 b3 = new BWM3{}
         * BWM5 b5 = new BWM5{}
         * BWM7 b7 = new BWM7{}
         * 
         * 工厂方法:
         * class BWM3 implements BWM{} // 定义BWM3类是干嘛用的, BWM接口中有一个抽象方法showInfo()
         * class BWM5 implements BWM{}
         * class BWM7 implements BWM{}
         * 
         * class BWM3Factory implements BWMFactory{} // BWMFactory接口中有一个productCar()抽象方法，返回值类型为BWM，返回BWM3类型的实例化对象：return new BWM3()
         * class BWM5Factory implements BWMFactory{}
         * class BWM7Factory implements BWMFactory{}
         * 
         * BWM b3 = new BWM3Factory().productCar()  // 涉及匿名对象和向上转型，相当于 BWM b3 = new BWM3();
         * BWM b5 = new BWM5Factory().productCar()
         * BWM b7 = new BWM7Factory().productCar()
         * 
         * 总结：
         * 工厂方法模式，通过工厂把new对象隔离，通过产品的接口可以接收不同实际产品的实现类(对象的多态，向上转型)，实例类名的改变不影响其他合作开发人员的编程 ---- 解耦合
         * 
         * 例子：day09包中的BWM.java、BWMFactory.java、TestClass.java
         */

        /**
         * Java异常
         * 概念：在Java语言中，将程序执行中发生的不正常情况称为“异常”，Java中的异常用于处理非预期的情况，如文件没找到，网络错误，非法的参数
         * 
         * Java程序运行过程中所发生的异常事件可分为两类：
         * Error：JVM系统内部错误、资源耗尽等严重情况
         * Exception：其他因编程错误或偶然的外在因素导致的一般性问题，例如：
         * 1、空指针访问
         * 2、试图读取不存在的文件
         * 3、网络连接中断
         * 
         * Java异常类层次：
         *                              StackOverFlowError(栈溢出错误)
         *                             /
         *           VirtulMachineError
         *          /                  \
         * Error -->                    OutOfMemoryError(内存溢出错误)
         *          \
         *           AWTError
         * 
         *                             EOFException
         *                            /                      
         *                 IOException(磁盘读写，文件读写中出现的异常)
         *                /           \
         *               /             FileNotFoundException
         *              /
         * Exception -->
         *              \
         *               \
         *                \
         *                 \                      /-> ArithmeticException
         *                  \                    /--> MissingResourceException
         *                   \                  /---> ClassNotFoundException
         *                    RuntimeException  ----> NulPointerException
         *(程序运行过程中出现的异常，编译时不会报错)\---> IllegalArgumentException
         *                                       \--> ArrayIndexOutOfBoundsException
         *                                        \-> UnknownTypeException
         * 
         * 常见异常：
         * RuntimeException：
         * · 错误的类型转换
         * · 数组下标越界
         * · 空指针访问
         * 
         * IOException：
         * · 从一个不存在的文件中读取数据
         * · 越过文件结尾继续读取 EOFException
         * · 连接一个不存在的URL
         * 
         * 异常处理机制
         * 使用原因：
         * 在编写程序时，经常要在可能出现错误的地方加上检测的代码，如进行x/y运算时，要检测分母为0，数据为空，输入的不是数据而是字母。过多的分支会导致程序的代码加长，可读性差，同时，出现异常的代码会中断程序的运行，使后面的代码无法运行，这种情况就可以使用异常处理机制防止程序的中断；综上，采用异常处理机制是有必要的
         * 
         * Java异常处理：Java采用异常处理机制，将异常处理的程序代码集中在一起，与正常的代码分开，使得程序简洁，并易于维护
         * 
         * Java提供的是异常处理的抓抛模型：
         * 1、Java程序的执行过程中如果出现异常，会自动生成一个异常类对象，该异常对象将被提交给Java运行时系统，这个过程称为抛出(throw)异常。
         * 2、如果一个方法内抛出异常，该异常会被抛出到调用方法中。如果异常没有在调用方法中处理，它继续被抛给这个调用方法的调用者。这个过程将一直继续下去，直到异常被处理。这一过程称为捕获(catch)异常。
         * 3、如果一个异常回到main()方法，并且main()也不处理，则程序运行终止
         * 4、程序员通常只能处理Exception，而对Error无能为力
         * ep:
         * int i = 0;
         * try{ // 用try{}来括住一段有可能出现异常的代码段
         *      System.out.println(3/i); // 由于异常，程序中断，可使用异常处理机制防止程序的终止
         * }catch(Exception e){ // 当不知道捕获的是什么类型的异常时，可以直接使用所有异常的父类Exception 对象的多态，向上转型
         *      e.printStackTrace(); // 用来跟踪异常事件发生时执行堆栈的内容 java.lang.ArithmeticException: / by zero at day10.Test.main(Test.java:29)
         *      System.out.println(e.getMessage()); // 用来得到有关异常事件的信息 / by zero
         * }finally{ // 这个finally可写可不写，是捕获异常体系中最终一段会执行的部分, 不管出没出现异常，最终都会运行该部分的代码，io操作和JDBC会经常用到
         *      System.out.println(4);
         * }
         * System.out.println("OK");
         * 
         * // 可写多个catch捕获多个异常
         * String[] strs = new String[]{"a", "b"};
           A a = null;
           // 在捕获异常的代码中(try{}里的代码)，如果前面的代码有异常，就不会执行后面的代码了，下面的代码只会打印2
           try{
               System.out.println(strs[2]);
               System.out.println(a.i);
           }catch(ArrayIndexOutOfBoundsException e1){
               System.out.println(e1.getMessage());  // 2
           }catch(NullPointerException e2){
               System.out.println(e2.getMessage()); // null
           }

           例子: day10包中的Test.java
         */

        /**
         * 1、声明抛出异常是Java中处理异常的第二种方式
         * · 如果一个方法中的语句执行时可能生成某种异常，但是并不能确定如何处理这种异常，则此方法可以显式的声明抛出异常，表明该方法将不对这些异常进行处理，而由该方法的调用者负责处理
         * · 在方法声明中用 throws 子句可以声明抛出异常的列表，throws 后面的异常类型可以是方法中产生的异常类型，也可以是它的父类
         * 
         * 2、声明抛出的异常举例：
         * public void readFile(String file) throws FileNotFoundException {
         *      ...
         *      // 读文件的操作可能产生FileNotFoundException类型的异常
         *      FileInputStream fis = new FileInputStream(file);
         * }
         * 
         * ep:
         * public class Test1 {
                public static void main(String[] args) throws Exception{ // 可以在main方法声明中继续抛出异常，main方法抛出的异常直接抛到虚拟机上去了，就不能通过写代码进行捕获处理了
                    B b = new B();
                    try { // 在这里尝试捕获类B中test()方法抛出的异常
                        b.test();
                    } catch (Exception e) {
                        e.printStackTrace(); // 捕获到异常，对异常进行处理
                    }
                }
           }

            class B {
                int i;
                public void test() throws Exception { // 可以使用throws在方法声明中抛出异常，异常类型可以是方法中产生的异常类型，也可以是它的父类(Exception，对象的多态，向上转型)，然后在调用方去捕获处理异常
                    B b = null;
                    System.out.println(b.i);
                }
            }
        * 
        * 3、重写方法声明抛出异常的原则
        * (1) 父类方法有抛出异常，子类重写父类该方法时，不一定需要抛出异常(如果不会出现异常，就不必抛出)，子类方法若需要抛出异常，子类方法抛出的异常范围不能比父类方法大
        * 例如：
        * public class A {
            public void methodA() throws IOException {

            }
          }

          public class B1 extends A {
              public void methodA() throws FileNotFoundException { // correct
                  ...
              }
          }

          public class B2 extends A {
              public void methodA() throws Exception { // correct
                  ...
              }
          }
        * 4、人工抛出异常
        * Java 异常类对象除了在程序执行过程中出现异常时由系统自动生成并抛出，也可以根据需要人工创建并抛出
        * · 首先要生成异常类对象，然后通过throws语句实现抛出操作(提交给Java运行环境)
        *       IOException e = new IOException();
        *       throw e;
        * · 可以抛出的异常必须是Throwable或其子类的实例。下面的语句在编译时将会产生语法错误：
        *       throw new String("want to throw");
        *
        * 5、创建用户自定义异常类
        * 用户自定义异常类MyException，用于描述数据取值范围错误信息。用户自己的异常类必须继承现有的异常类
        * 注意：Java提供的异常类一般是够用的，只有特殊的情况可能需要自己编写异常类，这种情况很少见
        */
        
        /**
         * Java集合概述
         * 1、Java集合类存放于java.util包中，是一个用来存放对象的容器
         * (1) 集合只能存放对象。比如你存放一个int类型的数据1放入集合中，其实它是自动转换成Integer类后存入的,Java中每一种基本类型都有对应的引用类型
         * (2) 集合存放的是多个对象的引用，对象本身还是存放在堆内存中
         * (3) 集合可以存放不同类型，不限数量的数据类型
         * 
         * 2、Java集合可分为Set、List和Map三种大体系
         * · Set：无序、不可重复的集合
         * · List：有序，可重复的集合
         * · Map：无序，具有映射关系的集合
         * 在JDK5之后，增加了泛型，Java集合可以记住容器中对象的数据类型
         * 
         * 3、HashSet
         * (1) 概念：
         * · HashSet是Set接口的典型实现，大多数时候使用Set集合时都使用这个实现类。我们大多数时候说的Set集合指的都是HashSet
         * · HashSet按Hash算法来存储集合中的元素，因此具有很好的存取和查找性能
         * (2) 特点：
         * · 不能保证元素的排列顺序：存在Set集合哪个位置是由这个对象的hashCode决定的
         * · 不可重复：指的是hashcode不相同
         * · HashSet不是线程安全的
         * · 集合元素可以是null
         * 注意：
         * 1、当向HashSet集合中存入一个元素时，HashSet会调用该对象的hashCode()方法来得到该对象的hashCode值，然后根据hashCode值决定该对象在HashSet中的存储位置
         * 2、如果两个元素的equals()方法返回true，但它们的hashCode()返回值不相等，hashSet将会把它们存储在不同的位置，但依然可以添加成功，即只要两个对象的hashCode()返回值不相等，就可以存放在HashSet中
         * 
         * (3) HashSet类中实现的方法都来源于Collection接口：HashSet类 -->(实现) Set接口 -->(继承) Collection接口
         * (4) HashSet集合判断两个元素相等的标准：两个对象通过equals()方法比较相等，并且两个对象的hashCode()方法返回值也相等
         * (5) 如果想要让集合只能存同样类型的对象，怎么做：使用泛型：Set<String> set1 = new HashSet<String>(); // 比如指定String类型为集合的泛型，那么这个集合就不能存String类型之外的类型了
         * (6) Set set = new HashSet(); <===>(等价于) Set<Object> set = new Set<Object>();
         * 
         * 例子：day10包中的Test3.java
         * 
         * 4、TreeSet
         * 概念：TreeSet是SortedSet接口的实现类，TreeSet可以确保集合元素处于排序状态。TreeSet支持两种排序方法：自然排序和定制排序。默认情况下，TreeSet采用自然排序。
         * 
         * TreeSet类 -->(实现) NavigableSet接口 -->(继承) SortedSet接口 -->(继承) Set接口 -->(继承) Collection接口
         * 
         * 4.1、自然排序：TreeSet会调用集合元素的compareTo(Object obj)方法来比较元素之间的大小关系，然后将集合元素按升序排列
         * · 如果this > obj，返回正数1
         * · 如果this < obj，返回负数-1
         * · 如果this = obj，返回0，则认为这两个对象相等
         * 注意：必须放入同样类的对象。(默认会进行排序)否则可能会发生类型转换异常。我们可以使用泛型来进行限制 ep: Set<Integer> set = new TreeSet<Integer>(); // 指定Integer类型为集合的泛型，这个集合就不能存Integer类型之外的类型了，即这个集合只能存Integer类型的对象
         * 
         * 4.2、定制排序：如果需要实现定制排序，则需要在创建TreeSet集合对象时，提供一个Comparator接口的实现类对象。由该Comparator对象负责集合元素的排序逻辑
         * 
         * 例子：day10包中的Test4.java
         */

        /**
         * List与ArrayList
         * · List代表一个元素有序、且可重复的集合，集合中每个元素都有其对应的顺序索引
         * · List允许使用重复元素，可以通过索引来访问指定位置的集合元素
         * · List默认按元素的添加顺序设置元素的索引
         * · List集合里添加了一些根据索引来操作集合元素的方法
         * ArrayList类 -->(实现) List接口 -->(继承) Collection接口
         * 
         * ArrayList和Vector
         * ArrayList和Vector是List接口的两个典型实现
         * 区别：
         * · Vector是一个古老的集合，通常建议使用ArrayList
         * · ArrayList是线程不安全的，而Vector是线程安全的
         * · 即使保证List集合是线程安全的，也不推荐使用Vector
         *  
         * 例子: day10包中的Test5.java
         */

        /**
         * Map
         * 概念：Map用于保存具有映射关系的数据，因此Map集合里保存两组值，一组值用于保存Map里的Key，另外一组值用于保存Map里的Value；Map中的key和value都可以是任何引用类型的数据，Map中的Key不允许重复，即同一个Map对象的任何两个Key通过equals()方法比较，返回false; Key和Value之间存在单向一对一关系，即通过指定的Key总能找到唯一的，确定的Value
         * 
         * HashMap & Hashtable
         * HashMap 和 Hashtable 是Map接口的两个典型实现类
         * 区别：
         * · Hashtable是一个古老的Map实现类，不建议使用
         * · Hashtable是一个线程安全的Map实现，但HashMap是线程不安全的
         * · Hashtable不允许使用null作为key和value，而HashMap可以
         * 注意：
         * · 与HashSet集合不能保证元素顺序一样，Hashtable、HashMap也不能保证其中key-value对的顺序
         * · Hashtable、HashMap判断两个Key相等的标准是：两个Key通过equals()方法返回true，hashCode值也相等
         * · Hashtable、相等的标准是：两个Value通过equalHashMap()判断两个Values方法返回true
         * 例子：day10包中的Test6.java
         * 
         * TreeMap
         * 概念：TreeMap存储Key-Value对时，需要根据Key 对key-value对进行排序。TreeMap可以保证所有的Key-Value对处于有序状态
         * 
         * TreeMap的Key的排序：
         * · 自然排序：TreeMap的所有的Key必须实现Comparable接口，而且所有的Key应该是同一个类的对象，否则将会抛出ClassCastException
         * · 定制排序(了解)：创建TreeMap时，传入一个Comparator对象，该对象负责对TreeMap中的所有key进行排序。此时不需要Map的Key实现Comparable接口
         * 例子：day10包中的Test7.java
         */

        /**
         * 操作集合的工具类：Collections
         * 1、Collections 是一个操作Set、List和Map等集合的工具类
         * 2、Collections 中提供了大量方法对集合元素进行排序、查询和修改等操作，还提供了对集合对象设置不可变、对集合对象实现同步控制等方法
         * 
         * 3、排序操作：
         * · reverse(List)：反转List中元素的排序
         * · shuffle(List)：对List集合元素进行随机排序
         * · sort(List)：根据元素的自然顺序对指定List集合元素按升序排序
         * · sort(List, Comparator): 根据指定的Comparator产生的顺序对List集合元素进行排序
         * · swap(List, int, int): 将指定list集合中的i处元素和j处元素进行交换
         * · Object max(Collection): 根据元素的自然顺序，返回给定集合中的最大元素
         * · Object max(Collection, Comparator): 根据Comparator指定的顺序，返回给定集合中的最大元素
         * · Object min(Collection)
         * · Object min(Collection, Comparator)
         * · int frequency(Collection, Object): 返回指定集合中指定元素的出现次数
         * · boolean replaceAll(List list, Object oldVal, Object newVal): 使用新值替换List对象中的所有旧值
         * 例子：day10包中的Test8.java
         * 
         * 4、同步控制：
         * Collections类中提供了多个synchronizedXxx()方法，该方法可将指定集合包装成线程同步的集合，从而解决多线程并发访问集合时的线程安全问题
         */

        /**
         * 泛型(Generic)
         * 1、为什么要有泛型：
         * (1) 泛型，JDK1.5新加入的，解决数据类型的安全性问题，其主要原理是在类声明时通过一个标识表示类中某个属性的类型或者是某个方法的返回值及参数类型。这样在类声明或实例化时只要指定好需要的具体的类型即可。
         * (2) Java泛型可以保证如果程序在编译时没有发出警告，运行时就不会产生ClassCastException异常。同时，代码更加简洁，健壮。
         * 2、Java中的泛型，只在编译阶段有效。在编译过程中，正确检验泛型结果后，会将泛型的相关信息擦除，并且在对象进入和离开方法的边界处添加类型检查和类型转换的方法。也就是说，泛型信息不会进入到运行时阶段
         * 例子: day11包中的Test1.java
         * 
         * 3、泛型的使用：
         * 3.1、泛型类
         * (1) 对象实例化时不指定泛型，默认为：Object
         * (2) 泛型不同的引用不能相互赋值
         * ep: 
         * class A<T> {
                private T key;

                public void setKey(T key){
                    this.key = key;
                }

                public T getKey(){
                    return this.key;
                }
            }
         * 例子：day11包中的Test1.java
         * 
         * 3.2、泛型接口
         * ep:
         * // 定义一个泛型接口
         * interface Generator<T> {
         *      T next();
         * }
         * 例子：day11包中的Test2.java
         * 
         * 3.3、泛型方法
         * 方法，也可以被泛型化，不管此时定义在其中的类是不是泛型化的。在泛型方法中可以定义泛型参数，此时，参数的类型就是传入数据的类型。
         * 泛型方法的格式：
         * public class DAO {
         *      // 无返回值的泛型方法
         *      public <E> void show(E e){
         *          System.out.println(e.toString());
         *      }
         *      
         *      // 有返回值的泛型方法
         *      public <T> T show1(T t){
         *          return t;
         *      }
         * }
         * 例子：day11包中的Test2.java
         * 
         * 3.4、通配符
         * 1、概念不确定集合中元素的具体数据类型，可使用?表示所有类型
         * ep:
         * public void test(List<?> list){
         *      System.out.println(list);
         * }
         * 
         * 2、有限制的通配符
         * 举例：
         * · <? extends Person> (无穷小, Person]
         * 只允许泛型为Person及Person子类的引用调用
         * 
         * · <? super Person> [Person, 无穷大)
         * 只允许泛型为Person及Person父类的引用调用
         * 
         * <? extends Comparable>
         * 只允许泛型为实现Comparable接口的实现类的引用调用
         * 
         * 例子：day11包中的Test3.java
         */

        /**
         * 枚举和注解
         * 1、枚举类概述：在某些情况下，一个类的对象是有限而且固定的。例如季节类，只能有4个对象
         * 1.1、手动实现枚举类：
         * · private 修饰构造器
         * · 属性使用private final 修饰
         * · 把该类的所有实例都使用 public static final 来修饰
         * ep:
         * // 单例模式(饿汉式单例)，私有化构造方法，私有化类变量，通过公共的静态方法返回实例化的对象
         * class SeaSon {
         *      private final String S_NAME;
         *      private final String S_DESC;
         * 
         *      private static Season spring = new Season("春天", "春天在哪里");
         *      private static Season summer = new Season("夏天", "好热");
         *      private static Season autumn = new Season("秋天", "秋高气爽");
         *      private static Season winter = new Season("冬天", "寒风阵阵"); // 相当于创建了4个单例
         * 
         *      private Season(String name, String desc){
         *          this.S_NAME = name;
         *          this.S_DESC = desc;
         *          System.out.println(this.S_NAME + ", " + this.S_DESC);
         *      }
         * 
         *      public static Season getSpring() {
         *          return spring;
         *      }
         * 
         *      public static Season getSummer() {
         *          return summer;
         *      }
         * 
         *      public static Season getAutumn() {
         *          return autumn;
         *      }
         * 
         *      public static Season getWinter() {
         *          return winter;
         *      }
         * }
         * 
         * public static void main(String[] args){
         *      Season.getSpring();
         *      Season.getSummer();
         *      Season.getAutumn();
         *      Season.getWinter();
         * }
         * 1.2、使用enum定义枚举类
         * · JDK 1.5 新增的enum关键字用于定义枚举类
         * · 枚举类和普通类的区别：
         *     · 使用enum定义的枚举类默认继承了java.lang.Enum类
         *     · 枚举类的构造器只能使用private访问控制符
         *     · 枚举类的所有实例必须在枚举类中显式列出(,分隔  ;结尾)。列出的实例系统会自动添加public static final 修饰
         *     · 所有的枚举类都提供了一个values方法，该方法可以方便地遍历所有地枚举值
         * · JDK 1.5 中可以在switch表达式中使用枚举类的对象作为表达式，case子句可以直接使用枚举值的名字，无需添加枚举类作为限制
         * · 若枚举只有一个成员，则可以作为一种单例模式的实现方式
         * 
         * · 实现接口的枚举类
         *      · 和普通Java类一样，枚举类可以实现一个或多个接口
         *      · 若需要每个枚举类在调用实现的接口方法呈现出不同的行为方式，则可以让每个枚举类分别来实现该方法
         * 例子：day11包中的Test4.java
         */

        /**
         * Annotation(注解)概述：
         * · 从JDK 5.0 开始，Java增加了对元数据(MetaData)的支持，也就是Annotation(注解)
         * · Annotation 其实就是代码里的特殊标记，这些标记可以在编译，类加载，运行时被读取，并执行相应的处理。通过使用Annotation，程序员可以在不改变原有逻辑的情况下，在源文件中嵌入一些补充信息
         * · Annotation 可以像修饰符一样被使用，可用于修饰包，类，构造器，方法，成员变量，参数，局部变量的声明，这些信息被保存在Annotation的"name=value"对中
         * · Annotation 能被用来为程序元素(类，方法，成员变量等)设置元数据
         * 
         * 基本的Annotation：
         * · 使用Annotation时要在其前面增加@符号，并把该Annotation 当成一个修饰符使用，用于修饰它支持的程序元素
         * · 三个基本的Annotation:
         *      · @Override: 限定重写父类方法，该注解只能用于方法
         *      · @Deprecated: 用于表示某个程序元素(类，方法等)已过时
         *      · @SuppressWarnings: 抑制编译器警告
         * 
         * 自定义Annotation
         * · 定义新的Annotation 类型使用 @interface 关键字
         * · Annotation 的成员变量在Annotation定义中以无参数方法的形式声明，其方法名和返回值定义了该成员的名字和类型
         * · 可以在定义Annotation的成员变量时为其指定初始值，指定成员变量的初始值可使用 default 关键字
         * · 没有成员定义的 Annotation 称为标记；包含成员变量的Annotation 称为元数据Annotation
         * 例子：day11包中的Test5.java
         * 
         * 注解作用：每当你创建描述符性质的类或者接口时,一旦其中包含重复性的工 作，就可以考虑使用注解来简化与自动化该过程
         * 资料：注解Annotation实现原理与自定义注解例子.pdf
         * 
         * 
         */

        /**
         * IO流
         * IO: Input、Output
         * 数据流：通过程序把一张图片放到一个文件夹 --> 把图片转化为一个数据集(例如二进制)，把这些数据一点一点传到文件夹，这个传递的过程就很类似于水的流动，我们就可以称这整个数据集是一个数据流
         * 数据流的分类：
         * · 文件流(数据流的读写都是基于文件的操作)：FileInputStream、FileOutputStream、FileReader、FileWriter
         * · 缓冲流(数据流的读写都是基于内存的操作)：BufferInputStream、BufferOutputStream、BufferReader、BufferWriter
         * · 转换流：InputStreamReader、OutputStreamWriter
         * · 标准输入/输出流
         * · 打印流(了解)：PrintStream(例如：System.out.println)、PrintWriter
         * · 数据流(了解)：DataInputStream、DataOutputStream
         * · 对象流(把一个对象转化为一个数据流进行读写) ---- 涉及序列化、反序列化：ObjectInputStream、ObjectOutputStream
         * · 随机(任意)存取文件流：RandomAccessFile，例如一个TXT文件，其中有100行数据，可以直接读取第50行数据，也可以在第89行插入数据，这个才是随机的概念
         * 
         * File类
         * · java.io.File类：文件和目录路径名的抽象表示形式，与平台无关
         * · File能新建、删除、重命名文件和目录，但File不能访问文件内容本身。如果需要访问文件内容本身，则需要使用输入/输出流。
         * · File对象可以作为参数传递给流的构造函数
         * · File类的常见构造方法：
         *      · public File(String pathname)：以pathname为路径创建File对象，可以是绝对路径或者相对路径，如果pathname是相对路径，则默认的当前路径在系统属性user.dir中存储
         *      · public File(String parent, String child): 以parent为父路径，child为子路径创建File对象
         * · File的静态属性String separator存储了当前系统的路径分隔符。在UNIX中，此字段为'/'，在Windows中，为'\\'
         * 
         * · 常用方法：
         *      · 访问文件名：
         *       - getName()
         *       - getPath()
         *       - getAbsoluteFile()
         *       - getParent()
         *       - renameTo(File newName)
         *      · 文件检测：
         *       - exists()
         *       - canWrite()
         *       - canRead()
         *       - isFile()
         *       - isDirectory()
         *      · 获取常规文件信息
         *       - lastModify()
         *       - length()
         *      · 文件操作相关
         *       - createNewFile()
         *       - delete()
         *      · 目录操作相关
         *       - mkDir()
         *       - list()
         *       - listFiles()
         * 例子：day12包中的Test.java
         * 
         * IO原理：
         * · IO流用来处理设备之间的数据传输
         * · Java程序中，对于数据的输入/输出操作以"流(stream)"的方式进行
         * · java.io包下提供了各种"流“类和接口，用以获取不同种类的数据，并通过标准的方法输入输出数据
         * 
         * · 输入input：读取外部数据(磁盘、光盘等存储设备的数据)到程序(内存)中
         * · 输出output: 将程序(内存)数据输出到磁盘、光盘等存储设备中
         * 
         * 流的分类
         * · 按操作数据单位的不同分为：字节流(8 bit)，字符流(16 bit)
         * · 按数据流的流向不同分为：输入流，输出流
         * · 按流的角色的不同分为：节点流，处理流
         * 抽象基类             字节流                      字符流
         * 输入流              InputStream                 Reader
         * 输出流              OutputStream                Writer
         * 
         * Java的IO流共涉及40多个子类，实际上非常规则，都是从以上4个抽象基类派生的。由这四类派生出来的子类名称都是以其父类名作为子类名的后缀
         * 分类         字节输入流              字节输出流              字符输入流          字符输出流
         * 抽象基类     InputStream            OutputStream            Reader             Writer
         * 访问文件     FileInputStream        FileOutputStream        FileReader         FileWriter
         * 访问数组     ByteArrayInputStream   ByteArrayOutputStream   CharArrayReader    CharArrayWriter
         * 访问管道     PipedInputStream       PipedOutputStream       PipedReader        PipedWriter
         * 访问字符串                                                  StringReader       StringWriter
         * 缓冲流       BufferInputStream      BufferOutputStream      BufferReader       BufferWriter
         * 转换流                                                      InputStreamReader  OutputStreamWriter
         * 对象流       ObjectInpuStream       ObjectOutputStream
         *             FilterInputStream      FilterOutputStream      FilterReader        FilterWriter
         * 打印流                              PrintStream                                PrintWriter
         * 推回输入流   PushbackInputStream                            PushbackReader
         * 特殊流       DataInputStream        DataOutputStream
         * 
         * · 文件字节输入流，文件字节输出流，字节流复制文件(FileInputStream、FileOutputStream)
         * 注意：文件字节流非常通用，可以用来操作字符的文档，还可以操作任何其他类型文件(图片，压缩包等等)，因为字节流直接传输的是二进制数据
         * 例子：day12包中的Test1.java
         * 
         * · 文件字符输入流(FileReader、FileWriter)
         * 读取文件操作步骤：
         * 1、建立一个流对象，将已存在的一个文件加载进流
         * FileReader fr = new FileReader("Test.txt");
         * 
         * 2、创建一个临时存放数据的数组
         * char[] ch = new char[1024];
         * 
         * 3、调用流对象的读取方法将流中的数据读入到数组中
         * fr.read(ch);
         * 
         * 注意：
         * 1、定义文件路径时，注意：可以用正斜杠"/"或者反斜杠(加了转义字符)"\\"
         * 2、在写入一个文件时，如果目录下有同名文件将被覆盖
         * 3、在读取文件时，必须保证该文件已存在，否则将会抛出异常
         * 例子：day12包中的Test2.java
         */

        /**
         * 缓冲流(基于内存的，比普通的流 多设置了一个内置缓冲区数组，减少系统IO次数，从而提高读写的效率)
         * 概念：为了提高数据读写的速度，Java API提供了带缓冲功能的流类，在创建流对象时，会创建一个内部默认大小的缓冲区数组，通过缓冲区读写，减少系统IO次数，从而提高读写的效率
         * 根据数据操作单位可以把缓冲流分为：
         * · BufferedInputStream和BufferedOutputStream
         * · BufferedReader和BufferedWriter
         * 
         * 缓冲流要“套接”在相应的节点流之上，对读写的数据提供缓冲功能，提高读写效率，并提供一些新的方法
         * 对于输出的缓冲流，写出的数据会现在内存中缓存，使用flush()将会是内存中的数据立刻写出
         * 
         * 使用缓冲流的原因：
         * FileInputStream、FileOutputStream、FileReader、FileWriter 这些都是计算机直接与硬盘发生io操作，基于硬盘的读写相对比较慢，其速度受到硬盘读写的制约，为了能够提高读写速度，一定程度上绕过硬盘的限制，Java提供了一种缓冲流来解决这个问题
         * 
         * 基本原理：使用基本的字节输入流读取文件，相当于文件中的数据，通过操作系统，在通过JVM一个个传入到内存中，这样的话，文件读取的速度比较慢。如果使用字节缓冲流，就可以建立一个缓冲区（相当于一个数组），将缓冲区里面的数据批量传入到文件中，这样的话就提高了文件的读取速度。
         * 总结：缓冲流就是先把数据缓冲到内存(JVM虚拟机)里，在内存中去做io操作，基于内存的io操作大概比基于基于硬盘的io操作快75000倍
         * 
         * flush:
         * java在使用流时,都会有一个缓冲区,按一种它认为比较高效的方法来发数据:把要发的数据先放到缓冲区,缓冲区放满以后再一次性发过去,而不是分开一次一次地发.
            而flush()表示强制将缓冲区中的数据发送出去,不必等到缓冲区满.
            所以如果在用流的时候,没有用flush()这个方法,很多情况下会出现流的另一边读不到数据的问题,特别是在数据特别小的情况下.

         * 例子：day12包中的Test.java、Test1.java
         */

        /**
         * 字符编码
         * 所有的文件都有编码格式，TXT和Java文件常用三种编码格式：ISO-8859-1(西欧编码，纯粹的英文编码，不适用于汉字)、GBK和UTF-8(这两种都适用英文和汉字)，UTF-8的适用性更好，一般使用UTF-8
         */

        /**
         * 转换流
         * 概念：转换流提供了在字节流和字符流之间的转换
         * 
         * · Java API 提供了两个转换流：InputStreamReader 和 OutputStreamWriter
         * · 字节流中的数据都是字符时，转换成字符流操作更高效
         * 
         * · InputStreamReader：用于将字节流中读取到的字节按指定字符集解码成字符。需要和InputStream "套接"
         * 构造方法：
         * InputStreamReader(InputStream in)
         * public InputStreamReader(InputStream in, String charsetName)
         * 例如：Reader isr = InputStreamReader(System.in, "ISO5334_1");
         * 注意：在将字节流转换成字符流的时候，设置的字符集编码要与读取的文件的字符集编码一致，不然就会出现乱码
         * 
         * 例子：day13包中的Test2.java
         */

        /**
         * 标准输入流输出流
         * · System.in 和 System.out 分别代表了系统标准的输入和输出设备
         * · 默认输入设备是键盘，输出设备是显示器
         * · System.in 的类型是InputStream
         * · System.out 的类型是PrintStream，其是OutputStream的子类FilterOutputStream的子类
         * 
         * System.in出现乱码的原因：
         * 因为这个开源项目的默认字符编码为UTF-8，所以控制台的字符编码也自动变成了UTF-8，而键盘的输入流的默认格式是GBK格式，这样就造成了在GBK转UTF-8的过程中产生的奇数乱码错误（这个问题的解释可以在搜索引擎找到）。
         * 
         * 例子：day13包中的Test3.java
         */

        /**
         * 打印流(了解)
         * 概念：在整个IO包中，打印流是输出信息最方便的类
         * 
         * · PrintStream(字节打印流)和PrintWriter(字符打印流)提供了一系列重载的print和println方法，用于多种数据类型的输出
         * · 特点：
         * PrintStream 和 printWriter 的输出不会抛出异常
         * PrintStream 和 printWriter 有自动flush功能
         * System.out返回的是PrintStream的实例
         * 
         */

        /**
         * 数据流(了解)
         * · 为了方便地操作Java语言的基本数据类型的数据，可以使用数据流。数据流有两个类：(用于读取和写出基本数据类型的数据) DataInputStream 和 DataOutputStream, 分别套接在InputStream 和 OutputStream 节点流上
         * · DataInputStream中的方法：
         * boolean readBoolean()
         * byte readByte()
         * char readChar()
         * float readFloat()
         * double readDouble()
         * short readShort()
         * long readLong()
         * int readInt()
         * String readUTF()
         * void readFully(byte[] b)
         * 
         * · DataOutputStream中的方法：
         * 将上述方法的read改为相应的write即可
         * 注意：用数据输出流写到文件中的基本数据类型的数据是乱码，不能直接辨认出来，需要数据输入流来读取
         * 用数据输入流读取数据输出流写到文件中的数据时，要保证使用和当时写的数据类型一致的类型来读取，也就是如果写的时候是writeDouble，读的时候就得是readDouble，否则读出来的数据没有意义
         * 
         * 例子: day13包中的Test4.java
         */

        /**
         * 对象流 ObjectInputStream 和 ObjectOutputStream
         * · 概念：用于存储和读取对象的处理流，它的强大之处就是可以把Java中的对象写入到数据源中，也能把对象从数据源中还原回来
         * · 产生原因：
         * 1、怎么把一个对象存储到电脑的硬盘上，硬盘存储的基础是什么？二进制，那就需要把对象序列化为一个二进制的字节流，把这个流保存在电脑上。要使用这个对象时，就把这个流还原成对象再使用
         * 2、怎么把对象通过网络传到另一台电脑上，网络的通信基础是什么？二进制，也就需要把一个对象转化为二进制的数据流，把这个数据流通过网络进行传输，接收者如果要使用接收的对象，就得先把对象的流还原成对象
         * 3、正是因为 要 保存对象到硬盘(对象的持久化)和对象的网络传输，所有产生了对象的输入和输出流
         * · 序列化(Serialize)：用ObjectOutputStream类将一个Java对象写入IO流中
         * · 反序列化(Deserialize): 用ObjectInputStream类从IO流中恢复该Java对象
         * · ObjectOutputStream和ObjectInputStream不能序列化static和transient修饰的成员变量
         * · 序列化和反序列化针对的是对象的各种属性，不包括类变量，类方法(static修饰)
         * 
         * 对象的序列化
         * · 对象的序列化机制：允许把内存中的Java对象转化成平台无关的二进制流，从而允许把这种二进制流持久地保存在磁盘上，或通过网络将这种二进制流传输到另一个网络节点。当其他程序获取了这种二进制流，就可以恢复成原来地Java对象
         * · 序列化的好处：在于可将任何实现了Serializable接口的对象转化为字节数据，使其在保存和传输时可被还原
         * · 序列化是RMI(Remote Method Invoke - 远程方法调用) 过程的参数和返回值都必须实现的机制，而 RMI 是JavaEE的基础。因此序列化机制是JavaEE平台的基础
         * · 如果需要让某个对象支持序列化机制，则必须让其类是可序列化的，为了让某个类是可序列化的，该类必须实现如下两个接口：
         * Serializable
         * Externalizable
         * 
         * · 凡是实现了Serializable接口的类都有一个表示序列化版本的标识符的静态变量：private static final long serialVersionUID;
         * · serialVersionUID 用来表明类的不同版本之间的兼容性
         * · 如果类没有显式定义这个静态变量，它的值是Java运行时环境根据类的内部细节自动生成的。若类的源代码做了修改，serialVersionUID可能发生变化。故建议，显式声明serialVersionUID
         * · 显式声明serialVersionUID的用途：
         * (1) 希望类的不同版本对序列化兼容，因此需确保类的不同版本具有相同的serialVersionUID
         * (2) 不希望类的不同版本对序列化兼容，因此需确保类的不同版本具有不同的serialVersionUID
         * 
         * 若某个类实现了Serializable接口，该类的对象就是可序列化的：
         * · 序列化：
         * 1、创建一个ObjectOutputStream
         * 2、调用ObjectOutputStream对象的 writeObject(对象) 方法输出可序列化对象。注意写出一次，操作flush()
         * · 反序列化：
         * 1、创建一个ObjectInputStream
         * 2、调用readObject() 方法读取流中的对象
         * 
         * 强调：如果某个类的字段不是基本数据类型或String类型，而是另一个引用类型，那么这个引用类型必须是可序列化的，否则拥有该类型的Field的类也不能序列化
         * 注意：对象的序列化与反序列化使用的类要严格一致：包名，类名，类属性，类方法等等都要一致，否则就会抛出异常
         * 例子：day13包中的Test5.java
         */

        /**
         * 随机存取流
         * RandomAccessFile 类
         * · RandomAccessFile 类支持“随机访问”的方式，程序可以直接跳到文件的任意地方来读、写文件
         *      · 支持只访问文件的部分内容
         *      · 可以向已存在的文件后追加内容
         * · RandomAccessFile对象包含一个记录指针，用以标示当前读写处的位置。
         * · RandomAccessFile类对象可以自由移动记录指针：
         *      · long getFilePointer(): 获取文件记录指针的当前位置
         *      · void seek(long pos)：将文件记录指针定位到 pos 位置
         * · 构造器：
         *      · public RandomAccessFile(File file, String mode)
         *      · public RandomAccessFile(String name, String mode)
         * · 创建RandomAccessFile类实例需要指定一个mode参数，该参数指定RandomAccessFile的访问模式：
         *      · r：以只读方式打开
         *      · rw：打开以便读取和写入
         *      · rwd：打开以便读取和写入；同步文件内容的更新
         *      · rws：打开以便读取和写入；同步文件内容和元数据的更新
         * 
         * 注意：换行符是\r\n占两个字节
         * ep:
         * 读取文件内容：
         * RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
         * raf.seek(5); // 设置文件记录指针 将文件记录指针定位到 5字节的 位置
         * byte[] b = new byte[1024];
         * int off = 0;
         * int len = 5;
         * raf.read(b, off, len);
         * String str = new String(b, 0, len);
         * System.out.println(str);
         * raf.close();
         * 
         * 写入文件内容：
         * RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
         * raf.seek(5);
         * // 先读出来
         * String temp = raf.readLine(); // 读一行数据
         * raf.seek(5);
         * raf.write("xykj".getBytes());
         * raf.write(temp.getBytes());
         * raf.close();
         * 
         * 注意：如果是在文件开头或者中间的某个位置开始写的话，就会用写的内容覆盖掉等长的原内容
         * 例子：day13包中的Test6.java
         * 
         * 流的基本应用小结：
         * · 流是用来处理数据的
         * · 处理数据时，一定要先明确数据源，与数据目的地
         *      · 数据源可以是文件，可以是键盘
         *      · 数据目的地可以是文件、显示器或者其他设备
         * 而流只是在帮助数据进行传输，并对传输的数据进行处理，比如过滤处理、转换处理等
         * 
         * 总结：
         * · 字节流-缓冲流(重点)
         *      · 输入流InputStream-FileInputStream-BufferedInputStream
         *      · 输出流OutputStream-FileOutputStream-BufferedOutputStream
         * · 字符流-缓冲流(重点)
         *      · 输入流Reader-FileReader-BufferedReader
         *      · 输出流Writer-FileWriter-BufferedWriter
         * · 转换流
         *      · InputStreamReader和OutputStreamWriter
         * · 对象流
         *      · ObjectInputStream 和 ObjectOutputStream(难点)
         *      · 序列化和反序列化
         * · 随机存取流：RandomAccessFile (掌握读取、写入)
         */

        /**
         * 反射
         * 概念：反射机制，就是通过一个抽象的类名，JVM能在自己的记忆(加载类的内存)中，找到相匹配的类的具体信息。
         * Java能够反射的前提：JVM已经加载过这个类，就可以通过类名来寻找到这个类的所有相关信息
         * 类比：就跟人类的记忆反射一样，事先在记忆中有了这个事物具体信息，人就可以通过名字在记忆中寻找相关事物的具体信息
         * 
         * Java Reflection
         * · Reflection(反射)是被视为动态语言的关键，反射机制允许程序在执行期借助于Reflection API取得任何类的内部信息，并能直接操作任意对象的内部属性及方法
         * 
         * Java 反射机制提供的功能
         * · 在运行时判断任意一个对象所属的类
         * · 在运行时构造任意一个类的对象
         * · 在运行时判断任意一个类所具有的成员变量和方法
         * · 在运行时调用任意一个对象的成员变量和方法
         * · 生成动态代理(重要)
         * 
         * 反射相关的主要API
         * · java.lang.Class：代表一个类
         * · java.lang.reflect.Method：代表类的方法
         * · java.lang.reflect.Field：代表类的成员变量
         * · java.lang.reflect.Constructor：代表类的构造方法
         */

        /**
         * - Class 类
         * · 在Object类中定义了一个以下方法，此方法将被所有子类继承：public final Class getClass()
         * · 以上方法的返回值的类型是一个Class类，此类是Java反射的源头，实际上所谓反射，从程序运行的结果来看也很好理解，即：可以通过对象反射求出类的名称
         * 例如：
         * String Integet Person Student 这些类，有没有一个统一的方法来描述这些类呢？有没有这样一个类，可以对任意的类进行高度的抽象，形成一个可以描述所有类的类？-->有，就是Class类
         * · 反射可以得到的信息：某个类的属性、方法和构造器、某个类到底实现了哪些接口。对于每个类而言，JRE都为其保留一个不变的Class类型的对象。一个Class对象包含了特定某个类的相关信息
         * · Class本身也是一个类
         * · Class对象只能由系统建立对象
         * · 一个类在JVM中只会有一个Class实例
         * · 一个Class对象对应的是一个加载到JVM中的一个.class文件
         * · 每个类的实例都会记得自己是由哪个Class实例所生成的
         * · 通过Class可以完整地得到一个类中的完整结构
         * 
         * Class类的常用方法
         * · static Class forName(String name) 根据类的全类名(包名+类名)获取Class对象
         * · Object newInstance() 创建目标类的对象
         * · getName() 获取全类名
         * · Class getSuperclass() 获取所有父类的Class对象
         * · Class[] getInterfaces() 获取所有实现的接口
         * · ClassLoader getClassLoader() 获取类的类加载器
         * · Constructor[] getConstructors() 获取所有的构造器
         * · Field[] getDeclareFields() 获取所有的属性
         * · Method getMethod(String name, Class ... paramTypes) 获取对应的方法
         * 
         * 实例化Class类对象(四种方法)
         * 1、前提：已知具体的类，通过类的class属性获取，该方法最为安全可靠，程序性能最高
         * ep: Class clazz = String.class;
         * 2、前提：已知某个类的实例，调用该实例的getClass()方法获取Class对象
         * ep: Class clazz = "www.xyd.com".getClass();
         * 3、已知一个类的全类名，且该类在类路径下，可通过Class类的静态方法forName()获取，可能抛出ClassNotFoundException
         * ep: Class clazz = Class.forName("java.lang.String");
         * 4、其他方式：
         * ep: ClassLoader cl = this.getClass().getClassLoader();
         * Class clazz4 = cl.loadClass("类的全类名");
         * 
         * 例子：day14包中的Person.java、Test.java
         * 
         * - 通过反射调用类的完整结构
         * · Field、Method、Constructor、Superclass、Interface、Annotation，实现全部的接口、继承的父类、全部的构造器、全部的方法、全部的Field
         * 
         * · 通过反射可以取得：
         * 1、通过反射可以获取全部的接口：
         * public Class<?>[] getInterfaces()：确定此对象所表示的类或接口实现的接口
         * 
         * 2、通过反射可以获取所继承的父类：
         * public Class<? Super T> getSuperclass()：返回表示此Class所表示的实体(类、接口、基本类型)的父类的Class
         * 
         * 例子：day14包中的Student.java、Test1.java
         * 
         * 3、通过反射可以获取类全部的构造器
         * · public Constructor<T>[] getConstructors()返回此Class对象所表示的类的所有public构造方法(获取类公有的构造方法)
         * · public Constructor<T>[] getDeclaredConstructors()返回此Class对象表示的类声明的所有构造方法(获取类的所有构造方法，包括公有的和私有的)
         * 
         * Constructor类中：
         * · 取得修饰符：public int getModifiers() // getModifiers()取得方法的修饰符，返回数1代表public，返回数2代表private
         * · 取得方法名称：public String getName();
         * · 取得参数的类型：public Class<?>[] getParameterTypes()
         * 
         * 例子: day14包中的Student.java、Test1.java
         * 
         * 4、通过反射来创建一个对象：day14包中的Student.java、Test1.java
         * 
         * 5、通过反射机制获取类的方法：
         * · public Method[] getDeclaredMethods(): 返回此Class对象所表示的类或接口的全部方法
         * · public Method[] getMethods(): 返回此Class对象所表示的类或接口的public方法
         * 
         * · Method类中：
         *      · public Class<?> getReturnType()取得全部的返回值
         *      · public Class<?>[] getParameterTypes()取得全部的参数
         *      · public int getModifiers()取得修饰符
         * 
         * 6、反射机制获取类的属性和包
         * · public Field[] getFields(): 返回此Class对象所表示的类或接口的public的Field
         * · public Field[] getDeclaredFields()：返回此Class对象所表示的类或接口的全部Field
         * 
         * Field方法中：
         * · public int getModifiers() 以整数形式返回此Field的修饰符
         * · public Class<?> getType() 得到Field的属性类型
         * · public String getName() 返回Field的名称
         * 
         * · 修饰符：0表示default、1代表public、2代表private
         * 
         * · Package getPackage()：获取类所在的包
         * 例子：day14包中的Student.java、Test1.java
         * 
         * 7、通过反射调用类中的指定方法、指定属性
         * · 调用指定方法：
         * 通过反射，调用类中的方法，通过Method类完成。步骤：
         * (1) 通过Class类的getMethod(String name, Class... ParameterTypes)方法取得一个Method对象，并设置此方法操作时所需要的参数类型
         * (2) 之后调用Object invoke(Object obj, Object[] args)进行调用，并向方法中传递要设置的obj对象的参数信息
         * 
         * · 调用指定属性
         *   在反射机制中，可以直接通过Field类操作类中的属性，通过Field类提供的set()和get()方法就可以完成设置和取得属性内容的操作
         *   · public Field getField(String name) 返回此Class对象表示的类或接口的指定的public的Field
         *   · public Field getDeclaredField(String name) 返回此Class对象表示的类或接口的指定的Field
         *   · 在Field中：
         *      · public Object get(Object obj) 取得指定对象obj上此Field的属性内容
         *      · public void set(Object obj, Object value) 设置指定对象obj上此Field的属性内容
         * 注：在类中属性都设置为private的前提下，在使用set()和get()方法时，首先要使用Field类中的setAccessible(true)方法将需要操作的属性设置为可以被外部访问
         * · public void setAccessible(true) 访问私有属性时，让这个属性可见
         * 
         * 例子：day14包中的Student.java、Test1.java
         */

        /**
         * Java动态代理
         * Proxy: 专门完成代理的操作类，是所有动态代理类的父类。通过此类为一个或多个接口动态地生成类
         * · 创建一个动态代理类所对应的Class对象
         *      static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) 直接创建一个动态代理对象
         * 注意：如果一个对象想要通过被 Proxy.newProxyInstance 方式被代理, 那么这个对象的类一定要有相应的接口, 就像本例的中 ITestDemo接口 和 实现类TestDemoImpl
         * 
         * · 动态代理步骤：
         * 1、创建一个实现接口 InvocationHandler 的类，它必须实现invoke方法，以完成代理的具体操作
         * 2、创建被代理的类以及接口
         * 3、通过Proxy的静态代理方法，newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h) 创建一个Subject接口代理
         * 4、通过Subject代理调用RealSubject实现类的方法
         * 
         * 例子：day14包中的ITestDemo.java、ITestDemoImpl.java、Test2.java
         */

        /**
         * 程序-进程-线程
         * - 程序(program)：是为完成特定任务、用某种语言编写的一组指令的集合。即指一段静态代码，静态对象。
         * - 进程(process)：是程序的一次执行过程，或是正在运行的一个程序。动态过程：有它自身的产生、存在和消亡的过程。
         *      · 如: 运行中的QQ，运行中的MP3播放器
         *      · 程序是静态的，进程是动态的
         * - 线程(thread)：进程可以进一步细化为线程，是一个程序内部的一条执行路径。
         *      · 若一个程序可同时执行多个线程，就是支持多线程的
         *      · 多线程：一个进程(一个程序运行时)，可以分化为并行执行的多个线程(多个子程序)
         * - 电脑的CPU核数：几核CPU，就代表同一个时刻能够处理的任务数(进程数)
         *      · 为什么电脑能开多于CPU核数的进程：因为有CPU处理任务时，有时间片轮转的机制，随时都在切换正在处理的任务
         *      · CPU主频：CPU切换任务的速度
         * 
         * - 何时需要多线程
         * · 程序需要同时执行两个或多个任务
         * · 程序需要实现一些需要等待的任务时，如用户输入、文件读写操作、网络操作、搜索等。
         * · 需要一些后台运行的程序时。
         * 注意：因为多线程是进程的支流，当分支之后，就各走各的，假设在进程上跑的代码是主程序，当其中的第三行代码是开启线程的，那么，开启线程之后线程运行的代码就和主程序并行(他们之间就不相干了)
         */
        
        /**
         * 多线程的创建和启动
         * · 概念：Java语言的JVM允许程序运行多个线程，它通过java.lang.Thread类来实现
         * 
         * · Thread类的特性：
         *      · 每个线程都是通过某个特定Thread对象的run()方法来完成操作的，经常把run()方法的主体称为线程体：多线程中运行的代码逻辑写到run()方法里
         *      · 通过该Thread对象的start()方法来调用这个线程：start()方法用来启动线程，本质上就是运行run()方法
         * 
         * · 构造方法：
         *      · Thread(): 创建新的Thread对象
         *      · Thread(String threadname): 创建线程并指定线程实例名
         *      · Thread(Runnable target): 指定创建线程的目标对象，它实现了Runnable接口中的run()方法
         *      · Thread(Runnable target, String name)：创建新的Thread对象
         * 
         * · 创建线程的两种方式：
         *      · 继承Thread类
         *      1) 定义子类继承Thread类
         *      2) 子类中重写Thread类中的run方法
         *      3) 创建Thread子类对象，即创建线程对象
         *      4) 调用线程对象的start方法：启动线程，调用run方法
         * 
         *      · 实现Runnable接口
         *      1) 定义子类，实现Runnable接口
         *      2) 子类中重写Runnable接口中的run方法
         *      3) 通过Thread类含参构造器创建线程对象
         *      4) 将Runnable接口的子类对象作为实际参数传递给Thread类的构造方法中
         *      5) 调用Thread类的start方法：开启线程，调用Runnable子类接口的run方法
         * 
         * · 继承方式和实现方式的联系和区别
         * - public class Thread extends Object implements Runnable
         * 
         *      · 区别：
         *          - 继承Thread：线程代码存放Thread子类run方法中，重写run方法
         *          - 实现Runnable: 线程代码存在接口的子类的run方法。实现run方法
         * 
         *      · 实现接口方式的好处：
         *          - 避免了单继承的局限性
         *          - 多个线程可以共享同一个接口实现类的对象，非常适合多个相同线程来处理同一份资源(一般使用实现接口方式来实现多线程)
         * 
         * · 使用多线程的优点
         * 1) 提高应用程序的响应。对图形化界面更有意义，可增强用户体验。
         * 2) 提高计算机系统CPU的利用率
         * 3) 改善程序结构。将既长又复杂的进程分为多个线程，独立运行，利于理解和修改
         * 例如：如果在一个方法里有1000行代码，前300，中间300，最后400行这三段代码没有因果关系，这种情况我们就可以使用线程处理，把前中后三段代码分别放在不同的线程中去运行，这样三段代码就是并行运行的
         * 例子：day15包中的TestThread.java、TestRunnable.java、Test.java
         * 
         * · Thread类的相关方法(1)
         *  - void start()：启动线程，并执行对象的run()方法
         *  - run(): 线程在被调用时执行的操作
         *  - String getName(): 返回线程的名称
         *  - void setName(String name): 设置该线程的名称
         *  - static currentThread(): 返回当前线程
         *  - static void yield(): 线程让步
         *      1) 暂停当前正在执行的线程，把执行机会让给优先级相同或更高的线程
         *      2) 若队列中没有同优先级的线程，忽略此方法
         *  - join(): 当某个程序执行流中调用其他线程的join()方法时，调用线程将被阻塞，直到join()方法加入的join线程执行完毕
         *      低优先级的线程也可以获得执行
         *  - static void sleep(long millisecond): (指定时间：毫秒)
         *      1) 令当前活动线程在指定时间段内放弃对CPU控制，使其他线程有机会被执行，时间到后重排队
         *      2) 抛出InterruptedException异常
         *  - stop(): 强制线程生命期结束
         *  - boolean isAlive(): 返回boolean，判断线程是否还活着
         * 
         * · 线程的优先级(线程的优先级，就是哪个线程有较大的概率被执行，优先级用数字1-10表示，数字越大优先级越高，如果没有设置，默认优先级是5)
         * - 线程的优先级控制：
         *   MAX_PRIORITY(10);
         *   MIN_PRIORITY(1);
         *   NORM_PRIORITY(5);
         * - 涉及的方法：
         *   getPriority()：返回线程优先级
         *   setPriority(int newPriority): 改变线程优先级
         *   线程创建时继承父线程的优先级
         */

        /**
         * 线程的生命周期
         * JDK 中用 Thread.State 枚举表示了线程的几种状态
         * · 要想实现多线程，必须在主线程中创建新的线程对象。Java语言使用Thread类及其子类的对象来表示线程，在它的一个完整的生命周期中通常要经历如下的五种状态：
         * - 新建：当一个Thread类或其子类的对象被声明并创建时，新生的线程对象处于新建状态
         * - 就绪：处于新建状态的线程被start()后，将进入线程队列等待CPU时间片，此时它已具备了运行的条件
         * - 运行：当就绪的线程被调用并获得处理器资源时，便进入运行状态，run()方法定义了线程的操作和功能
         * - 阻塞：在某种特殊情况下，被人为挂起或执行输入输出操作时，让出CPU并临时中止自己的执行，进入阻塞状态：阻塞发生的条件可能是时间片到了，或者缺少资源
         * - 死亡：线程完成了它的全部工作或线程被提前强制性中止
         * 
         * 线程的生命周期：
         * 
         * 
         *                                   阻塞 
         *     sleep()时间到         /                  \      sleep()
         *      获取同步锁          /                    \    等待同步锁
         *  notify()/notifyAll()  /                      \  wait()/join()
         *    resume()           /                        \  suspend()
         *       start()        /    获得CPU执行权          \
         * 新建 -----------> 就绪 -----------------------> 运行 --------> 死亡
         *                       <-----------------------             正常执行完run()
         *                          失去CPU执行权、yield()             Error/Exception未处理stop()
         */     
        
        /**
         * 线程的同步
         * - 问题的提出：
         * 1) 多个线程执行的不确定性引起执行结果的不稳定
         * 2) 多个线程对账本的共享，会造成操作的不完整性，会破坏数据
         * 
         * - 问题原因：
         *  当多条语句在操作同一个线程共享数据时，一个线程对多条语句只执行了一部分，还没有执行完，另一个线程参与进来执行。导致共享数据的错误
         * 
         * - 解决办法：
         *  对多条操作共享数据的语句，只能让一个线程都执行完，在执行过程中，其他线程不可以参与执行
         * 
         * - Synchronized 的使用方法
         *   Java对于多线程的安全问题提供了专业的解决方式：
         * 1、 同步机制
         * · synchronized还可以放在方法声明中，表示整个方法为同步方法。
         * 例如：
         * public synchronized void show(String name){
         *  ...
         * }
         * · synchronized(对象) {
         *      // 需要被同步的代码;
         * }
         * 总结：
         * 1、普通方法加同步锁synchronized，锁的是当前方法对应的对象，当前的对象的所有加了同步锁的方法是共用一个同步锁(锁的是一个对象)
         * 2、静态方法加同步锁synchronized，对于所有的对象都是使用同一个锁(锁的是所有对象)
         * 3、代码块加入同步锁synchronized - 代码块:synchronized(this){}, 所有当前对象同步的该代码块都是使用同一个锁
         * 4、代码块加入同步锁synchronized - 代码块:synchronized(对象){}, 不同对象的该代码块有不同的同步锁
         * 
         * 线程的死锁问题：
         * · 死锁：不同的线程分别占用对方需要的同步资源不放弃，都在等待对方放弃自己需要的同步资源，就形成了线程的死锁
         * 
         * · 解决方法：
         *  - 专门的算法、原则，比如加锁顺序一致
         *  - 尽量减少同步资源的定义，尽量避免未释放的场景
         * 
         * 例如：
         * 线程a0，需要执行方法f0
         * 线程a1, 需要执行方法f1
         * f0和f1都有同步锁的方法
         * 现在的情况是：
         * a0调用f1方法并且一直没有执行完f1
         * a1调用f0方法并且一直没有执行完f0
         * 
         * 导致a0和a1线程都在等待对方释放方法，对方都不释放，这样就形成了线程的死锁
         */

        /**
         * 线程通讯
         * wait()与notify()和notifyAll()
         * - wait()：令当前线程挂起并放弃CPU、同步资源，使别的线程可访问并修改共享资源，而当前线程排队等候再次对资源的访问
         * - notify()：唤醒正在排队等候同步资源的线程中优先级最高者结束等待
         * - notifyAll()：唤醒正在排队等待资源的所有线程结束等待
         * 
         * 注意：Java.lang.Object提供的这三个方法只有在synchronized方法或synchronized代码块中才能使用，否则会报java.lang.IllegalMonitorStateException异常
         * 
         * - wait()方法
         * 在当前线程中调用方法：对象名.wait()
         * 使当前线程进入等待(某对象)状态，直到另一线程对该对象发出notify(或notifyAll)为止
         * 调用方法的必要条件：当前线程必须具有对该对象的监控权(加锁)
         * 调用此方法后，当前线程将释放对象监控权，然后进入等待
         * 在当前线程被notify后，要重新获得监控权，然后从断点处继续代码的执行
         * 
         * - notify()/notifyAll()
         * 在当前线程中调用方法: 对象名.notify()
         * 功能：唤醒等待该对象监控权的一个线程
         * 调用方法的必要条件：当前线程必须具有对该对象的监控权(加锁)
         */

        /**
         * 经典例题：生产者/消费者问题
         * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，店员一次只能持有固定数量的产品(比如20)，如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品了再通知生产者继续生产：如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品
         * 
         * 这里可能出现两个问题：
         * 1、生产者比消费者快时，消费者会漏掉一些数据没有取到
         * 2、消费者比生产者快时，消费者会取相同的数据
         */
    }

    // 方法只有在被调用后才会被执行
    public static int getArea(int x, int y) {
        // 同一个类中，所有方法可以直接互相调用，不用new去实例化一个对象
        // 在main方法中，方法有static修饰符修饰的可以直接调用，否则必须实例化(static方法只能访问static类型的成员变量)
        // public void xxx(){} 方法中不能再定义方法
        return x * y;
    }

    /**
     * 方法的重载(overload)：在同一个类中，允许存在一个以上同名的方法，只要他们的参数个数或者参数类型不同即可(参数的顺序不同也行)。
     */
    public int add(int x, int y) {
        return x + y;
    }

    public double add(int x, double y) {
        return x + y;
    }

    public double add(double x, int y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

    /**
     * 传递可变个数的参数
     */
    /**
     * 用数组的方式传递可变个数的参数 如果没有参数，就要定义一个空数组，然后传递该空数组
     * 
     * @param args
     */
    public void printInfo(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    /**
     * 用java特有的...的方式来传递可变个数的参数，这种参数在使用时与数组的使用方式相同 如果没有参数，可以不传递参数 ...可以传递0个或多个参数
     * 
     * @param args
     */
    public void printInfo1(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    /**
     * 如果一个方法有多个形参，可变形参(...)一定要放在最后
     * 
     * @param a
     * @param h
     * @param args
     */
    public void printInfo1(int a, double h, String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    /**
     * 方法的参数传递-值传递(基本数据类型)
     * 
     * @param i
     */
    public static void swap(int i) {
        i = 6;
        System.out.println("swap 方法里，i的值是" + i); // 6
    }

    /**
     * 方法的参数传递-值传递(引用数据类型)
     * 
     * @param ds1
     */
    public static void swap(DataSwap ds1) {
        ds1.a = 6;
        System.out.println("在swap方法中，ds1.a的值是：" + ds1.a); // 6
    }

    public void method(day07.Person e) {
        if (e instanceof day07.Student) {
            day07.Student s = (Student) e;
            s.getSchool();
        }else {
            e.test();
        }
    }
}