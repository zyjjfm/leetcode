import java.util.Arrays;

public class Solution66 {
    
       /**
        方法一：排序
        首先将数组排序。
        如果数组中全是非负数，则排序后最大的三个数相乘即为最大乘积；如果全是非正数，则最大的三个数相乘同样也为最大乘积。
        如果数组中有正数有负数，则最大乘积既可能是三个最大正数的乘积，也可能是两个最小负数（即绝对值最大）与最大正数的乘积。
        综上，我们在给数组排序后，分别求出三个最大正数的乘积，以及两个最小负数与最大正数的乘积，二者之间的最大值即为所求答案。
        
        */
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
    
        int n = nums.length;

        return Math.max(nums[0] * nums[1] * nums[n - 1],);
    }
}
