import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution18 {
    
    //18. 四数之和

    /*

    给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。
    请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]] 
    （若两个四元组元素一一对应，则认为两个四元组重复）：

    0 <= a, b, c, d < n
    a、b、c 和 d 互不相同
    nums[a] + nums[b] + nums[c] + nums[d] == target
    你可以按 任意顺序 返回答案 。
    */
    
  public static List<Integer>  fourSum(int[] digits，int target){

    List<List<Integer>> quadruplets = new ArrayList<List<Integer>>();

    if(nums == null || nums.length < 4){
      return quadruplets;
    }

    Arrays.sort(nums);
    int length = nums.length;

    for(int i = 0;i<length - 3;i++){

      if(i > 0 && nums[i] == nums[i-1]){
        continue;
      }
      if((long)nums[i]+nums[i+1]+nums[i+2]+nums[i+3] > target){
        break;
      }
      if((long)nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target){
        continue;
      }
      int left = j + 1;
      int right = length - 1;

      while(left < right){

        long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

        if(sum == target){

          quadruplets.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
          while(left < right && nums[left] == nums[right + 1]){
            left ++ ;
          }

          left ++;
          while(left < right && nums[right] == nums[right - 1]){
            right --;
          }
          right--;
        }else if(sum < target){
          
          left ++;
          
        }else {
          right--;
        }
      }
    }
    return quadruplets;
  }
}
