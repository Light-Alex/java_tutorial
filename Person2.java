/**
 * 一个javabean
 * 私有的属性
 * 属性对应的get和set方法
 * @author ycx
 * 
 */
public class Person2 {
    private String name; // 姓名
    private int sex; // 性别，0男1女
    private int age; // 年龄

    // 自动生成set和get方法，鼠标右键，点击source，然后点击Generate Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }    

    // 手写set和get方法
    // public void setName(String name){
    //     this.name = name;
    // }

    // public String getName(){
    //     return this.name;
    // }

    // public void setSex(int sex){
    //     this.sex = sex;
    // }

    // public int getSex(){
    //     return this.sex;
    // }

    // public void setAge(int age){
    //     this.age = age;
    // }

    // public int getAge(){
    //     return this.age;
    // }
}