import java.util.Arrays;

public class Solution88 {

    /**
     
        给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，
        另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
        请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。

    */
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {        

        for(int i = 0;i != n;++i){

            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}






