public class Solution69 {
    // 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。  注意：不允许使用任何内置的库函数，如  sqrt 。 


    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        int ans = (int) Math.exp(0.5 * Math.log(x));
        return (long)(ans + 1) *(ans + 1) <= x ? ans + 1 :ans;
    }
}
