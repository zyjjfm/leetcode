public class Solution441 {
    
      /**

        441. 排列硬币

        你总共有n枚硬币，并计划将它们按阶梯状排列。对于一个由 k 行组成的阶梯，其第 i 行必须正好有 i 枚硬币。
        阶梯的最后一行可能是不完整的。
        给你一个数字 n ，计算并返回可形成完整阶梯行的总行数。
      */
       public int arrangeCoins(int n) {

        int left = 1;
        int right = n;

        while(left < right){
            int mid = (right - left + 1)/2 + left;

            if(mid * (mid +1) <= (long) 2 * n){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
}
