import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.text.html.parser.Element;

public class Solution349 {
/*

349. 两个数组的交集
给定两个数组 nums1 和 nums2 ，返回 它们的交集 。
输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序。

*/
public int[] intersection(int[] nums1, int[] nums2){

    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int length1 = nums1.length;
    int length2 = nums2.length;

    int[] intersection = new int[length1+length2];

    int index = 0;
    int index1 = 0;
    int index2 = 0;
    while(index1 < length1 && index2 < length2){
        int num1 = nums1[index1];
        int num2 = nums2[index2];

        if(num1 == num2){
            //保证加入元素的一致性
            if(index == 0 || num1 != intersection[index - 1]){
                intersection[index++] = num1;
            }
            index1++;
            index2++;
        }else if(num1 < num2){
            index1++;
        }else{
            index2 ++;
        }
    }

    return Arrays.copyOfRange(intersection, 0, index);
 }
}
