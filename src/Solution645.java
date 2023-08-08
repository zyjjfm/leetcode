import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution645 {
    /*
    645. 错误的集合
    
    集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，
    导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，导致集合 丢失了一个数字 并且 有一个数字重复 。
    给定一个数组 nums 代表了集合 S 发生错误后的结果。
    请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。

    */


    public int[] findErrorNums(int[] nums) {

        int[] errorNums = new int[2];
        int n = nums.length;
        Arrays.sort(nums);
        int pre = 0;
        
        for(int i = 0;i< n;i++){ 
            int curr = nums[i];
            if(curr == pre){
                errorNums[0] = pre;
            }else if(curr - pre > 1){
                errorNums[1] = pre + 1;
            }
            pre = curr;
        }
        if(nums[n - 1] != n){
            errorNums[1] = n;
        }
        return errorNums;
    }
  }
