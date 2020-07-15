package day09;
/**
 * 这个是描述会唱歌的厨子是一个老师
 */
public class Teacher extends Person1 implements Cooking, Singing{

    String course; // 教的科目

    public void setInfo(){
        super.age = 27;
        super.name = "王富贵";
        super.sex = 1;
        this.course = "数学";

    }

    @Override
    public void showInfo() {
        System.out.println("会唱歌的厨子的老师的信息：");
        System.out.println(super.age);
        System.out.println(super.name);
        System.out.println(super.sex);
        System.out.println(this.course);
    }

    @Override
    public void singing() {
        System.out.println(super.name + "老师擅长美声唱法");
    }

    @Override
    public void fry() {
        System.out.println(super.name + "老师拿手的厨艺是炒菜");
    }
    
}