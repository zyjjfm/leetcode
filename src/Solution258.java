public class Solution258 {
    
    /**
    * 258. 各位相加
    * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
    */
    public int addDigits(int num) {
        while(num > 0){
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
