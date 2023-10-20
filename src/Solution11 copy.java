public class Solution26 {
    
    // 26. 删除有序数组中的重复项
    
    /**
        给你一个 非严格递增排列 的数组 nums ，
        请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，
        返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
    */

    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        if(n == 0){
            return 0;
        }

        int fast = 1;
        int slow = 1;

        while(fast < n){
            if(nums[fast] != nums[fast - 1]){
                nums[slow] = nums[fast];
                ++ slow;
            }


        }
        return slow;
    }
}
