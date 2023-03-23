public class Solution11 {

    // 11. 盛最多水的容器
    // https://leetcode-cn.com/problems/container-with-most-water/
    public int maxArea(int[] height) {
        int i = 0,j = height.length - 1, res = 0;
         while(i < j){

            res = height[i] < height[j] ? 
            Math.max(res, (j - i) * height[i++]) :
            Math.max(res, (j - i) * height[j--]);
         }
        return res;
    }
}
