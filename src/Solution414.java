import java.util.Arrays;

public class Solution414 {
    /*
    // 414. 第三大的数

    给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。

    */

    public int thirdMax(int[] nums){

        Arrays.sort(nums);
        reverse(nums);
        for(int i = 1,diff = 1;i<nums.length;++i){ 
            if(nums[i] != nums[i -1] && ++diff == 3){
                return nums[i];
             }
            }
            return nums[0];
        }
    public void reverse(int[] nums){

        int left = 0,right = nums.length -1;
        while(left < right){
            int temp = nums[left];
            nums[left] =  nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

}






