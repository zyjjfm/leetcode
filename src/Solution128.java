import java.util.HashSet;
import java.util.Set;

public class Solution128 {
    
    // 128. 最长连续序列
    // 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。

    public int longestConsecutive(int[] nums) {

        Set<Integer> num_set = new HashSet<Integer>();

        for(int num:nums){

            num_set.add(num);
        }

        int longestStreak = 0;

        for(int num:num_set){

            if(!num_set.contains(num - 1)){

                int currentNum = num;

                int currentStreak = 1;

                while(num_set.contains(currentNum + 1)){

                    currentNum += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(currentStreak, longestStreak);
            }
        }

        return longestStreak;
    }
}
