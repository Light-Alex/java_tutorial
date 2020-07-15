public class Test1 {
    public static void main(String[] args){
        // /* 在使用扩展赋值运算时，变量在参与运算时会把结果自动强制转换为当前变量的类型 */
        // int i = 1;
        // i *= 0.1; // 0.1取整为0
        // System.out.println(i); //i = 0

        // /* 逻辑与& 与 短路与&& 的区别 */
        // int i = 0;
        // int k = 1;
        // // // 逻辑与& 两边都需要参与运算
        // // System.out.println(i != 0 & ++k == 2); // false
        // // System.out.println(k);  // 2

        // // 短路与&& 如果左边为true，右边参与运算；如果左边为false，右边不参与运算
        // System.out.println(i != 0 && ++k == 2); // false
        // System.out.println(k);  // 1

        // // 逻辑或| 和 短路或|| 区别同理，短路或|| 表示：当左边为真，右边就不参与运算

        // /* 有符号右移>> 和 无符号右移>>> 的区别 */
        // // 有符号右移>> 是看首位是0还是1，是0右移后前面补0，是1右移后前面补1
        // // 1111 1111 1111 1111 1111 1111 1110 0001 >> 2 => 1111 1111 1111 1111 1111 1111 1111 1000

        // // 无符号右移>>> 不管首位是0还是1，右移后前面补0
        // // 1111 1111 1111 1111 1111 1111 1110 0001 >>> 2 => 0011 1111 1111 1111 1111 1111 1111 1000
        // System.out.println(31 << 28); // -268435456
        // int a = (int)(Math.pow(2, 28));
        // System.out.println(a); // 268435456

        // /* 一维数组初始化 */
        // // 动态初始化: 声明数组并为数组元素分配空间与赋值操作分开进行
        // // 使用动态初始化时，数组的元素有默认值，数字类型默认值为0，对象默认值为null，布尔类型默认值为false
        // int arr[] = new int[3];
        // arr[0] = 3;
        // arr[1] = 9;
        // arr[2] = 8;

        // // 静态初始化: 声明数组，为数组元素分配空间并赋值
        // int a[] = new int[]{3, 9, 8};
        // // int a[] = {3, 9, 8};

        // boolean s[] = new boolean[2];
        // System.out.println(s.length);

        // /* 数组的常见算法 */
        // int arr[] = new int[]{4, 2, 7, 1, 3, 5};

        // // 数组的复制
        // int copy[] = new int[arr.length];
        // for(int i = 0; i < arr.length; i++){
        //     copy[i] = arr[i];
        // }
        
        // // 数组的反转
        // int temp[] = new int[arr.length];
        // for(int i = 0; i < arr.length; i++){
        //     temp[i] = arr[arr.length - 1 - i];
        // }

        // // 冒泡排序(从小到大)
        // for(int i = 0; i < arr.length - 1; i++){
        //     for(int j = 0; j < arr.length - 1 - i; j++){
        //         if(arr[j] > arr[j+1]){
        //             int tmp = 0;
        //             tmp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = tmp;
        //         }
        //     }
        // }

        // // 打印数组
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        
        // int array1[], array2[];
        // array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        // for(int i = 0; i < array1.length; i++){
        //     System.out.print(array1[i] + " ");
        // }
        // System.out.print("\n");
        // // array2 和 array1 引用了同一个内存地址
        // array2 = array1;
        // for(int i = 0; i < array2.length; i++){
        //     if(i % 2 == 0){
        //         array2[i] = i;
        //     }
        // }
        // for(int i = 0; i < array1.length; i++){
        //     System.out.print(array1[i] + " ");
        // }
        // System.out.print("\n");
        // for(int i = 0; i < array2.length; i++){
        //     System.out.print(array2[i] + " ");
        // }
        // System.out.print("\n");

        
    }
}