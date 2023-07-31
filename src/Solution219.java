import java.util.Map;

public class Solution219 {

    // 219. 存在重复元素 II
    /**
     给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，
     满足 nums[i] == nums[j] 且 abs(i - j) <= k 。
     如果存在，返回 true ；否则，返回 false 。 
    */
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        int length = nums.length;

        for(int i = 0;i < length;i++){
            int num = nums[i];
            if(map.containsKey(num) && i - map.get(num) <= k){
                return true;
            }
            map.put(num, i);
        }
        return false;
    }
}
