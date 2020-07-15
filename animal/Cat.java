/**
 * java中包的概念和文件夹的概念类似，包的存在为了解决文件太乱不好管理和文件同名问题
 * 包对应于文件系统的目录，package语句中，用"."来指明包(目录)的层次，ep: package animal.hello
 * 包通常用小写单词，类名首字母通常大写
 * 
 * import语句告诉编译器去哪寻找类
 * 语法格式: import 包名[.子包名...].<类名>
 * ep: import animal.hello.H 引入animal.hello子包下的H类
 *     import animal.hello.* 表示引入animal.hello子包下的所有类
 * @author ycx
 * 
 */
package animal;

import animal.hello.H;

public class Cat {
    H h = new H();
    // or animal.hello.H h2 = new animal.hello.H();
}