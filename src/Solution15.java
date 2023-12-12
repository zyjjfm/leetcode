import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {

    /* 

     给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
     同时还满足 nums[i] + nums[j] + nums[k] == 0 。
     你返回所有和为 0 且不重复的三元组。

    */


    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>>  ans = new ArrayList<List<Integer>>();   


        // 枚举 a
        for(int first = 0; first < n; ++first){
            // 需要和上一次枚举数不相同
            if(first > 0 && nums[first] == nums[first - 1]){
                continue;
            }

            // 对应的指针初始值指向数组的右端
            int third = n - 1;
            int target = -nums[first];

            // 枚举 b
            for(int second = first + 1;second < n;++second){

                // 需要和上一次枚举的数不相同
                if(second > first + 1 && nums[second] == nums[second - 1]){
                    continue;
                }
                // 需要保证 b的指针在c的指针的左侧
                while ( second < third && nums[second] + nums[third] > target) {
                    -- third;
                }
                //如果指针重合，随着b后续的增加
                if( second == third){
                    break;
                }

                if(nums[second] + nums[third] == target){

                    List<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);

                }
            }
        }
        return  ans;
    }
}
