import java.util.ArrayList;

public class Solution389 {
    /*
    389. 找不同
    给定两个字符串 s 和 t ，它们只包含小写字母。
    字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
    请找出在 t 中被添加的字母。
    */
    public boolean isPerfectSquare(int num){

      int left = 0, right = num;
      while(left <= right ){

        int mid = (right - left )/2 + left;
        long square = (long) mid * mid;
  
        if(square < num){
          left = mid +1;
        }else if(square > num){
          right = mid -1;
        }else{
          return true;
        }
      }
      return false;
    }
  }
