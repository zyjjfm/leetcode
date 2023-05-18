import java.util.ArrayList;
import java.util.List;

public class Solution163 {

/**
给你一个闭区间[lower, upper] 和一个 按从小到大排序 的整数数组 nums，其中元素的范围在闭区间[lower, upper]当中。
如果一个数字 x 在 [lower, upper]区间内，并且 x 不在 nums 中，则认为 x 缺失。
返回准确涵盖所有缺失数字的 最小排序 区间列表。也就是说，nums 的任何元素都不在任何区间内，并且每个缺失的数字都在其中一个区间内。
*/

public static List<String>  findMissingRanges(int[] nums,int lower,int upper){

    List<String> ans = new ArrayList<>();
    int n = nums.length;

    if(n == 0){
        ans.add(helper(lower-1, upper+1));
        return ans;
    }

    if(lower < nums[0]){
        ans.add(helper(lower - 1, nums[0]));
    }

    for(int idx = 0;idx < n - 1;++idx){
        if(nums[idx] +1 != nums[idx + 1]){
            ans.add(helper(nums[n - 1], nums[idx + 1]));
        }
    }
    if (upper > nums[n - 1]){
        ans.add(helper(nums[n - 1], upper + 1));
    };
    return ans;
}
    public static String helper(int left,int right){
        StringBuilder builder = new StringBuilder();
        if(left + 2 == right){
            builder.append(left+1);
        }else{
            builder.append(left + 1).append("->").append(right -1);
        }
        return builder.toString();
    }
}
