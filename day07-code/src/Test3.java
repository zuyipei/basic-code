import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
    /*
         * 定义方法实现随机产生一个5位的验证码
         * 验证码格式：
         * 长度为5
         * 前四位是大写字母或者小写字母
         * 最后一位是数字
     */

        //方法：
        //如果以后我们要在一堆没有什么规律的树中随机抽取
        //我们可以把这一堆树放到一个数组中，然后随机抽取数组中的元素（用索引）

        //1.定义一个数组，把所有的大写字母和小写字母以及数字放到数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (65 + i);
            }else {
                chs[i] = (char) (97 + i - 26);
            }
        }

        //2.字母
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result += chs[randomIndex];
        }
        //3.数字
        int number = r.nextInt(10);
        //4.拼接输出
        result += number;
        System.out.println(result);


    }
}