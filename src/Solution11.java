public class Solution11 {
    
    // 11. 盛最多水的容器
    // 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。

    // https://leetcode-cn.com/problems/container-with-most-water/


    public int maxArea(int[] height) {

        int l = 0,r = height.length - 1;

        int ans = 0;

        while(l < r){

            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            
            if(height[l] <= height[r]){
                ++l;
            }else{
                --r;
            }
        }
        return ans;
    }
}
