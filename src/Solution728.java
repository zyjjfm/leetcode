import java.util.ArrayList;
import java.util.List;

public class Solution728 {
    
    // 728. 自除数 是指可以被它包含的每一位数整除的数。
    // 自除数 是指可以被它包含的每一位数整除的数。

    /**
         根据自除数的定义，如果一个整数不包含 000 且能被它包含的每一位数整除，则该整数是自除数。
        判断一个整数是否为自除数的方法是遍历整数的每一位，判断每一位数是否为 000 以及是否可以整除该整数。

        遍历整数的每一位的方法是，每次将当前整数对 101010 取模即可得到当前整数的最后一位，
        然后将整数除以 101010。重复该操作，直到当前整数变成 000 时即遍历了整数的每一位。
    */

   public List<Integer> selfDividingNumbers(int left, int right) {

    List<Integer> ans = new ArrayList<Integer>();

    for(int i = left;i <= right;i++){
        if(isSelfDividing(i)){
            ans.add(i);
        }
    }
    return ans;
    }

    public boolean isSelfDividing(int num){

        int temp = num;
    
        while(temp > 0){
            int digit = temp % 10;
            if(digit == 0 || num % digit != 0){
                return false;
            }
            temp /= 10;
        }
        return true;
    }

}
