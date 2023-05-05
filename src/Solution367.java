import java.util.ArrayList;

public class Solution367 {
    /*
     367. 有效的完全平方数
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
