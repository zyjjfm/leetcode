import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution345 {

    /*
    345. 反转字符串中的元音字母
    
    二分查找
    
    给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
    元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现不止一次。
    */
    public String reverseVowels(String s){

      int n = s.length();
      char[] arr = s.toCharArray();
      int i = 0, j = n - 1;
      while(i < j){
        while(i < n && !isVowel(arr[i])){
          ++i;
        }
        while(j > 0 && !isVowel(arr[j])){
          --j;
        }
        if(i < j){
          swap(arr, i, j);
          ++i;
          --j;
        }
      }

      return new String(arr);
    }

    public boolean isVowel(char ch){
      return "aeiouAEIOU".indexOf(ch) >= 0;
    }
    public void swap(char[] arr,int i,int j){
      char temp = arr[i];
      arr[i] =arr[j];
      arr[j] = temp;
    }
}
