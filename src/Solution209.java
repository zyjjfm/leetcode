public class Solution30 {
    
    /*  

        209 长度最小的子数组

        给定一个含有 n 个正整数的数组和一个正整数 target 。

        找出该数组中满足其总和大于等于 target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。

    */

    public int minSubArrayLen(int s, int[] nums) {
        
        int n = nums.length;
        if(n == 0){
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        int start = 0,end = 0;
        int sum = 0;


        while (end < n) {
            sum += nums[end];
            while(sum >= s){
                ans = Math.min(ans,end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0:ans;
    }
}
