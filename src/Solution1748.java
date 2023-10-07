import java.util.HashMap;
import java.util.Map;

public class Solution1748 {
    //唯一元素的和 
    public int sumOfUnique(int[] nums) {

        Map<Integer,Integer> cnt = new HashMap<Integer,Integer>();
        for(int num:nums){
            cnt.put(num,cnt.getOrDefault(num,0)+1);
        }
        int ans = 0;

        for(Map.Entry<Integer,Integer> entry:cnt.entrySet()){

            int num = entry.getKey(),c = entry.getValue();

            if(c == 1){
                ans += num;
            }
        }
        return ans;
    }
}






