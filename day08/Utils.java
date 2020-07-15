package day08;

public class Utils {
    
    // 判断一个字符串是否是空字符串
    public static boolean isEmpty(String s){
        boolean flag = true;
        if(s != null && s.equals("") == false){
            flag = false;
        }
        return flag;
    }

    public void ss(){
        Chinese.showCount();
    }
}